package com.tocea.codewatch.architecture.generator.emf;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureExtension;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Datatype;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionEntity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Field;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Parameter;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Pattern;
import com.tocea.codewatch.architecture.dsl.architectureDSL.PrimitiveRole;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Role;
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference;
import com.tocea.codewatch.architecture.dsl.architectureDSL.util.ArchitectureDSLSwitch;

public class EmfExtensionGenerator implements IGenerator {

	private final static String MM_URI = "platform:/plugin/com.tocea.codewatch.architecture.mm/model/archi.ecore";
	private final static String MM_URI_WORKSPACE = "platform:/resource/com.tocea.codewatch.architecture.mm/model/archi.ecore";
	private final EPackage architectureModelPackage;
	private final EClass roleClass;
	private final EClass patternClass;

	public EmfExtensionGenerator() {
		this.architectureModelPackage = loadEcoreMetamodel(URI
				.createURI(MM_URI));
		if (this.architectureModelPackage == null) {
			loadEcoreMetamodel(URI.createURI(MM_URI_WORKSPACE));
		}
		if (this.architectureModelPackage != null) {
			this.roleClass = (EClass) this.architectureModelPackage
					.getESubpackages().get(0).getEClassifier("Role");
			this.patternClass = (EClass) this.architectureModelPackage
					.getESubpackages().get(0).getEClassifier("Pattern");
		} else {
			throw new RuntimeException(
					"Unable to find Architecture Metamodel ecore definition : "
							+ MM_URI);
		}
	}

	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		input.getURI();
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(input.getURI().path())).getProject();
		PropertiesHelper propertiesHelper = new PropertiesHelper(project);
		System.out.println("Generate EMF code");
		ArchitectureExtension extension = (ArchitectureExtension) input
				.getContents().get(0);

		EcoreAdapter adapter = new EcoreAdapter();

		EPackage p = adapter.adapt(extension);
		p.setNsURI(propertiesHelper.getExtensionURI(extension));
		p.setName(propertiesHelper.getName(extension));
		p.setNsPrefix(propertiesHelper.getPrefix(extension));
		serializeEcoreMetamodel(p, input.getURI().trimFileExtension()
				.appendFileExtension("ecore"));

	}

	public EPackage loadEcoreMetamodel(URI file) {
		ResourceSet rs = new ResourceSetImpl();

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new EcoreResourceFactoryImpl());
		Resource r = rs.createResource(file);
		try {
			r.load(null);
			return (EPackage) r.getContents().get(0);
		} catch (IOException e) {
			return null;
		}
	}

	public void serializeEcoreMetamodel(EPackage p, URI file) {
		ResourceSet rs = new ResourceSetImpl();

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new EcoreResourceFactoryImpl());
		Resource r = rs.createResource(file);
		r.getContents().add(p);
		try {
			r.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public class EcoreAdapter extends ArchitectureDSLSwitch<EObject> {
		private Map<EObject, EObject> ecoreMap = new HashMap<EObject, EObject>();
		private EPackage extensionPackage;

		@SuppressWarnings("unchecked")
		public <T extends EObject> T adapt(EObject _o) {
			EObject adapted = this.ecoreMap.get(_o);
			if (adapted == null) {
				adapted = doSwitch(_o);
				this.ecoreMap.put(_o, adapted);
			}
			return (T) adapted;
		}

		@Override
		public EObject caseArchitectureExtension(ArchitectureExtension object) {
			EPackage p = EcoreFactory.eINSTANCE.createEPackage();
			this.extensionPackage = p;
			for (ExtensionEntity e : object.getEntities()) {
				if (!(e instanceof PrimitiveRole)) {
					EClass built = adapt(e);
					if (built != null) {
						p.getEClassifiers().add(built);
					}
				}
			}
			return p;
		}

		private EGenericType type(TypeReference object){
			EGenericType gtype = EcoreFactory.eINSTANCE.createEGenericType();
			EClassifier classifier = adapt(object.getReference());
			gtype.setEClassifier(classifier);
			for(TypeReference t : object.getParameters()){
				EGenericType typearg = type(t);
				gtype.getETypeArguments().add(typearg);
			}
			return gtype;
		}
		
		@Override
		public EObject casePattern(Pattern object) {
			EClass _class = EcoreFactory.eINSTANCE.createEClass();
			_class.setName(object.getName());
			_class.setAbstract(object.isAbstract());
			if (object.getSuperPattern() != null) {
			
				if(object.getSuperPattern().getParameters().size()>0){
					_class.getEGenericSuperTypes().add(type(object.getSuperPattern()));
				}else{
					EClass superPattern = adapt(object.getSuperPattern());
					_class.getESuperTypes().add(superPattern);
				}
			} else {
				_class.getESuperTypes().add(patternClass);
			}
			

			initializeClassifier(object, _class);

			return _class;
		}

		@Override
		public EObject caseParameter(Parameter object) {
			ETypeParameter t = EcoreFactory.eINSTANCE.createETypeParameter();
			t.setName(object.getName());
			return t;
		}

		@Override
		public EObject casePrimitiveRole(PrimitiveRole object) {
			String[] split = object.getType().getQualifiedName().split("\\.");
			EClassifier eClassifier = architectureModelPackage
					.getEClassifier(split[split.length - 1]);
			return eClassifier;
		}

		@Override
		public EObject caseTypeReference(TypeReference object) {
			EClassifier classifier = adapt(object.getReference());

			return classifier;
		}

		@Override
		public EObject caseDatatype(Datatype object) {
			EClassifier eClassifier = this.extensionPackage
					.getEClassifier(object.getName());
			if (eClassifier == null) {
				EDataType dtype = EcoreFactory.eINSTANCE.createEDataType();
				dtype.setInstanceTypeName(object.getReference()
						.getQualifiedName());
				dtype.setName(object.getName());
				this.extensionPackage.getEClassifiers().add(dtype);
			}
			return eClassifier;
		}

		@Override
		public EObject caseField(Field object) {
			TypeReference type = object.getType();
			EStructuralFeature feature;
			if (type.getReference() instanceof Parameter) {
				feature = EcoreFactory.eINSTANCE.createEReference();
				ETypeParameter gtype = adapt(type.getReference());
				EGenericType typearg = EcoreFactory.eINSTANCE
						.createEGenericType();
				typearg.setETypeParameter(gtype);
				feature.setEGenericType(typearg);
			} else {
				EClassifier classifier = adapt(type);

				if (classifier instanceof EDataType) {
					feature = EcoreFactory.eINSTANCE.createEAttribute();
				} else {
					feature = EcoreFactory.eINSTANCE.createEReference();
				}
				feature.setEType(classifier);
			}
			if (object.isMany())
				feature.setUpperBound(-1);

			feature.setName(object.getName());
			return feature;
		}

		@Override
		public EObject caseRole(Role object) {
			EClass _class = EcoreFactory.eINSTANCE.createEClass();
			initializeClassifier(object, _class);
			if (object.getSuperRole() != null) {
				EClass superRole = adapt(object.getSuperRole());
				_class.getESuperTypes().add(superRole);
			} else {
				EGenericType supertype = EcoreFactory.eINSTANCE
						.createEGenericType();
				supertype.setEClassifier(roleClass);
				if (object.getElement() != null) {
					EGenericType typearg = EcoreFactory.eINSTANCE
							.createEGenericType();
					EClass adapt = adapt(object.getElement());
					typearg.setEClassifier(adapt);
					supertype.getETypeArguments().add(typearg);
				}
				_class.getEGenericSuperTypes().add(supertype);
			}
			return _class;
		}

		private void initializeClassifier(ParametrizedType object, EClass _class) {
			this.ecoreMap.put(object, _class);
			this.extensionPackage.getEClassifiers().add(_class);
			for (Parameter p : object.getParameters()) {
				ETypeParameter tp = adapt(p);
				_class.getETypeParameters().add(tp);
			}
			for (Field field : object.getFields()) {
				EStructuralFeature feature = adapt(field);
				_class.getEStructuralFeatures().add(feature);
			}

			_class.setName(object.getName());
			_class.setAbstract(object.isAbstract());
		}
	}

}
