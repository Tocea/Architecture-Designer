package com.tocea.codewatch.architecture.xml;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.tocea.codewatch.architecture.core.ArchitectureFile;
import com.tocea.codewatch.architecture.core.CallRelationship;
import com.tocea.codewatch.architecture.core.DeclaredType;
import com.tocea.codewatch.architecture.core.Field;
import com.tocea.codewatch.architecture.core.FieldReferenceDependency;
import com.tocea.codewatch.architecture.core.ImportReferenceDependency;
import com.tocea.codewatch.architecture.core.InheritanceDependency;
import com.tocea.codewatch.architecture.core.InjectionDependency;
import com.tocea.codewatch.architecture.core.Library;
import com.tocea.codewatch.architecture.core.Method;
import com.tocea.codewatch.architecture.core.ParameterRelationship;
import com.tocea.codewatch.architecture.core.Project;
import com.tocea.codewatch.architecture.core.ReferenceDependency;
import com.tocea.codewatch.architecture.core.ReturnTypeRelationship;
import com.tocea.codewatch.architecture.core.RuntimeDependency;
import com.tocea.codewatch.architecture.core.Type;
import com.tocea.codewatch.architecture.core.api.IAnalysedElement;
import com.tocea.codewatch.architecture.core.api.IArchitectureFile;
import com.tocea.codewatch.architecture.core.api.ICallRelationship;
import com.tocea.codewatch.architecture.core.api.IDeclaredType;
import com.tocea.codewatch.architecture.core.api.IDependency;
import com.tocea.codewatch.architecture.core.api.IField;
import com.tocea.codewatch.architecture.core.api.IFieldReferenceDependency;
import com.tocea.codewatch.architecture.core.api.IImportReferenceDependency;
import com.tocea.codewatch.architecture.core.api.IInheritanceDependency;
import com.tocea.codewatch.architecture.core.api.IInjectionDependency;
import com.tocea.codewatch.architecture.core.api.ILibrary;
import com.tocea.codewatch.architecture.core.api.IMethod;
import com.tocea.codewatch.architecture.core.api.IParameterRelationship;
import com.tocea.codewatch.architecture.core.api.IProject;
import com.tocea.codewatch.architecture.core.api.IReferenceDependency;
import com.tocea.codewatch.architecture.core.api.IRelationship;
import com.tocea.codewatch.architecture.core.api.IReturnTypeRelationship;
import com.tocea.codewatch.architecture.core.api.IRuntimeDependency;
import com.tocea.codewatch.architecture.core.api.IType;
import com.tocea.codewatch.architecture.tools.ArchitectureFunction;
	    
	    
@SuppressWarnings("unused")
public class ArchitectureXMLTools
{
	private void serialize(File file, FlatAnalysedElement... _objects) throws FileNotFoundException, JAXBException {
	    
	    FlatAnalysedElementElements serialized = new FlatAnalysedElementElements();
	    for (FlatAnalysedElement flatAnalysedElement : _objects) {
	        serialized.elements.add(flatAnalysedElement);
	    }
	    
	    JAXBContext jc = JAXBContext.newInstance(FlatAnalysedElementElements.class);
	    Marshaller marshaller = jc.createMarshaller();
	   	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(serialized, file);
	}
	public static void serialize(File file,IAnalysedElement... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatAnalysedElement flatten[] = new FlatAnalysedElement [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatAnalysedElement (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IType... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatAnalysedElement flatten[] = new FlatAnalysedElement [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatAnalysedElement (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IArchitectureFile... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatAnalysedElement flatten[] = new FlatAnalysedElement [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatAnalysedElement (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,ILibrary... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatAnalysedElement flatten[] = new FlatAnalysedElement [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatAnalysedElement (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IProject... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatAnalysedElement flatten[] = new FlatAnalysedElement [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatAnalysedElement (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IMethod... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatAnalysedElement flatten[] = new FlatAnalysedElement [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatAnalysedElement (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IField... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatAnalysedElement flatten[] = new FlatAnalysedElement [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatAnalysedElement (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	@XmlRootElement
	@XmlType(namespace="/architecture")
	private static class FlatAnalysedElement
	{
	    private String	_AnalysedElementName ;
	    
	    @XmlAttribute
	    public String getAnalysedElementName() {
	        return this._AnalysedElementName;
	    }
	    public void setAnalysedElementName(String _name) {
	        this._AnalysedElementName = _name;
	    }
	    private Integer	_AnalysedElementIdAnalyzedElement ;
	    
	    @XmlAttribute
	    public Integer getAnalysedElementIdAnalyzedElement() {
	        return this._AnalysedElementIdAnalyzedElement;
	    }
	    public void setAnalysedElementIdAnalyzedElement(Integer _idAnalyzedElement) {
	        this._AnalysedElementIdAnalyzedElement = _idAnalyzedElement;
	    }
	    private Integer	_AnalysedElementProperties ;
	    
	    @XmlAttribute
	    public Integer getAnalysedElementProperties() {
	        return this._AnalysedElementProperties;
	    }
	    public void setAnalysedElementProperties(Integer _properties) {
	        this._AnalysedElementProperties = _properties;
	    }
	    private String	_TypeQualifiedName ;
	    
	    @XmlAttribute
	    public String getTypeQualifiedName() {
	        return this._TypeQualifiedName;
	    }
	    public void setTypeQualifiedName(String _qualifiedName) {
	        this._TypeQualifiedName = _qualifiedName;
	    }
	    private Boolean	_TypeSource ;
	    
	    @XmlAttribute
	    public Boolean getTypeSource() {
	        return this._TypeSource;
	    }
	    public void setTypeSource(Boolean _source) {
	        this._TypeSource = _source;
	    }
	    private Boolean	_TypeBinary ;
	    
	    @XmlAttribute
	    public Boolean getTypeBinary() {
	        return this._TypeBinary;
	    }
	    public void setTypeBinary(Boolean _binary) {
	        this._TypeBinary = _binary;
	    }
	    private String	_ArchitectureFilePath ;
	    
	    @XmlAttribute
	    public String getArchitectureFilePath() {
	        return this._ArchitectureFilePath;
	    }
	    public void setArchitectureFilePath(String _path) {
	        this._ArchitectureFilePath = _path;
	    }
	    private FlatRelationshipContainmentList	_AnalysedElementOutgoingRelationships ;
	    
	    public FlatRelationshipContainmentList getAnalysedElementOutgoingRelationships() {
	        return this._AnalysedElementOutgoingRelationships;
	    }
	    public void setAnalysedElementOutgoingRelationships(FlatRelationshipContainmentList _outgoingRelationships) {
	        this._AnalysedElementOutgoingRelationships = _outgoingRelationships;
	    }
	    private FlatRelationshipReferenceList	_AnalysedElementIncomingRelationships ;
	    
	    public FlatRelationshipReferenceList getAnalysedElementIncomingRelationships() {
	        return this._AnalysedElementIncomingRelationships;
	    }
	    public void setAnalysedElementIncomingRelationships(FlatRelationshipReferenceList _incomingRelationships) {
	        this._AnalysedElementIncomingRelationships = _incomingRelationships;
	    }
	    private FlatAnalysedElementContainmentList	_AnalysedElementContainedElements ;
	    
	    public FlatAnalysedElementContainmentList getAnalysedElementContainedElements() {
	        return this._AnalysedElementContainedElements;
	    }
	    public void setAnalysedElementContainedElements(FlatAnalysedElementContainmentList _containedElements) {
	        this._AnalysedElementContainedElements = _containedElements;
	    }
	    private Integer	_AnalysedElementParent ;
	    
	    public Integer getAnalysedElementParent() {
	        return this._AnalysedElementParent;
	    }
	    public void setAnalysedElementParent(Integer _parent) {
	        this._AnalysedElementParent = _parent;
	    }
	
	    private int flatID;
	    
	    @XmlAttribute
	    public int getFlatID() {
	        return flatID;
	    }
	    
	    
	    public void setFlatID(int flatID) {
	        this.flatID = flatID;
	    }
	    
	    private int flatType;
	    @XmlAttribute
	    public int getFlatType() {
	        return flatType;
	    }
	    
	    
	    public void setFlatType(int flatType) {
	        this.flatType = flatType;
	    }
	}
	
	
	@XmlRootElement
	@XmlType(namespace="/architecture")
	private static class FlatAnalysedElementElements
	{
	    
	    private List<FlatAnalysedElement> elements= new ArrayList<FlatAnalysedElement>();
	    
	    public List<FlatAnalysedElement> getElements() {
	        return elements;
	    }
	
	    public void setElements(List<FlatAnalysedElement> elements) {
	        this.elements = elements;
	    }
	}
	
	private static class FlatAnalysedElementContainmentList
	{
	    private List<FlatAnalysedElement> values = new ArrayList<FlatAnalysedElement>();
	
	    public List<FlatAnalysedElement> getValues() {
	        return values;
	    }
	    
	    public void setValues(List<FlatAnalysedElement> values) {
	        this.values = values;
	    }
	}
	private static class FlatAnalysedElementReferenceList
	{
	    private List<Integer> values = new ArrayList<Integer>();;
	
	    public List<Integer> getValues() {
	        return values;
	    }
	    
	    public void setValues(List<Integer> values) {
	        this.values = values;
	    }
	}
	 
	private void serialize(File file, FlatRelationship... _objects) throws FileNotFoundException, JAXBException {
	    
	    FlatRelationshipElements serialized = new FlatRelationshipElements();
	    for (FlatRelationship flatRelationship : _objects) {
	        serialized.elements.add(flatRelationship);
	    }
	    
	    JAXBContext jc = JAXBContext.newInstance(FlatRelationshipElements.class);
	    Marshaller marshaller = jc.createMarshaller();
	   	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(serialized, file);
	}
	public static void serialize(File file,IRelationship... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IInheritanceDependency... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IReferenceDependency... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IDependency... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IRuntimeDependency... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IInjectionDependency... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IFieldReferenceDependency... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IImportReferenceDependency... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IReturnTypeRelationship... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IParameterRelationship... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,ICallRelationship... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	public static void serialize(File file,IDeclaredType... elements){
		ArchitectureXMLTools xml = new ArchitectureXMLTools();
		ArchitectureFlattener flattener = new ArchitectureFlattener();
		FlatRelationship flatten[] = new FlatRelationship [elements.length];
		for (int i = 0; i < flatten.length; i++) {
			flatten[i] = flattener.getFlatRelationship (elements[i]);
		}
		try {
			xml.serialize(file, flatten);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	@XmlRootElement
	@XmlType(namespace="/architecture")
	private static class FlatRelationship
	{
	    private Integer	_RelationshipRelationShipId ;
	    
	    @XmlAttribute
	    public Integer getRelationshipRelationShipId() {
	        return this._RelationshipRelationShipId;
	    }
	    public void setRelationshipRelationShipId(Integer _relationShipId) {
	        this._RelationshipRelationShipId = _relationShipId;
	    }
	    private String	_ReferenceDependencyUri ;
	    
	    @XmlAttribute
	    public String getReferenceDependencyUri() {
	        return this._ReferenceDependencyUri;
	    }
	    public void setReferenceDependencyUri(String _uri) {
	        this._ReferenceDependencyUri = _uri;
	    }
	    private String	_ReferenceDependencyName ;
	    
	    @XmlAttribute
	    public String getReferenceDependencyName() {
	        return this._ReferenceDependencyName;
	    }
	    public void setReferenceDependencyName(String _name) {
	        this._ReferenceDependencyName = _name;
	    }
	    private Integer	_RelationshipTarget ;
	    
	    public Integer getRelationshipTarget() {
	        return this._RelationshipTarget;
	    }
	    public void setRelationshipTarget(Integer _target) {
	        this._RelationshipTarget = _target;
	    }
	    private Integer	_RelationshipSource ;
	    
	    public Integer getRelationshipSource() {
	        return this._RelationshipSource;
	    }
	    public void setRelationshipSource(Integer _source) {
	        this._RelationshipSource = _source;
	    }
	    private Integer	_InjectionDependencyMapping ;
	    
	    public Integer getInjectionDependencyMapping() {
	        return this._InjectionDependencyMapping;
	    }
	    public void setInjectionDependencyMapping(Integer _mapping) {
	        this._InjectionDependencyMapping = _mapping;
	    }
	
	    private int flatID;
	    
	    @XmlAttribute
	    public int getFlatID() {
	        return flatID;
	    }
	    
	    
	    public void setFlatID(int flatID) {
	        this.flatID = flatID;
	    }
	    
	    private int flatType;
	    @XmlAttribute
	    public int getFlatType() {
	        return flatType;
	    }
	    
	    
	    public void setFlatType(int flatType) {
	        this.flatType = flatType;
	    }
	}
	
	
	@XmlRootElement
	@XmlType(namespace="/architecture")
	private static class FlatRelationshipElements
	{
	    
	    private List<FlatRelationship> elements= new ArrayList<FlatRelationship>();
	    
	    public List<FlatRelationship> getElements() {
	        return elements;
	    }
	
	    public void setElements(List<FlatRelationship> elements) {
	        this.elements = elements;
	    }
	}
	
	private static class FlatRelationshipContainmentList
	{
	    private List<FlatRelationship> values = new ArrayList<FlatRelationship>();
	
	    public List<FlatRelationship> getValues() {
	        return values;
	    }
	    
	    public void setValues(List<FlatRelationship> values) {
	        this.values = values;
	    }
	}
	private static class FlatRelationshipReferenceList
	{
	    private List<Integer> values = new ArrayList<Integer>();;
	
	    public List<Integer> getValues() {
	        return values;
	    }
	    
	    public void setValues(List<Integer> values) {
	        this.values = values;
	    }
	}
	 
  	    
    
    private static class ArchitectureFlattener {
    	
    	private Map<Integer, FlatAnalysedElement> flatAnalysedElementIDMap = new HashMap<Integer, FlatAnalysedElement>();
    	
    	private final static int ANALYSEDELEMENT_TYPE = 0 ;
    	private Map<IAnalysedElement, FlatAnalysedElement> analysedElementFlatMap = new HashMap<IAnalysedElement, FlatAnalysedElement>();
    	private final static int TYPE_TYPE = 1 ;
    	private Map<IType, FlatAnalysedElement> typeFlatMap = new HashMap<IType, FlatAnalysedElement>();
    	private final static int ARCHITECTUREFILE_TYPE = 2 ;
    	private Map<IArchitectureFile, FlatAnalysedElement> architectureFileFlatMap = new HashMap<IArchitectureFile, FlatAnalysedElement>();
    	private final static int LIBRARY_TYPE = 3 ;
    	private Map<ILibrary, FlatAnalysedElement> libraryFlatMap = new HashMap<ILibrary, FlatAnalysedElement>();
    	private final static int PROJECT_TYPE = 4 ;
    	private Map<IProject, FlatAnalysedElement> projectFlatMap = new HashMap<IProject, FlatAnalysedElement>();
    	private final static int METHOD_TYPE = 5 ;
    	private Map<IMethod, FlatAnalysedElement> methodFlatMap = new HashMap<IMethod, FlatAnalysedElement>();
    	private final static int FIELD_TYPE = 6 ;
    	private Map<IField, FlatAnalysedElement> fieldFlatMap = new HashMap<IField, FlatAnalysedElement>();
private class FlatAnalysedElementBuilder extends ArchitectureFunction<FlatAnalysedElement>{
@Override
protected FlatAnalysedElement evaluateAnalysedElement(IAnalysedElement _o, Object... args) {
	FlatAnalysedElement  flatAnalysedElement  = new FlatAnalysedElement();
	// Initialize flatten type
	flatAnalysedElement.setFlatType(ANALYSEDELEMENT_TYPE);
	int flatid = flatAnalysedElementIDMap.size();
    		 	flatAnalysedElement.setFlatID(flatid);
    		 	flatAnalysedElementIDMap.put(flatid, flatAnalysedElement);
	//set all the attributes
    		 	if(_o.getName()!=null){
    		 		flatAnalysedElement .setAnalysedElementName(_o.getName());
    		 	}
    		 		flatAnalysedElement .setAnalysedElementIdAnalyzedElement(_o.getIdAnalyzedElement());
    		 		flatAnalysedElement .setAnalysedElementProperties(_o.getProperties());
    		 	
    		 	//Set the outgoingRelationships reference
    		 	if(_o.getOutgoingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementOutgoingRelationships(new FlatRelationshipContainmentList());
    		 	}
				for(IRelationship e: _o.getOutgoingRelationships()){
                    FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementOutgoingRelationships().getValues().add(flatReference);
				}
                	    	
    		 	//Set the incomingRelationships reference
    		 	if(_o.getIncomingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementIncomingRelationships(new FlatRelationshipReferenceList());
    		 	}
				for(IRelationship e: _o.getIncomingRelationships()){
                	FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementIncomingRelationships().getValues().add(flatReference.getFlatID());
				}
	    	
    		 	//Set the containedElements reference
    		 	if(_o.getContainedElements().size()>0){
    		 		flatAnalysedElement.setAnalysedElementContainedElements(new FlatAnalysedElementContainmentList());
    		 	}
				for(IAnalysedElement e: _o.getContainedElements()){
                    FlatAnalysedElement flatReference = getFlatAnalysedElement(e);
					flatAnalysedElement .getAnalysedElementContainedElements().getValues().add(flatReference);
				}
                	    	
    		 	//Set the parent reference
				{ 
					if(_o.getParent()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getParent());
						flatAnalysedElement .setAnalysedElementParent(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatAnalysedElement; 
}
		
		
    	

@Override
protected FlatAnalysedElement evaluateType(IType _o, Object... args) {
	FlatAnalysedElement  flatAnalysedElement  = new FlatAnalysedElement();
	// Initialize flatten type
	flatAnalysedElement.setFlatType(TYPE_TYPE);
	int flatid = flatAnalysedElementIDMap.size();
    		 	flatAnalysedElement.setFlatID(flatid);
    		 	flatAnalysedElementIDMap.put(flatid, flatAnalysedElement);
	//set all the attributes
    		 	if(_o.getName()!=null){
    		 		flatAnalysedElement .setAnalysedElementName(_o.getName());
    		 	}
    		 		flatAnalysedElement .setAnalysedElementIdAnalyzedElement(_o.getIdAnalyzedElement());
    		 		flatAnalysedElement .setAnalysedElementProperties(_o.getProperties());
    		 	if(_o.getQualifiedName()!=null){
    		 		flatAnalysedElement .setTypeQualifiedName(_o.getQualifiedName());
    		 	}
    		 		flatAnalysedElement .setTypeSource(_o.isSource());
    		 		flatAnalysedElement .setTypeBinary(_o.isBinary());
    		 	
    		 	//Set the outgoingRelationships reference
    		 	if(_o.getOutgoingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementOutgoingRelationships(new FlatRelationshipContainmentList());
    		 	}
				for(IRelationship e: _o.getOutgoingRelationships()){
                    FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementOutgoingRelationships().getValues().add(flatReference);
				}
                	    	
    		 	//Set the incomingRelationships reference
    		 	if(_o.getIncomingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementIncomingRelationships(new FlatRelationshipReferenceList());
    		 	}
				for(IRelationship e: _o.getIncomingRelationships()){
                	FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementIncomingRelationships().getValues().add(flatReference.getFlatID());
				}
	    	
    		 	//Set the containedElements reference
    		 	if(_o.getContainedElements().size()>0){
    		 		flatAnalysedElement.setAnalysedElementContainedElements(new FlatAnalysedElementContainmentList());
    		 	}
				for(IAnalysedElement e: _o.getContainedElements()){
                    FlatAnalysedElement flatReference = getFlatAnalysedElement(e);
					flatAnalysedElement .getAnalysedElementContainedElements().getValues().add(flatReference);
				}
                	    	
    		 	//Set the parent reference
				{ 
					if(_o.getParent()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getParent());
						flatAnalysedElement .setAnalysedElementParent(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatAnalysedElement; 
}
		
		
    	

@Override
protected FlatAnalysedElement evaluateArchitectureFile(IArchitectureFile _o, Object... args) {
	FlatAnalysedElement  flatAnalysedElement  = new FlatAnalysedElement();
	// Initialize flatten type
	flatAnalysedElement.setFlatType(ARCHITECTUREFILE_TYPE);
	int flatid = flatAnalysedElementIDMap.size();
    		 	flatAnalysedElement.setFlatID(flatid);
    		 	flatAnalysedElementIDMap.put(flatid, flatAnalysedElement);
	//set all the attributes
    		 	if(_o.getName()!=null){
    		 		flatAnalysedElement .setAnalysedElementName(_o.getName());
    		 	}
    		 		flatAnalysedElement .setAnalysedElementIdAnalyzedElement(_o.getIdAnalyzedElement());
    		 		flatAnalysedElement .setAnalysedElementProperties(_o.getProperties());
    		 	if(_o.getPath()!=null){
    		 		flatAnalysedElement .setArchitectureFilePath(_o.getPath());
    		 	}
    		 	
    		 	//Set the outgoingRelationships reference
    		 	if(_o.getOutgoingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementOutgoingRelationships(new FlatRelationshipContainmentList());
    		 	}
				for(IRelationship e: _o.getOutgoingRelationships()){
                    FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementOutgoingRelationships().getValues().add(flatReference);
				}
                	    	
    		 	//Set the incomingRelationships reference
    		 	if(_o.getIncomingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementIncomingRelationships(new FlatRelationshipReferenceList());
    		 	}
				for(IRelationship e: _o.getIncomingRelationships()){
                	FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementIncomingRelationships().getValues().add(flatReference.getFlatID());
				}
	    	
    		 	//Set the containedElements reference
    		 	if(_o.getContainedElements().size()>0){
    		 		flatAnalysedElement.setAnalysedElementContainedElements(new FlatAnalysedElementContainmentList());
    		 	}
				for(IAnalysedElement e: _o.getContainedElements()){
                    FlatAnalysedElement flatReference = getFlatAnalysedElement(e);
					flatAnalysedElement .getAnalysedElementContainedElements().getValues().add(flatReference);
				}
                	    	
    		 	//Set the parent reference
				{ 
					if(_o.getParent()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getParent());
						flatAnalysedElement .setAnalysedElementParent(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatAnalysedElement; 
}
		
		
    	

@Override
protected FlatAnalysedElement evaluateLibrary(ILibrary _o, Object... args) {
	FlatAnalysedElement  flatAnalysedElement  = new FlatAnalysedElement();
	// Initialize flatten type
	flatAnalysedElement.setFlatType(LIBRARY_TYPE);
	int flatid = flatAnalysedElementIDMap.size();
    		 	flatAnalysedElement.setFlatID(flatid);
    		 	flatAnalysedElementIDMap.put(flatid, flatAnalysedElement);
	//set all the attributes
    		 	if(_o.getName()!=null){
    		 		flatAnalysedElement .setAnalysedElementName(_o.getName());
    		 	}
    		 		flatAnalysedElement .setAnalysedElementIdAnalyzedElement(_o.getIdAnalyzedElement());
    		 		flatAnalysedElement .setAnalysedElementProperties(_o.getProperties());
    		 	
    		 	//Set the outgoingRelationships reference
    		 	if(_o.getOutgoingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementOutgoingRelationships(new FlatRelationshipContainmentList());
    		 	}
				for(IRelationship e: _o.getOutgoingRelationships()){
                    FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementOutgoingRelationships().getValues().add(flatReference);
				}
                	    	
    		 	//Set the incomingRelationships reference
    		 	if(_o.getIncomingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementIncomingRelationships(new FlatRelationshipReferenceList());
    		 	}
				for(IRelationship e: _o.getIncomingRelationships()){
                	FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementIncomingRelationships().getValues().add(flatReference.getFlatID());
				}
	    	
    		 	//Set the containedElements reference
    		 	if(_o.getContainedElements().size()>0){
    		 		flatAnalysedElement.setAnalysedElementContainedElements(new FlatAnalysedElementContainmentList());
    		 	}
				for(IAnalysedElement e: _o.getContainedElements()){
                    FlatAnalysedElement flatReference = getFlatAnalysedElement(e);
					flatAnalysedElement .getAnalysedElementContainedElements().getValues().add(flatReference);
				}
                	    	
    		 	//Set the parent reference
				{ 
					if(_o.getParent()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getParent());
						flatAnalysedElement .setAnalysedElementParent(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatAnalysedElement; 
}
		
		
    	

@Override
protected FlatAnalysedElement evaluateProject(IProject _o, Object... args) {
	FlatAnalysedElement  flatAnalysedElement  = new FlatAnalysedElement();
	// Initialize flatten type
	flatAnalysedElement.setFlatType(PROJECT_TYPE);
	int flatid = flatAnalysedElementIDMap.size();
    		 	flatAnalysedElement.setFlatID(flatid);
    		 	flatAnalysedElementIDMap.put(flatid, flatAnalysedElement);
	//set all the attributes
    		 	if(_o.getName()!=null){
    		 		flatAnalysedElement .setAnalysedElementName(_o.getName());
    		 	}
    		 		flatAnalysedElement .setAnalysedElementIdAnalyzedElement(_o.getIdAnalyzedElement());
    		 		flatAnalysedElement .setAnalysedElementProperties(_o.getProperties());
    		 	
    		 	//Set the outgoingRelationships reference
    		 	if(_o.getOutgoingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementOutgoingRelationships(new FlatRelationshipContainmentList());
    		 	}
				for(IRelationship e: _o.getOutgoingRelationships()){
                    FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementOutgoingRelationships().getValues().add(flatReference);
				}
                	    	
    		 	//Set the incomingRelationships reference
    		 	if(_o.getIncomingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementIncomingRelationships(new FlatRelationshipReferenceList());
    		 	}
				for(IRelationship e: _o.getIncomingRelationships()){
                	FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementIncomingRelationships().getValues().add(flatReference.getFlatID());
				}
	    	
    		 	//Set the containedElements reference
    		 	if(_o.getContainedElements().size()>0){
    		 		flatAnalysedElement.setAnalysedElementContainedElements(new FlatAnalysedElementContainmentList());
    		 	}
				for(IAnalysedElement e: _o.getContainedElements()){
                    FlatAnalysedElement flatReference = getFlatAnalysedElement(e);
					flatAnalysedElement .getAnalysedElementContainedElements().getValues().add(flatReference);
				}
                	    	
    		 	//Set the parent reference
				{ 
					if(_o.getParent()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getParent());
						flatAnalysedElement .setAnalysedElementParent(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatAnalysedElement; 
}
		
		
    	

@Override
protected FlatAnalysedElement evaluateMethod(IMethod _o, Object... args) {
	FlatAnalysedElement  flatAnalysedElement  = new FlatAnalysedElement();
	// Initialize flatten type
	flatAnalysedElement.setFlatType(METHOD_TYPE);
	int flatid = flatAnalysedElementIDMap.size();
    		 	flatAnalysedElement.setFlatID(flatid);
    		 	flatAnalysedElementIDMap.put(flatid, flatAnalysedElement);
	//set all the attributes
    		 	if(_o.getName()!=null){
    		 		flatAnalysedElement .setAnalysedElementName(_o.getName());
    		 	}
    		 		flatAnalysedElement .setAnalysedElementIdAnalyzedElement(_o.getIdAnalyzedElement());
    		 		flatAnalysedElement .setAnalysedElementProperties(_o.getProperties());
    		 	
    		 	//Set the outgoingRelationships reference
    		 	if(_o.getOutgoingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementOutgoingRelationships(new FlatRelationshipContainmentList());
    		 	}
				for(IRelationship e: _o.getOutgoingRelationships()){
                    FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementOutgoingRelationships().getValues().add(flatReference);
				}
                	    	
    		 	//Set the incomingRelationships reference
    		 	if(_o.getIncomingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementIncomingRelationships(new FlatRelationshipReferenceList());
    		 	}
				for(IRelationship e: _o.getIncomingRelationships()){
                	FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementIncomingRelationships().getValues().add(flatReference.getFlatID());
				}
	    	
    		 	//Set the containedElements reference
    		 	if(_o.getContainedElements().size()>0){
    		 		flatAnalysedElement.setAnalysedElementContainedElements(new FlatAnalysedElementContainmentList());
    		 	}
				for(IAnalysedElement e: _o.getContainedElements()){
                    FlatAnalysedElement flatReference = getFlatAnalysedElement(e);
					flatAnalysedElement .getAnalysedElementContainedElements().getValues().add(flatReference);
				}
                	    	
    		 	//Set the parent reference
				{ 
					if(_o.getParent()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getParent());
						flatAnalysedElement .setAnalysedElementParent(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatAnalysedElement; 
}
		
		
    	

@Override
protected FlatAnalysedElement evaluateField(IField _o, Object... args) {
	FlatAnalysedElement  flatAnalysedElement  = new FlatAnalysedElement();
	// Initialize flatten type
	flatAnalysedElement.setFlatType(FIELD_TYPE);
	int flatid = flatAnalysedElementIDMap.size();
    		 	flatAnalysedElement.setFlatID(flatid);
    		 	flatAnalysedElementIDMap.put(flatid, flatAnalysedElement);
	//set all the attributes
    		 	if(_o.getName()!=null){
    		 		flatAnalysedElement .setAnalysedElementName(_o.getName());
    		 	}
    		 		flatAnalysedElement .setAnalysedElementIdAnalyzedElement(_o.getIdAnalyzedElement());
    		 		flatAnalysedElement .setAnalysedElementProperties(_o.getProperties());
    		 	
    		 	//Set the outgoingRelationships reference
    		 	if(_o.getOutgoingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementOutgoingRelationships(new FlatRelationshipContainmentList());
    		 	}
				for(IRelationship e: _o.getOutgoingRelationships()){
                    FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementOutgoingRelationships().getValues().add(flatReference);
				}
                	    	
    		 	//Set the incomingRelationships reference
    		 	if(_o.getIncomingRelationships().size()>0){
    		 		flatAnalysedElement.setAnalysedElementIncomingRelationships(new FlatRelationshipReferenceList());
    		 	}
				for(IRelationship e: _o.getIncomingRelationships()){
                	FlatRelationship flatReference = getFlatRelationship(e);
					flatAnalysedElement .getAnalysedElementIncomingRelationships().getValues().add(flatReference.getFlatID());
				}
	    	
    		 	//Set the containedElements reference
    		 	if(_o.getContainedElements().size()>0){
    		 		flatAnalysedElement.setAnalysedElementContainedElements(new FlatAnalysedElementContainmentList());
    		 	}
				for(IAnalysedElement e: _o.getContainedElements()){
                    FlatAnalysedElement flatReference = getFlatAnalysedElement(e);
					flatAnalysedElement .getAnalysedElementContainedElements().getValues().add(flatReference);
				}
                	    	
    		 	//Set the parent reference
				{ 
					if(_o.getParent()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getParent());
						flatAnalysedElement .setAnalysedElementParent(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatAnalysedElement; 
}
		
		
    	

    	}
    	public FlatAnalysedElement getFlatAnalysedElement(IAnalysedElement _o){
    		
    		FlatAnalysedElement flatAnalysedElement = analysedElementFlatMap.get(_o);
    		if(flatAnalysedElement==null){
    			flatAnalysedElement =  new FlatAnalysedElementBuilder().apply(_o);
    		 	analysedElementFlatMap.put(_o, flatAnalysedElement);
    		}
    		return flatAnalysedElement; 
    	}
    	public FlatAnalysedElement getFlatAnalysedElement(IType _o){
    		
    		FlatAnalysedElement flatAnalysedElement = typeFlatMap.get(_o);
    		if(flatAnalysedElement==null){
    			flatAnalysedElement =  new FlatAnalysedElementBuilder().apply(_o);
    		 	typeFlatMap.put(_o, flatAnalysedElement);
    		}
    		return flatAnalysedElement; 
    	}
    	public FlatAnalysedElement getFlatAnalysedElement(IArchitectureFile _o){
    		
    		FlatAnalysedElement flatAnalysedElement = architectureFileFlatMap.get(_o);
    		if(flatAnalysedElement==null){
    			flatAnalysedElement =  new FlatAnalysedElementBuilder().apply(_o);
    		 	architectureFileFlatMap.put(_o, flatAnalysedElement);
    		}
    		return flatAnalysedElement; 
    	}
    	public FlatAnalysedElement getFlatAnalysedElement(ILibrary _o){
    		
    		FlatAnalysedElement flatAnalysedElement = libraryFlatMap.get(_o);
    		if(flatAnalysedElement==null){
    			flatAnalysedElement =  new FlatAnalysedElementBuilder().apply(_o);
    		 	libraryFlatMap.put(_o, flatAnalysedElement);
    		}
    		return flatAnalysedElement; 
    	}
    	public FlatAnalysedElement getFlatAnalysedElement(IProject _o){
    		
    		FlatAnalysedElement flatAnalysedElement = projectFlatMap.get(_o);
    		if(flatAnalysedElement==null){
    			flatAnalysedElement =  new FlatAnalysedElementBuilder().apply(_o);
    		 	projectFlatMap.put(_o, flatAnalysedElement);
    		}
    		return flatAnalysedElement; 
    	}
    	public FlatAnalysedElement getFlatAnalysedElement(IMethod _o){
    		
    		FlatAnalysedElement flatAnalysedElement = methodFlatMap.get(_o);
    		if(flatAnalysedElement==null){
    			flatAnalysedElement =  new FlatAnalysedElementBuilder().apply(_o);
    		 	methodFlatMap.put(_o, flatAnalysedElement);
    		}
    		return flatAnalysedElement; 
    	}
    	public FlatAnalysedElement getFlatAnalysedElement(IField _o){
    		
    		FlatAnalysedElement flatAnalysedElement = fieldFlatMap.get(_o);
    		if(flatAnalysedElement==null){
    			flatAnalysedElement =  new FlatAnalysedElementBuilder().apply(_o);
    		 	fieldFlatMap.put(_o, flatAnalysedElement);
    		}
    		return flatAnalysedElement; 
    	}
    	
    	private Map<Integer, FlatRelationship> flatRelationshipIDMap = new HashMap<Integer, FlatRelationship>();
    	
    	private final static int RELATIONSHIP_TYPE = 0 ;
    	private Map<IRelationship, FlatRelationship> relationshipFlatMap = new HashMap<IRelationship, FlatRelationship>();
    	private final static int INHERITANCEDEPENDENCY_TYPE = 1 ;
    	private Map<IInheritanceDependency, FlatRelationship> inheritanceDependencyFlatMap = new HashMap<IInheritanceDependency, FlatRelationship>();
    	private final static int REFERENCEDEPENDENCY_TYPE = 2 ;
    	private Map<IReferenceDependency, FlatRelationship> referenceDependencyFlatMap = new HashMap<IReferenceDependency, FlatRelationship>();
    	private final static int DEPENDENCY_TYPE = 3 ;
    	private Map<IDependency, FlatRelationship> dependencyFlatMap = new HashMap<IDependency, FlatRelationship>();
    	private final static int RUNTIMEDEPENDENCY_TYPE = 4 ;
    	private Map<IRuntimeDependency, FlatRelationship> runtimeDependencyFlatMap = new HashMap<IRuntimeDependency, FlatRelationship>();
    	private final static int INJECTIONDEPENDENCY_TYPE = 5 ;
    	private Map<IInjectionDependency, FlatRelationship> injectionDependencyFlatMap = new HashMap<IInjectionDependency, FlatRelationship>();
    	private final static int FIELDREFERENCEDEPENDENCY_TYPE = 6 ;
    	private Map<IFieldReferenceDependency, FlatRelationship> fieldReferenceDependencyFlatMap = new HashMap<IFieldReferenceDependency, FlatRelationship>();
    	private final static int IMPORTREFERENCEDEPENDENCY_TYPE = 7 ;
    	private Map<IImportReferenceDependency, FlatRelationship> importReferenceDependencyFlatMap = new HashMap<IImportReferenceDependency, FlatRelationship>();
    	private final static int RETURNTYPERELATIONSHIP_TYPE = 8 ;
    	private Map<IReturnTypeRelationship, FlatRelationship> returnTypeRelationshipFlatMap = new HashMap<IReturnTypeRelationship, FlatRelationship>();
    	private final static int PARAMETERRELATIONSHIP_TYPE = 9 ;
    	private Map<IParameterRelationship, FlatRelationship> parameterRelationshipFlatMap = new HashMap<IParameterRelationship, FlatRelationship>();
    	private final static int CALLRELATIONSHIP_TYPE = 10 ;
    	private Map<ICallRelationship, FlatRelationship> callRelationshipFlatMap = new HashMap<ICallRelationship, FlatRelationship>();
    	private final static int DECLAREDTYPE_TYPE = 11 ;
    	private Map<IDeclaredType, FlatRelationship> declaredTypeFlatMap = new HashMap<IDeclaredType, FlatRelationship>();
private class FlatRelationshipBuilder extends ArchitectureFunction<FlatRelationship>{
@Override
protected FlatRelationship evaluateRelationship(IRelationship _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(RELATIONSHIP_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateInheritanceDependency(IInheritanceDependency _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(INHERITANCEDEPENDENCY_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateReferenceDependency(IReferenceDependency _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(REFERENCEDEPENDENCY_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	if(_o.getUri()!=null){
    		 		flatRelationship .setReferenceDependencyUri(_o.getUri());
    		 	}
    		 	if(_o.getName()!=null){
    		 		flatRelationship .setReferenceDependencyName(_o.getName());
    		 	}
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateRuntimeDependency(IRuntimeDependency _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(RUNTIMEDEPENDENCY_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateInjectionDependency(IInjectionDependency _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(INJECTIONDEPENDENCY_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the mapping reference
				{ 
					if(_o.getMapping()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getMapping());
						flatRelationship .setInjectionDependencyMapping(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateFieldReferenceDependency(IFieldReferenceDependency _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(FIELDREFERENCEDEPENDENCY_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	if(_o.getUri()!=null){
    		 		flatRelationship .setReferenceDependencyUri(_o.getUri());
    		 	}
    		 	if(_o.getName()!=null){
    		 		flatRelationship .setReferenceDependencyName(_o.getName());
    		 	}
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateImportReferenceDependency(IImportReferenceDependency _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(IMPORTREFERENCEDEPENDENCY_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	if(_o.getUri()!=null){
    		 		flatRelationship .setReferenceDependencyUri(_o.getUri());
    		 	}
    		 	if(_o.getName()!=null){
    		 		flatRelationship .setReferenceDependencyName(_o.getName());
    		 	}
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateReturnTypeRelationship(IReturnTypeRelationship _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(RETURNTYPERELATIONSHIP_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateParameterRelationship(IParameterRelationship _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(PARAMETERRELATIONSHIP_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateCallRelationship(ICallRelationship _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(CALLRELATIONSHIP_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

@Override
protected FlatRelationship evaluateDeclaredType(IDeclaredType _o, Object... args) {
	FlatRelationship  flatRelationship  = new FlatRelationship();
	// Initialize flatten type
	flatRelationship.setFlatType(DECLAREDTYPE_TYPE);
	int flatid = flatRelationshipIDMap.size();
    		 	flatRelationship.setFlatID(flatid);
    		 	flatRelationshipIDMap.put(flatid, flatRelationship);
	//set all the attributes
    		 		flatRelationship .setRelationshipRelationShipId(_o.getRelationShipId());
    		 	
    		 	//Set the target reference
				{ 
					if(_o.getTarget()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getTarget());
						flatRelationship .setRelationshipTarget(flatReference.getFlatID());
					}
				}
	    	
    		 	//Set the source reference
				{ 
					if(_o.getSource()!=null){ 
						FlatAnalysedElement flatReference = getFlatAnalysedElement(_o.getSource());
						flatRelationship .setRelationshipSource(flatReference.getFlatID());
					}
				}
	    	
    		 	return flatRelationship; 
}
		
		
    	

    	}
    	public FlatRelationship getFlatRelationship(IRelationship _o){
    		
    		FlatRelationship flatRelationship = relationshipFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	relationshipFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IInheritanceDependency _o){
    		
    		FlatRelationship flatRelationship = inheritanceDependencyFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	inheritanceDependencyFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IReferenceDependency _o){
    		
    		FlatRelationship flatRelationship = referenceDependencyFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	referenceDependencyFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IDependency _o){
    		
    		FlatRelationship flatRelationship = dependencyFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	dependencyFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IRuntimeDependency _o){
    		
    		FlatRelationship flatRelationship = runtimeDependencyFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	runtimeDependencyFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IInjectionDependency _o){
    		
    		FlatRelationship flatRelationship = injectionDependencyFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	injectionDependencyFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IFieldReferenceDependency _o){
    		
    		FlatRelationship flatRelationship = fieldReferenceDependencyFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	fieldReferenceDependencyFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IImportReferenceDependency _o){
    		
    		FlatRelationship flatRelationship = importReferenceDependencyFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	importReferenceDependencyFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IReturnTypeRelationship _o){
    		
    		FlatRelationship flatRelationship = returnTypeRelationshipFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	returnTypeRelationshipFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IParameterRelationship _o){
    		
    		FlatRelationship flatRelationship = parameterRelationshipFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	parameterRelationshipFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(ICallRelationship _o){
    		
    		FlatRelationship flatRelationship = callRelationshipFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	callRelationshipFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
    	public FlatRelationship getFlatRelationship(IDeclaredType _o){
    		
    		FlatRelationship flatRelationship = declaredTypeFlatMap.get(_o);
    		if(flatRelationship==null){
    			flatRelationship =  new FlatRelationshipBuilder().apply(_o);
    		 	declaredTypeFlatMap.put(_o, flatRelationship);
    		}
    		return flatRelationship; 
    	}
        
    }
    private List<FlatAnalysedElement> deserializeFlatAnalysedElement(File file) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(FlatAnalysedElementElements.class);
		Unmarshaller marshaller = jc.createUnmarshaller();
		FlatAnalysedElementElements unmarshal = (FlatAnalysedElementElements) marshaller.unmarshal(file);
		return unmarshal.getElements();
	}
	
	public static List<IAnalysedElement> deserializeAnalysedElement(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatAnalysedElement> deserialized = xml.deserializeFlatAnalysedElement(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IAnalysedElement> result = new ArrayList<IAnalysedElement>();
            for (FlatAnalysedElement flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IAnalysedElement) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IType> deserializeType(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatAnalysedElement> deserialized = xml.deserializeFlatAnalysedElement(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IType> result = new ArrayList<IType>();
            for (FlatAnalysedElement flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IType) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IArchitectureFile> deserializeArchitectureFile(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatAnalysedElement> deserialized = xml.deserializeFlatAnalysedElement(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IArchitectureFile> result = new ArrayList<IArchitectureFile>();
            for (FlatAnalysedElement flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IArchitectureFile) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<ILibrary> deserializeLibrary(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatAnalysedElement> deserialized = xml.deserializeFlatAnalysedElement(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<ILibrary> result = new ArrayList<ILibrary>();
            for (FlatAnalysedElement flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((ILibrary) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IProject> deserializeProject(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatAnalysedElement> deserialized = xml.deserializeFlatAnalysedElement(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IProject> result = new ArrayList<IProject>();
            for (FlatAnalysedElement flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IProject) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IMethod> deserializeMethod(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatAnalysedElement> deserialized = xml.deserializeFlatAnalysedElement(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IMethod> result = new ArrayList<IMethod>();
            for (FlatAnalysedElement flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IMethod) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IField> deserializeField(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatAnalysedElement> deserialized = xml.deserializeFlatAnalysedElement(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IField> result = new ArrayList<IField>();
            for (FlatAnalysedElement flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IField) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
    private List<FlatRelationship> deserializeFlatRelationship(File file) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(FlatRelationshipElements.class);
		Unmarshaller marshaller = jc.createUnmarshaller();
		FlatRelationshipElements unmarshal = (FlatRelationshipElements) marshaller.unmarshal(file);
		return unmarshal.getElements();
	}
	
	public static List<IRelationship> deserializeRelationship(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IRelationship> result = new ArrayList<IRelationship>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IRelationship) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IInheritanceDependency> deserializeInheritanceDependency(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IInheritanceDependency> result = new ArrayList<IInheritanceDependency>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IInheritanceDependency) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IReferenceDependency> deserializeReferenceDependency(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IReferenceDependency> result = new ArrayList<IReferenceDependency>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IReferenceDependency) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IDependency> deserializeDependency(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IDependency> result = new ArrayList<IDependency>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IDependency) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IRuntimeDependency> deserializeRuntimeDependency(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IRuntimeDependency> result = new ArrayList<IRuntimeDependency>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IRuntimeDependency) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IInjectionDependency> deserializeInjectionDependency(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IInjectionDependency> result = new ArrayList<IInjectionDependency>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IInjectionDependency) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IFieldReferenceDependency> deserializeFieldReferenceDependency(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IFieldReferenceDependency> result = new ArrayList<IFieldReferenceDependency>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IFieldReferenceDependency) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IImportReferenceDependency> deserializeImportReferenceDependency(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IImportReferenceDependency> result = new ArrayList<IImportReferenceDependency>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IImportReferenceDependency) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IReturnTypeRelationship> deserializeReturnTypeRelationship(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IReturnTypeRelationship> result = new ArrayList<IReturnTypeRelationship>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IReturnTypeRelationship) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IParameterRelationship> deserializeParameterRelationship(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IParameterRelationship> result = new ArrayList<IParameterRelationship>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IParameterRelationship) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<ICallRelationship> deserializeCallRelationship(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<ICallRelationship> result = new ArrayList<ICallRelationship>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((ICallRelationship) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
	public static List<IDeclaredType> deserializeDeclaredType(File file) {
        ArchitectureXMLTools xml = new ArchitectureXMLTools();
        try {
            List<FlatRelationship> deserialized = xml.deserializeFlatRelationship(file);
            ArchitectureUnflattener unflattener = new  ArchitectureUnflattener();
            List<IDeclaredType> result = new ArrayList<IDeclaredType>();
            for (FlatRelationship flatDeserialized : deserialized) {
                Object unflat = unflattener.unflat(flatDeserialized);
                result.add((IDeclaredType) unflat);
            }
            unflattener.resolveAll();
            return result;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
    private static class ArchitectureUnflattener
    {
        
        
        /**
         * This method resolve all references of unflatten objects.
         */
        public void resolveAll() {
        
        	 for (FlatAnalysedElement flatAnalysedElement : flatAnalysedElementMap.keySet()) {
        	 	resolveFlatAnalysedElement(flatAnalysedElement);
        	 }	
        	 for (FlatRelationship flatRelationship : flatRelationshipMap.keySet()) {
        	 	resolveFlatRelationship(flatRelationship);
        	 }	
        }
        
        private final static int          TYPE_TYPE      = 1;
        private final static int          ARCHITECTUREFILE_TYPE      = 2;
        private final static int          LIBRARY_TYPE      = 3;
        private final static int          PROJECT_TYPE      = 4;
        private final static int          METHOD_TYPE      = 5;
        private final static int          FIELD_TYPE      = 6;
        private Map<FlatAnalysedElement, Object>  flatAnalysedElementMap      = new HashMap<FlatAnalysedElement, Object>();
        private Map<Integer, FlatAnalysedElement> flatAnalysedElementIDMap = new HashMap<Integer, FlatAnalysedElement>();
        
        
        
        /**
         * This method get the unflatten object that is identified by its flat identifier.
         * 
         * @param id
         *            identifier of the flat object
         * @return
         */
        public Object resolveFlatAnalysedElementReference(Integer id) {
        
        
            FlatAnalysedElement flatAnalysedElement = flatAnalysedElementIDMap.get(id);
            if (flatAnalysedElement == null) {
                throw new IllegalArgumentException("Unknown reference: " + id);
            }
            return unflat(flatAnalysedElement);
        }
        
        
        /**
         * This method get the unflatten object of a {@link FlatAnalysedElement}. It built
         * it using its flat representation id if needed.
         * 
         * @param _flatObject
         *            the flat object to expand
         * @return
         */
        public Object unflat(FlatAnalysedElement _flatObject) {
        
        
            int flatType = _flatObject.getFlatType();
            Object unflattenObject = flatAnalysedElementMap.get(_flatObject);
            if (unflattenObject == null) {
                switch (_flatObject.getFlatType()) {
                	 case TYPE_TYPE:
                	 	{
    	                        IType unflattenType = new Type();
    	                        flatAnalysedElementMap.put(_flatObject, unflattenType);
    	                        flatAnalysedElementIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenType.setName(_flatObject.getAnalysedElementName());
    	                        unflattenType.setIdAnalyzedElement(_flatObject.getAnalysedElementIdAnalyzedElement());
    	                        unflattenType.setProperties(_flatObject.getAnalysedElementProperties());
    	                        unflattenType.setQualifiedName(_flatObject.getTypeQualifiedName());
    	                        unflattenType.setSource(_flatObject.getTypeSource());
    	                        unflattenType.setBinary(_flatObject.getTypeBinary());
    	                        
    	                        //outgoingRelationships containment reference
    	                        FlatRelationshipContainmentList outgoingRelationships = _flatObject.getAnalysedElementOutgoingRelationships();
    	                        if(outgoingRelationships!=null){
    		                        for (FlatRelationship flatRelationship : outgoingRelationships.getValues()) {
    		                            IRelationship unflatRelationship = (IRelationship) unflat(flatRelationship);
    		                            unflattenType.getOutgoingRelationships().add(unflatRelationship);
    		                        }
    	                        }
    	                        
    	                        //containedElements containment reference
    	                        FlatAnalysedElementContainmentList containedElements = _flatObject.getAnalysedElementContainedElements();
    	                        if(containedElements!=null){
    		                        for (FlatAnalysedElement flatAnalysedElement : containedElements.getValues()) {
    		                            IAnalysedElement unflatAnalysedElement = (IAnalysedElement) unflat(flatAnalysedElement);
    		                            unflattenType.getContainedElements().add(unflatAnalysedElement);
    		                        }
    	                        }
    	                        
    	                        unflattenObject = unflattenType;
                            }
                            break;
                	 case ARCHITECTUREFILE_TYPE:
                	 	{
    	                        IArchitectureFile unflattenArchitectureFile = new ArchitectureFile();
    	                        flatAnalysedElementMap.put(_flatObject, unflattenArchitectureFile);
    	                        flatAnalysedElementIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenArchitectureFile.setName(_flatObject.getAnalysedElementName());
    	                        unflattenArchitectureFile.setIdAnalyzedElement(_flatObject.getAnalysedElementIdAnalyzedElement());
    	                        unflattenArchitectureFile.setProperties(_flatObject.getAnalysedElementProperties());
    	                        unflattenArchitectureFile.setPath(_flatObject.getArchitectureFilePath());
    	                        
    	                        //outgoingRelationships containment reference
    	                        FlatRelationshipContainmentList outgoingRelationships = _flatObject.getAnalysedElementOutgoingRelationships();
    	                        if(outgoingRelationships!=null){
    		                        for (FlatRelationship flatRelationship : outgoingRelationships.getValues()) {
    		                            IRelationship unflatRelationship = (IRelationship) unflat(flatRelationship);
    		                            unflattenArchitectureFile.getOutgoingRelationships().add(unflatRelationship);
    		                        }
    	                        }
    	                        
    	                        //containedElements containment reference
    	                        FlatAnalysedElementContainmentList containedElements = _flatObject.getAnalysedElementContainedElements();
    	                        if(containedElements!=null){
    		                        for (FlatAnalysedElement flatAnalysedElement : containedElements.getValues()) {
    		                            IAnalysedElement unflatAnalysedElement = (IAnalysedElement) unflat(flatAnalysedElement);
    		                            unflattenArchitectureFile.getContainedElements().add(unflatAnalysedElement);
    		                        }
    	                        }
    	                        
    	                        unflattenObject = unflattenArchitectureFile;
                            }
                            break;
                	 case LIBRARY_TYPE:
                	 	{
    	                        ILibrary unflattenLibrary = new Library();
    	                        flatAnalysedElementMap.put(_flatObject, unflattenLibrary);
    	                        flatAnalysedElementIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenLibrary.setName(_flatObject.getAnalysedElementName());
    	                        unflattenLibrary.setIdAnalyzedElement(_flatObject.getAnalysedElementIdAnalyzedElement());
    	                        unflattenLibrary.setProperties(_flatObject.getAnalysedElementProperties());
    	                        
    	                        //outgoingRelationships containment reference
    	                        FlatRelationshipContainmentList outgoingRelationships = _flatObject.getAnalysedElementOutgoingRelationships();
    	                        if(outgoingRelationships!=null){
    		                        for (FlatRelationship flatRelationship : outgoingRelationships.getValues()) {
    		                            IRelationship unflatRelationship = (IRelationship) unflat(flatRelationship);
    		                            unflattenLibrary.getOutgoingRelationships().add(unflatRelationship);
    		                        }
    	                        }
    	                        
    	                        //containedElements containment reference
    	                        FlatAnalysedElementContainmentList containedElements = _flatObject.getAnalysedElementContainedElements();
    	                        if(containedElements!=null){
    		                        for (FlatAnalysedElement flatAnalysedElement : containedElements.getValues()) {
    		                            IAnalysedElement unflatAnalysedElement = (IAnalysedElement) unflat(flatAnalysedElement);
    		                            unflattenLibrary.getContainedElements().add(unflatAnalysedElement);
    		                        }
    	                        }
    	                        
    	                        unflattenObject = unflattenLibrary;
                            }
                            break;
                	 case PROJECT_TYPE:
                	 	{
    	                        IProject unflattenProject = new Project();
    	                        flatAnalysedElementMap.put(_flatObject, unflattenProject);
    	                        flatAnalysedElementIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenProject.setName(_flatObject.getAnalysedElementName());
    	                        unflattenProject.setIdAnalyzedElement(_flatObject.getAnalysedElementIdAnalyzedElement());
    	                        unflattenProject.setProperties(_flatObject.getAnalysedElementProperties());
    	                        
    	                        //outgoingRelationships containment reference
    	                        FlatRelationshipContainmentList outgoingRelationships = _flatObject.getAnalysedElementOutgoingRelationships();
    	                        if(outgoingRelationships!=null){
    		                        for (FlatRelationship flatRelationship : outgoingRelationships.getValues()) {
    		                            IRelationship unflatRelationship = (IRelationship) unflat(flatRelationship);
    		                            unflattenProject.getOutgoingRelationships().add(unflatRelationship);
    		                        }
    	                        }
    	                        
    	                        //containedElements containment reference
    	                        FlatAnalysedElementContainmentList containedElements = _flatObject.getAnalysedElementContainedElements();
    	                        if(containedElements!=null){
    		                        for (FlatAnalysedElement flatAnalysedElement : containedElements.getValues()) {
    		                            IAnalysedElement unflatAnalysedElement = (IAnalysedElement) unflat(flatAnalysedElement);
    		                            unflattenProject.getContainedElements().add(unflatAnalysedElement);
    		                        }
    	                        }
    	                        
    	                        unflattenObject = unflattenProject;
                            }
                            break;
                	 case METHOD_TYPE:
                	 	{
    	                        IMethod unflattenMethod = new Method();
    	                        flatAnalysedElementMap.put(_flatObject, unflattenMethod);
    	                        flatAnalysedElementIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenMethod.setName(_flatObject.getAnalysedElementName());
    	                        unflattenMethod.setIdAnalyzedElement(_flatObject.getAnalysedElementIdAnalyzedElement());
    	                        unflattenMethod.setProperties(_flatObject.getAnalysedElementProperties());
    	                        
    	                        //outgoingRelationships containment reference
    	                        FlatRelationshipContainmentList outgoingRelationships = _flatObject.getAnalysedElementOutgoingRelationships();
    	                        if(outgoingRelationships!=null){
    		                        for (FlatRelationship flatRelationship : outgoingRelationships.getValues()) {
    		                            IRelationship unflatRelationship = (IRelationship) unflat(flatRelationship);
    		                            unflattenMethod.getOutgoingRelationships().add(unflatRelationship);
    		                        }
    	                        }
    	                        
    	                        //containedElements containment reference
    	                        FlatAnalysedElementContainmentList containedElements = _flatObject.getAnalysedElementContainedElements();
    	                        if(containedElements!=null){
    		                        for (FlatAnalysedElement flatAnalysedElement : containedElements.getValues()) {
    		                            IAnalysedElement unflatAnalysedElement = (IAnalysedElement) unflat(flatAnalysedElement);
    		                            unflattenMethod.getContainedElements().add(unflatAnalysedElement);
    		                        }
    	                        }
    	                        
    	                        unflattenObject = unflattenMethod;
                            }
                            break;
                	 case FIELD_TYPE:
                	 	{
    	                        IField unflattenField = new Field();
    	                        flatAnalysedElementMap.put(_flatObject, unflattenField);
    	                        flatAnalysedElementIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenField.setName(_flatObject.getAnalysedElementName());
    	                        unflattenField.setIdAnalyzedElement(_flatObject.getAnalysedElementIdAnalyzedElement());
    	                        unflattenField.setProperties(_flatObject.getAnalysedElementProperties());
    	                        
    	                        //outgoingRelationships containment reference
    	                        FlatRelationshipContainmentList outgoingRelationships = _flatObject.getAnalysedElementOutgoingRelationships();
    	                        if(outgoingRelationships!=null){
    		                        for (FlatRelationship flatRelationship : outgoingRelationships.getValues()) {
    		                            IRelationship unflatRelationship = (IRelationship) unflat(flatRelationship);
    		                            unflattenField.getOutgoingRelationships().add(unflatRelationship);
    		                        }
    	                        }
    	                        
    	                        //containedElements containment reference
    	                        FlatAnalysedElementContainmentList containedElements = _flatObject.getAnalysedElementContainedElements();
    	                        if(containedElements!=null){
    		                        for (FlatAnalysedElement flatAnalysedElement : containedElements.getValues()) {
    		                            IAnalysedElement unflatAnalysedElement = (IAnalysedElement) unflat(flatAnalysedElement);
    		                            unflattenField.getContainedElements().add(unflatAnalysedElement);
    		                        }
    	                        }
    	                        
    	                        unflattenObject = unflattenField;
                            }
                            break;
                    default:
                        throw new IllegalArgumentException("Unknown object type: " + _flatObject.getFlatType());
                }
            }
            return unflattenObject;
        }
        
        /**
         * This method get the unflatten FlatAnalysedElement that is identified by its flat identifier.
         * 
         * @param id
         *            identifier of the flat object
         * @return
         */
        public void resolveFlatAnalysedElement(FlatAnalysedElement _flatObject) {
        
        
            int flatType = _flatObject.getFlatType();
            Object unflattenObject = flatAnalysedElementMap.get(_flatObject);
            if (unflattenObject != null) {
                
                switch (_flatObject.getFlatType()) {
           			case TYPE_TYPE:
                            IType resolvedType = (IType) unflattenObject;
                            {
                                // incomingRelationships
                                
                               	FlatRelationshipReferenceList incomingRelationships = _flatObject.getAnalysedElementIncomingRelationships();
                               	if(incomingRelationships!=null){
    	                           	for (Integer flatRelationshipReference : incomingRelationships.getValues()) {
    	                           		resolvedType.getIncomingRelationships().add((IRelationship) resolveFlatRelationshipReference(flatRelationshipReference));
    	                           	}
                               	}
                            }
                            {
                                // parent
                                Integer parent = _flatObject.getAnalysedElementParent();
    							if (parent != null) {
    								resolvedType.setParent((IAnalysedElement) resolveFlatAnalysedElementReference(parent));
    							}
                            }
                   		break;
    	case ARCHITECTUREFILE_TYPE:
                            IArchitectureFile resolvedArchitectureFile = (IArchitectureFile) unflattenObject;
                            {
                                // incomingRelationships
                                
                               	FlatRelationshipReferenceList incomingRelationships = _flatObject.getAnalysedElementIncomingRelationships();
                               	if(incomingRelationships!=null){
    	                           	for (Integer flatRelationshipReference : incomingRelationships.getValues()) {
    	                           		resolvedArchitectureFile.getIncomingRelationships().add((IRelationship) resolveFlatRelationshipReference(flatRelationshipReference));
    	                           	}
                               	}
                            }
                            {
                                // parent
                                Integer parent = _flatObject.getAnalysedElementParent();
    							if (parent != null) {
    								resolvedArchitectureFile.setParent((IAnalysedElement) resolveFlatAnalysedElementReference(parent));
    							}
                            }
                   		break;
    	case LIBRARY_TYPE:
                            ILibrary resolvedLibrary = (ILibrary) unflattenObject;
                            {
                                // incomingRelationships
                                
                               	FlatRelationshipReferenceList incomingRelationships = _flatObject.getAnalysedElementIncomingRelationships();
                               	if(incomingRelationships!=null){
    	                           	for (Integer flatRelationshipReference : incomingRelationships.getValues()) {
    	                           		resolvedLibrary.getIncomingRelationships().add((IRelationship) resolveFlatRelationshipReference(flatRelationshipReference));
    	                           	}
                               	}
                            }
                            {
                                // parent
                                Integer parent = _flatObject.getAnalysedElementParent();
    							if (parent != null) {
    								resolvedLibrary.setParent((IAnalysedElement) resolveFlatAnalysedElementReference(parent));
    							}
                            }
                   		break;
    	case PROJECT_TYPE:
                            IProject resolvedProject = (IProject) unflattenObject;
                            {
                                // incomingRelationships
                                
                               	FlatRelationshipReferenceList incomingRelationships = _flatObject.getAnalysedElementIncomingRelationships();
                               	if(incomingRelationships!=null){
    	                           	for (Integer flatRelationshipReference : incomingRelationships.getValues()) {
    	                           		resolvedProject.getIncomingRelationships().add((IRelationship) resolveFlatRelationshipReference(flatRelationshipReference));
    	                           	}
                               	}
                            }
                            {
                                // parent
                                Integer parent = _flatObject.getAnalysedElementParent();
    							if (parent != null) {
    								resolvedProject.setParent((IAnalysedElement) resolveFlatAnalysedElementReference(parent));
    							}
                            }
                   		break;
    	case METHOD_TYPE:
                            IMethod resolvedMethod = (IMethod) unflattenObject;
                            {
                                // incomingRelationships
                                
                               	FlatRelationshipReferenceList incomingRelationships = _flatObject.getAnalysedElementIncomingRelationships();
                               	if(incomingRelationships!=null){
    	                           	for (Integer flatRelationshipReference : incomingRelationships.getValues()) {
    	                           		resolvedMethod.getIncomingRelationships().add((IRelationship) resolveFlatRelationshipReference(flatRelationshipReference));
    	                           	}
                               	}
                            }
                            {
                                // parent
                                Integer parent = _flatObject.getAnalysedElementParent();
    							if (parent != null) {
    								resolvedMethod.setParent((IAnalysedElement) resolveFlatAnalysedElementReference(parent));
    							}
                            }
                   		break;
    	case FIELD_TYPE:
                            IField resolvedField = (IField) unflattenObject;
                            {
                                // incomingRelationships
                                
                               	FlatRelationshipReferenceList incomingRelationships = _flatObject.getAnalysedElementIncomingRelationships();
                               	if(incomingRelationships!=null){
    	                           	for (Integer flatRelationshipReference : incomingRelationships.getValues()) {
    	                           		resolvedField.getIncomingRelationships().add((IRelationship) resolveFlatRelationshipReference(flatRelationshipReference));
    	                           	}
                               	}
                            }
                            {
                                // parent
                                Integer parent = _flatObject.getAnalysedElementParent();
    							if (parent != null) {
    								resolvedField.setParent((IAnalysedElement) resolveFlatAnalysedElementReference(parent));
    							}
                            }
                   		break;
                	default:
                        throw new IllegalArgumentException("Unknown object type: " + _flatObject.getFlatType());
                }
            } else {
                throw new IllegalArgumentException("Unresolvable flat object: identifier isn't known");
            }
        }
        	
        private final static int          INHERITANCEDEPENDENCY_TYPE      = 1;
        private final static int          REFERENCEDEPENDENCY_TYPE      = 2;
        private final static int          RUNTIMEDEPENDENCY_TYPE      = 4;
        private final static int          INJECTIONDEPENDENCY_TYPE      = 5;
        private final static int          FIELDREFERENCEDEPENDENCY_TYPE      = 6;
        private final static int          IMPORTREFERENCEDEPENDENCY_TYPE      = 7;
        private final static int          RETURNTYPERELATIONSHIP_TYPE      = 8;
        private final static int          PARAMETERRELATIONSHIP_TYPE      = 9;
        private final static int          CALLRELATIONSHIP_TYPE      = 10;
        private final static int          DECLAREDTYPE_TYPE      = 11;
        private Map<FlatRelationship, Object>  flatRelationshipMap      = new HashMap<FlatRelationship, Object>();
        private Map<Integer, FlatRelationship> flatRelationshipIDMap = new HashMap<Integer, FlatRelationship>();
        
        
        
        /**
         * This method get the unflatten object that is identified by its flat identifier.
         * 
         * @param id
         *            identifier of the flat object
         * @return
         */
        public Object resolveFlatRelationshipReference(Integer id) {
        
        
            FlatRelationship flatRelationship = flatRelationshipIDMap.get(id);
            if (flatRelationship == null) {
                throw new IllegalArgumentException("Unknown reference: " + id);
            }
            return unflat(flatRelationship);
        }
        
        
        /**
         * This method get the unflatten object of a {@link FlatRelationship}. It built
         * it using its flat representation id if needed.
         * 
         * @param _flatObject
         *            the flat object to expand
         * @return
         */
        public Object unflat(FlatRelationship _flatObject) {
        
        
            int flatType = _flatObject.getFlatType();
            Object unflattenObject = flatRelationshipMap.get(_flatObject);
            if (unflattenObject == null) {
                switch (_flatObject.getFlatType()) {
                	 case INHERITANCEDEPENDENCY_TYPE:
                	 	{
    	                        IInheritanceDependency unflattenInheritanceDependency = new InheritanceDependency();
    	                        flatRelationshipMap.put(_flatObject, unflattenInheritanceDependency);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenInheritanceDependency.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        
    	                        unflattenObject = unflattenInheritanceDependency;
                            }
                            break;
                	 case REFERENCEDEPENDENCY_TYPE:
                	 	{
    	                        IReferenceDependency unflattenReferenceDependency = new ReferenceDependency();
    	                        flatRelationshipMap.put(_flatObject, unflattenReferenceDependency);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenReferenceDependency.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        unflattenReferenceDependency.setUri(_flatObject.getReferenceDependencyUri());
    	                        unflattenReferenceDependency.setName(_flatObject.getReferenceDependencyName());
    	                        
    	                        unflattenObject = unflattenReferenceDependency;
                            }
                            break;
                	 case RUNTIMEDEPENDENCY_TYPE:
                	 	{
    	                        IRuntimeDependency unflattenRuntimeDependency = new RuntimeDependency();
    	                        flatRelationshipMap.put(_flatObject, unflattenRuntimeDependency);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenRuntimeDependency.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        
    	                        unflattenObject = unflattenRuntimeDependency;
                            }
                            break;
                	 case INJECTIONDEPENDENCY_TYPE:
                	 	{
    	                        IInjectionDependency unflattenInjectionDependency = new InjectionDependency();
    	                        flatRelationshipMap.put(_flatObject, unflattenInjectionDependency);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenInjectionDependency.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        
    	                        unflattenObject = unflattenInjectionDependency;
                            }
                            break;
                	 case FIELDREFERENCEDEPENDENCY_TYPE:
                	 	{
    	                        IFieldReferenceDependency unflattenFieldReferenceDependency = new FieldReferenceDependency();
    	                        flatRelationshipMap.put(_flatObject, unflattenFieldReferenceDependency);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenFieldReferenceDependency.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        unflattenFieldReferenceDependency.setUri(_flatObject.getReferenceDependencyUri());
    	                        unflattenFieldReferenceDependency.setName(_flatObject.getReferenceDependencyName());
    	                        
    	                        unflattenObject = unflattenFieldReferenceDependency;
                            }
                            break;
                	 case IMPORTREFERENCEDEPENDENCY_TYPE:
                	 	{
    	                        IImportReferenceDependency unflattenImportReferenceDependency = new ImportReferenceDependency();
    	                        flatRelationshipMap.put(_flatObject, unflattenImportReferenceDependency);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenImportReferenceDependency.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        unflattenImportReferenceDependency.setUri(_flatObject.getReferenceDependencyUri());
    	                        unflattenImportReferenceDependency.setName(_flatObject.getReferenceDependencyName());
    	                        
    	                        unflattenObject = unflattenImportReferenceDependency;
                            }
                            break;
                	 case RETURNTYPERELATIONSHIP_TYPE:
                	 	{
    	                        IReturnTypeRelationship unflattenReturnTypeRelationship = new ReturnTypeRelationship();
    	                        flatRelationshipMap.put(_flatObject, unflattenReturnTypeRelationship);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenReturnTypeRelationship.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        
    	                        unflattenObject = unflattenReturnTypeRelationship;
                            }
                            break;
                	 case PARAMETERRELATIONSHIP_TYPE:
                	 	{
    	                        IParameterRelationship unflattenParameterRelationship = new ParameterRelationship();
    	                        flatRelationshipMap.put(_flatObject, unflattenParameterRelationship);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenParameterRelationship.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        
    	                        unflattenObject = unflattenParameterRelationship;
                            }
                            break;
                	 case CALLRELATIONSHIP_TYPE:
                	 	{
    	                        ICallRelationship unflattenCallRelationship = new CallRelationship();
    	                        flatRelationshipMap.put(_flatObject, unflattenCallRelationship);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenCallRelationship.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        
    	                        unflattenObject = unflattenCallRelationship;
                            }
                            break;
                	 case DECLAREDTYPE_TYPE:
                	 	{
    	                        IDeclaredType unflattenDeclaredType = new DeclaredType();
    	                        flatRelationshipMap.put(_flatObject, unflattenDeclaredType);
    	                        flatRelationshipIDMap.put(_flatObject.getFlatID(), _flatObject);
    	                		 // Attributes
    	                        unflattenDeclaredType.setRelationShipId(_flatObject.getRelationshipRelationShipId());
    	                        
    	                        unflattenObject = unflattenDeclaredType;
                            }
                            break;
                    default:
                        throw new IllegalArgumentException("Unknown object type: " + _flatObject.getFlatType());
                }
            }
            return unflattenObject;
        }
        
        /**
         * This method get the unflatten FlatRelationship that is identified by its flat identifier.
         * 
         * @param id
         *            identifier of the flat object
         * @return
         */
        public void resolveFlatRelationship(FlatRelationship _flatObject) {
        
        
            int flatType = _flatObject.getFlatType();
            Object unflattenObject = flatRelationshipMap.get(_flatObject);
            if (unflattenObject != null) {
                
                switch (_flatObject.getFlatType()) {
           			case INHERITANCEDEPENDENCY_TYPE:
                            IInheritanceDependency resolvedInheritanceDependency = (IInheritanceDependency) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedInheritanceDependency.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedInheritanceDependency.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
    	case REFERENCEDEPENDENCY_TYPE:
                            IReferenceDependency resolvedReferenceDependency = (IReferenceDependency) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedReferenceDependency.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedReferenceDependency.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
    	case RUNTIMEDEPENDENCY_TYPE:
                            IRuntimeDependency resolvedRuntimeDependency = (IRuntimeDependency) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedRuntimeDependency.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedRuntimeDependency.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
    	case INJECTIONDEPENDENCY_TYPE:
                            IInjectionDependency resolvedInjectionDependency = (IInjectionDependency) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedInjectionDependency.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedInjectionDependency.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                            {
                                // mapping
                                Integer mapping = _flatObject.getInjectionDependencyMapping();
    							if (mapping != null) {
    								resolvedInjectionDependency.setMapping((IAnalysedElement) resolveFlatAnalysedElementReference(mapping));
    							}
                            }
                   		break;
    	case FIELDREFERENCEDEPENDENCY_TYPE:
                            IFieldReferenceDependency resolvedFieldReferenceDependency = (IFieldReferenceDependency) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedFieldReferenceDependency.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedFieldReferenceDependency.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
    	case IMPORTREFERENCEDEPENDENCY_TYPE:
                            IImportReferenceDependency resolvedImportReferenceDependency = (IImportReferenceDependency) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedImportReferenceDependency.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedImportReferenceDependency.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
    	case RETURNTYPERELATIONSHIP_TYPE:
                            IReturnTypeRelationship resolvedReturnTypeRelationship = (IReturnTypeRelationship) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedReturnTypeRelationship.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedReturnTypeRelationship.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
    	case PARAMETERRELATIONSHIP_TYPE:
                            IParameterRelationship resolvedParameterRelationship = (IParameterRelationship) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedParameterRelationship.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedParameterRelationship.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
    	case CALLRELATIONSHIP_TYPE:
                            ICallRelationship resolvedCallRelationship = (ICallRelationship) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedCallRelationship.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedCallRelationship.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
    	case DECLAREDTYPE_TYPE:
                            IDeclaredType resolvedDeclaredType = (IDeclaredType) unflattenObject;
                            {
                                // target
                                Integer target = _flatObject.getRelationshipTarget();
    							if (target != null) {
    								resolvedDeclaredType.setTarget((IAnalysedElement) resolveFlatAnalysedElementReference(target));
    							}
                            }
                            {
                                // source
                                Integer source = _flatObject.getRelationshipSource();
    							if (source != null) {
    								resolvedDeclaredType.setSource((IAnalysedElement) resolveFlatAnalysedElementReference(source));
    							}
                            }
                   		break;
                	default:
                        throw new IllegalArgumentException("Unknown object type: " + _flatObject.getFlatType());
                }
            } else {
                throw new IllegalArgumentException("Unresolvable flat object: identifier isn't known");
            }
        }
        	
    }   	
}

