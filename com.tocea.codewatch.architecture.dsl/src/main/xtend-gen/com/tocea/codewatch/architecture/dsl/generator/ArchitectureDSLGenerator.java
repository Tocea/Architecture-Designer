package com.tocea.codewatch.architecture.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.tocea.annotations.api.IAnnotationAttribute;
import com.tocea.annotations.api.IAnnotationType;
import com.tocea.annotations.factory.AnnotationsFactory;
import com.tocea.annotations.xml.AnnotationsXMLTools;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ArchitectureExtension;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ExtensionEntity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Field;
import com.tocea.codewatch.architecture.dsl.architectureDSL.NamedEntity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Parameter;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Pattern;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Relationship;
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Role;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Type;
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference;
import com.tocea.codewatch.architecture.dsl.generator.GeneratorHelper;
import com.tocea.codewatch.architecture.dsl.generator.PropertiesHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ArchitectureDSLGenerator implements IGenerator {
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private final AnnotationsFactory annotationsFactory = new Function0<AnnotationsFactory>() {
    public AnnotationsFactory apply() {
      AnnotationsFactory _annotationsFactory = new AnnotationsFactory();
      return _annotationsFactory;
    }
  }.apply();
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    IWorkspaceRoot _root = _workspace.getRoot();
    URI _uRI = resource.getURI();
    String _platformString = _uRI.toPlatformString(true);
    Path _path = new Path(_platformString);
    IFile _file = _root.getFile(_path);
    final IProject project = _file.getProject();
    PropertiesHelper _propertiesHelper = new PropertiesHelper(project);
    final PropertiesHelper propertiesHelper = _propertiesHelper;
    String _outputPath = propertiesHelper.getOutputPath();
    ((AbstractFileSystemAccess) fsa).setOutputPath(_outputPath);
    ArrayList<IAnnotationType> _arrayList = new ArrayList<IAnnotationType>();
    final ArrayList<IAnnotationType> annotationTypes = _arrayList;
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<ArchitectureExtension> _filter = Iterables.<ArchitectureExtension>filter(_iterable, ArchitectureExtension.class);
    for (final ArchitectureExtension architectureExtension : _filter) {
      {
        EList<ExtensionEntity> _entities = architectureExtension.getEntities();
        final Function1<ExtensionEntity,Boolean> _function = new Function1<ExtensionEntity,Boolean>() {
            public Boolean apply(final ExtensionEntity e) {
              boolean _or = false;
              if ((e instanceof ParametrizedType)) {
                _or = true;
              } else {
                _or = ((e instanceof ParametrizedType) || (e instanceof Relationship));
              }
              return Boolean.valueOf(_or);
            }
          };
        final Iterable<ExtensionEntity> entities = IterableExtensions.<ExtensionEntity>filter(_entities, _function);
        boolean _isEmpty = IterableExtensions.isEmpty(entities);
        boolean _not = (!_isEmpty);
        if (_not) {
          QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(architectureExtension);
          String _string = _fullyQualifiedName.toString("/");
          String _plus = (_string + "/");
          String _simpleName = this.getSimpleName(architectureExtension);
          String _plus_1 = (_plus + _simpleName);
          String _plus_2 = (_plus_1 + "Factory.java");
          CharSequence _compile = this.compile(architectureExtension);
          fsa.generateFile(_plus_2, _compile);
          for (final ExtensionEntity entity : entities) {
            {
              QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(entity);
              String _string_1 = _fullyQualifiedName_1.toString("/");
              String _plus_3 = (_string_1 + ".java");
              CharSequence _compile_1 = this.compile(entity);
              fsa.generateFile(_plus_3, _compile_1);
              if ((entity instanceof Role)) {
                IAnnotationType _annotationType = this.getAnnotationType(((Role) entity));
                annotationTypes.add(_annotationType);
              }
            }
          }
        }
      }
    }
    URI _uRI_1 = resource.getURI();
    URI _trimFileExtension = _uRI_1.trimFileExtension();
    String _lastSegment = _trimFileExtension.lastSegment();
    String[] _split = _lastSegment.split("/");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
    final String name = (_last + ".xml");
    IFile _annotationFile = propertiesHelper.getAnnotationFile(name);
    IPath _location = _annotationFile.getLocation();
    final File file = _location.toFile();
    AnnotationsXMLTools.serialize(file, ((IAnnotationType[]) ((IAnnotationType[])Conversions.unwrapArray(annotationTypes, IAnnotationType.class))));
  }
  
  protected CharSequence _compile(final ArchitectureExtension architectureExtension) {
    CharSequence _xblockexpression = null;
    {
      GeneratorHelper _generatorHelper = new GeneratorHelper(this._iQualifiedNameProvider);
      final GeneratorHelper helper = _generatorHelper;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class ");
      String _simpleName = this.getSimpleName(architectureExtension);
      _builder.append(_simpleName, "");
      _builder.append("Factory {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static final ");
      String _simpleName_1 = this.getSimpleName(architectureExtension);
      _builder.append(_simpleName_1, "	");
      _builder.append("Factory instance = new ");
      String _simpleName_2 = this.getSimpleName(architectureExtension);
      _builder.append(_simpleName_2, "	");
      _builder.append("Factory();");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<ExtensionEntity> _entities = architectureExtension.getEntities();
        final Function1<ExtensionEntity,Boolean> _function = new Function1<ExtensionEntity,Boolean>() {
            public Boolean apply(final ExtensionEntity e) {
              boolean _include = ArchitectureDSLGenerator.this.toInclude(e);
              return Boolean.valueOf(_include);
            }
          };
        Iterable<ExtensionEntity> _filter = IterableExtensions.<ExtensionEntity>filter(_entities, _function);
        for(final ExtensionEntity entity : _filter) {
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t");
          _builder.append(" ");
          _builder.append("* Creates an instance of {@link ");
          QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(entity);
          _builder.append(_fullyQualifiedName, "	 ");
          _builder.append(" <em>");
          String _name = ((NamedEntity) entity).getName();
          _builder.append(_name, "	 ");
          _builder.append("</em>}.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append(" ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public ");
          {
            boolean _and = false;
            if (!(entity instanceof ParametrizedType)) {
              _and = false;
            } else {
              EList<Parameter> _parameters = ((ParametrizedType) entity).getParameters();
              boolean _isEmpty = _parameters.isEmpty();
              boolean _not = (!_isEmpty);
              _and = ((entity instanceof ParametrizedType) && _not);
            }
            if (_and) {
              CharSequence _printParameters = helper.printParameters(((ParametrizedType) entity));
              _builder.append(_printParameters, "	");
              _builder.append(" ");
            }
          }
          CharSequence _printDeclaration = helper.printDeclaration(entity);
          _builder.append(_printDeclaration, "	");
          _builder.append(" create");
          String _name_1 = ((NamedEntity) entity).getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name_1);
          _builder.append(_firstUpper, "	");
          _builder.append("() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return new ");
          CharSequence _printDeclaration_1 = helper.printDeclaration(entity);
          _builder.append(_printDeclaration_1, "		");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      CharSequence res = _builder;
      QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(architectureExtension);
      String _plus = ("package " + _fullyQualifiedName_1);
      String _plus_1 = (_plus + ";\n");
      CharSequence _printImports = helper.printImports();
      String _plus_2 = (_plus_1 + _printImports);
      String _plus_3 = (_plus_2 + "\n");
      String _plus_4 = (_plus_3 + res);
      res = _plus_4;
      _xblockexpression = (res);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compile(final Pattern pattern) {
    String _xblockexpression = null;
    {
      GeneratorHelper _generatorHelper = new GeneratorHelper(this._iQualifiedNameProvider);
      final GeneratorHelper helper = _generatorHelper;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _printDocumentation = helper.printDocumentation(pattern);
      _builder.append(_printDocumentation, "");
      _builder.newLineIfNotEmpty();
      _builder.append("public ");
      {
        boolean _isAbstract = pattern.isAbstract();
        if (_isAbstract) {
          _builder.append("abstract ");
        }
      }
      _builder.append("class ");
      CharSequence _printDeclaration = helper.printDeclaration(pattern);
      _builder.append(_printDeclaration, "");
      _builder.append(" extends ");
      {
        TypeReference _superPattern = pattern.getSuperPattern();
        boolean _equals = Objects.equal(_superPattern, null);
        if (_equals) {
          Object _print = helper.print(GeneratorHelper.ABSTRACT_PATTERN);
          _builder.append(_print, "");
        } else {
          TypeReference _superPattern_1 = pattern.getSuperPattern();
          Object _print_1 = helper.print(_superPattern_1);
          _builder.append(_print_1, "");
        }
      }
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Field> _fields = pattern.getFields();
        for(final Field field : _fields) {
          _builder.append("\t");
          Object _print_2 = helper.print(field);
          _builder.append(_print_2, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<Field> _fields_1 = pattern.getFields();
        for(final Field field_1 : _fields_1) {
          _builder.append("\t");
          CharSequence _printAccessors = helper.printAccessors(field_1);
          _builder.append(_printAccessors, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      CharSequence res = _builder;
      EObject _eContainer = pattern.eContainer();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
      String _plus = ("package " + _fullyQualifiedName);
      String _plus_1 = (_plus + ";\n");
      CharSequence _printImports = helper.printImports();
      String _plus_2 = (_plus_1 + _printImports);
      String _plus_3 = (_plus_2 + "\n");
      String _plus_4 = (_plus_3 + res);
      res = _plus_4;
      String _string = res.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compile(final Role role) {
    CharSequence _xblockexpression = null;
    {
      GeneratorHelper _generatorHelper = new GeneratorHelper(this._iQualifiedNameProvider);
      final GeneratorHelper helper = _generatorHelper;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _printDocumentation = helper.printDocumentation(role);
      _builder.append(_printDocumentation, "");
      _builder.newLineIfNotEmpty();
      _builder.append("public ");
      {
        boolean _isAbstract = role.isAbstract();
        if (_isAbstract) {
          _builder.append("abstract ");
        }
      }
      _builder.append("class ");
      CharSequence _printDeclaration = helper.printDeclaration(role);
      _builder.append(_printDeclaration, "");
      _builder.append(" extends ");
      {
        TypeReference _superRole = role.getSuperRole();
        boolean _equals = Objects.equal(_superRole, null);
        if (_equals) {
          Object _print = helper.print(GeneratorHelper.ABSTRACT_ROLE);
          _builder.append(_print, "");
        } else {
          TypeReference _superRole_1 = role.getSuperRole();
          Object _print_1 = helper.print(_superRole_1);
          _builder.append(_print_1, "");
        }
      }
      _builder.append("<");
      {
        Type _element = role.getElement();
        boolean _equals_1 = Objects.equal(_element, null);
        if (_equals_1) {
          Object _print_2 = helper.print(GeneratorHelper.ANALYSED_ELEMENT);
          _builder.append(_print_2, "");
        } else {
          Type _element_1 = role.getElement();
          Object _print_3 = helper.print(_element_1);
          _builder.append(_print_3, "");
        }
      }
      _builder.append("> {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Field> _fields = role.getFields();
        for(final Field field : _fields) {
          _builder.append("\t");
          Object _print_4 = helper.print(field);
          _builder.append(_print_4, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<Field> _fields_1 = role.getFields();
        for(final Field field_1 : _fields_1) {
          _builder.append("\t");
          CharSequence _printAccessors = helper.printAccessors(field_1);
          _builder.append(_printAccessors, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      CharSequence res = _builder;
      EObject _eContainer = role.eContainer();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
      String _plus = ("package " + _fullyQualifiedName);
      String _plus_1 = (_plus + ";\n");
      CharSequence _printImports = helper.printImports();
      String _plus_2 = (_plus_1 + _printImports);
      String _plus_3 = (_plus_2 + "\n");
      String _plus_4 = (_plus_3 + res);
      res = _plus_4;
      _xblockexpression = (res);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compile(final Relationship relationship) {
    CharSequence _xblockexpression = null;
    {
      GeneratorHelper _generatorHelper = new GeneratorHelper(this._iQualifiedNameProvider);
      final GeneratorHelper helper = _generatorHelper;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _printDocumentation = helper.printDocumentation(relationship);
      _builder.append(_printDocumentation, "");
      _builder.newLineIfNotEmpty();
      _builder.append("public ");
      {
        boolean _isAbstract = relationship.isAbstract();
        if (_isAbstract) {
          _builder.append("abstract ");
        }
      }
      _builder.append("class ");
      CharSequence _printDeclaration = helper.printDeclaration(relationship);
      _builder.append(_printDeclaration, "");
      _builder.append(" extends ");
      {
        Relationship _superRelationship = relationship.getSuperRelationship();
        boolean _equals = Objects.equal(_superRelationship, null);
        if (_equals) {
          Object _print = helper.print(GeneratorHelper.ABSTRACT_EXTENSION_RELATIONSHIP);
          _builder.append(_print, "");
        } else {
          Relationship _superRelationship_1 = relationship.getSuperRelationship();
          Object _print_1 = helper.print(_superRelationship_1);
          _builder.append(_print_1, "");
        }
      }
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      {
        EList<Field> _fields = relationship.getFields();
        for(final Field field : _fields) {
          _builder.append("\t");
          Object _print_2 = helper.print(field);
          _builder.append(_print_2, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<Field> _fields_1 = relationship.getFields();
        for(final Field field_1 : _fields_1) {
          _builder.append("\t");
          CharSequence _printAccessors = helper.printAccessors(field_1);
          _builder.append(_printAccessors, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        EList<RelationshipConstraint> _constraints = relationship.getConstraints();
        int _size = _constraints.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          _builder.append("\t");
          _builder.append("private static final ");
          Object _print_3 = helper.print(GeneratorHelper.IRELATIONSHIP_CONSTRAINT);
          _builder.append(_print_3, "	");
          _builder.append(" _constraint = ");
          EList<RelationshipConstraint> _constraints_1 = relationship.getConstraints();
          Object _print_4 = helper.print(_constraints_1);
          _builder.append(_print_4, "	");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public boolean checkConstraint() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return ");
          {
            Relationship _superRelationship_2 = relationship.getSuperRelationship();
            boolean _notEquals = (!Objects.equal(_superRelationship_2, null));
            if (_notEquals) {
              _builder.append("super.checkConstraint() && ");
            }
          }
          _builder.append("_constraint.check(this);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
        }
      }
      _builder.append("}");
      _builder.newLine();
      CharSequence res = _builder;
      EObject _eContainer = relationship.eContainer();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
      String _plus = ("package " + _fullyQualifiedName);
      String _plus_1 = (_plus + ";\n");
      CharSequence _printImports = helper.printImports();
      String _plus_2 = (_plus_1 + _printImports);
      String _plus_3 = (_plus_2 + "\n");
      String _plus_4 = (_plus_3 + res);
      res = _plus_4;
      _xblockexpression = (res);
    }
    return _xblockexpression;
  }
  
  protected boolean _toInclude(final ExtensionEntity entity) {
    return false;
  }
  
  protected boolean _toInclude(final Pattern pattern) {
    boolean _isAbstract = pattern.isAbstract();
    boolean _not = (!_isAbstract);
    return _not;
  }
  
  protected boolean _toInclude(final Role role) {
    boolean _isAbstract = role.isAbstract();
    boolean _not = (!_isAbstract);
    return _not;
  }
  
  protected boolean _toInclude(final Relationship relationship) {
    boolean _isAbstract = relationship.isAbstract();
    boolean _not = (!_isAbstract);
    return _not;
  }
  
  public String getSimpleName(final ArchitectureExtension architectureExtension) {
    String _name = architectureExtension.getName();
    String[] _split = _name.split("\\.");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
    String _firstUpper = StringExtensions.toFirstUpper(_last);
    return _firstUpper;
  }
  
  public IAnnotationType getAnnotationType(final Role role) {
    IAnnotationType _xblockexpression = null;
    {
      String _name = role.getName();
      final IAnnotationType annotationType = this.annotationsFactory.newAnnotationType(_name);
      EList<Field> _fields = role.getFields();
      for (final Field field : _fields) {
        List<IAnnotationAttribute> _attributes = annotationType.getAttributes();
        IAnnotationAttribute _annotationAttribute = this.getAnnotationAttribute(field);
        _attributes.add(_annotationAttribute);
      }
      _xblockexpression = (annotationType);
    }
    return _xblockexpression;
  }
  
  public IAnnotationAttribute getAnnotationAttribute(final Field field) {
    String _name = field.getName();
    boolean _isMany = field.isMany();
    IAnnotationAttribute _newAnnotationAttribute = this.annotationsFactory.newAnnotationAttribute(_name, _isMany);
    return _newAnnotationAttribute;
  }
  
  public CharSequence compile(final EObject pattern) {
    if (pattern instanceof Pattern) {
      return _compile((Pattern)pattern);
    } else if (pattern instanceof Role) {
      return _compile((Role)pattern);
    } else if (pattern instanceof Relationship) {
      return _compile((Relationship)pattern);
    } else if (pattern instanceof ArchitectureExtension) {
      return _compile((ArchitectureExtension)pattern);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(pattern).toString());
    }
  }
  
  public boolean toInclude(final ExtensionEntity pattern) {
    if (pattern instanceof Pattern) {
      return _toInclude((Pattern)pattern);
    } else if (pattern instanceof Role) {
      return _toInclude((Role)pattern);
    } else if (pattern instanceof Relationship) {
      return _toInclude((Relationship)pattern);
    } else if (pattern != null) {
      return _toInclude(pattern);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(pattern).toString());
    }
  }
}
