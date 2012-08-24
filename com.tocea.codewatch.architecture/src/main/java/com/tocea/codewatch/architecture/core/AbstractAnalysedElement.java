package com.tocea.codewatch.architecture.core;

import java.util.ArrayList;
import java.util.List;

import com.tocea.codewatch.architecture.core.api.IAnalysedElement;
import com.tocea.codewatch.architecture.core.api.IArchitectureVisitor;
import com.tocea.codewatch.architecture.core.api.IRelationship;


public abstract class AbstractAnalysedElement implements IAnalysedElement	
{	
	protected String name;
	protected List<IRelationship> outgoingRelationships;
	protected List<IRelationship> incomingRelationships;
	protected int idAnalyzedElement;
	protected List<IAnalysedElement> containedElements;
	protected int properties;
	protected IAnalysedElement parent;
	
	
	public AbstractAnalysedElement(){
	}
		
	
	
	/**
	 * Get the value of the '<em><b>name</b></em>' attribute.
	 * 
	 * @return the value of the '<em>name</em>' attribute.
	 */
	public String getName(){
		
		
		return this.name;
	}
	
	
	/**
	 * Set the value of the '<em>name</em>' reference.
	 * @param _name 
	 *            the new value of the '<em>name</em>' reference.
	 */
	public void setName(final String _name){
		
		
		this.name = _name;
	}
	
	
	/**
	 * Get the value of the '<em><b>outgoingRelationships</b></em>' containment  reference.
	 * 
	 * @return the value of the '<em>outgoingRelationships</em>' reference.
	 */
	public List<IRelationship> getOutgoingRelationships(){
		
		
		if(this.outgoingRelationships==null){
			this.outgoingRelationships = new ArrayList<IRelationship>();
		}
		return this.outgoingRelationships;
		
	}
	
	
	/**
	 * Set the value of the '<em>outgoingRelationships</em>' reference.
	 * @param _outgoingRelationships 
	 *            the new value of the '<em>outgoingRelationships</em>' reference.
	 */
	public void setOutgoingRelationships(List<IRelationship> _outgoingRelationships){
		
		
		this.outgoingRelationships = _outgoingRelationships;
	}
	
	
	/**
	 * Get the value of the '<em><b>incomingRelationships</b></em>' reference.
	 * 
	 * @return the value of the '<em>incomingRelationships</em>' reference.
	 */
	public List<IRelationship> getIncomingRelationships(){
		
		
		if(this.incomingRelationships==null){
			this.incomingRelationships = new ArrayList<IRelationship>();
		}
		return this.incomingRelationships;
		
	}
	
	
	/**
	 * Set the value of the '<em>incomingRelationships</em>' reference.
	 * @param _incomingRelationships 
	 *            the new value of the '<em>incomingRelationships</em>' reference.
	 */
	public void setIncomingRelationships(List<IRelationship> _incomingRelationships){
		
		
		this.incomingRelationships = _incomingRelationships;
	}
	
	
	/**
	 * Get the value of the '<em><b>idAnalyzedElement</b></em>' attribute.
	 * 
	 * @return the value of the '<em>idAnalyzedElement</em>' attribute.
	 */
	public int getIdAnalyzedElement(){
		
		
		return this.idAnalyzedElement;
	}
	
	
	/**
	 * Set the value of the '<em>idAnalyzedElement</em>' reference.
	 * @param _idAnalyzedElement 
	 *            the new value of the '<em>idAnalyzedElement</em>' reference.
	 */
	public void setIdAnalyzedElement(final int _idAnalyzedElement){
		
		
		this.idAnalyzedElement = _idAnalyzedElement;
	}
	
	
	/**
	 * Get the value of the '<em><b>containedElements</b></em>' containment  reference.
	 * 
	 * @return the value of the '<em>containedElements</em>' reference.
	 */
	public List<IAnalysedElement> getContainedElements(){
		
		
		if(this.containedElements==null){
			this.containedElements = new ArrayList<IAnalysedElement>();
		}
		return this.containedElements;
		
	}
	
	
	/**
	 * Set the value of the '<em>containedElements</em>' reference.
	 * @param _containedElements 
	 *            the new value of the '<em>containedElements</em>' reference.
	 */
	public void setContainedElements(List<IAnalysedElement> _containedElements){
		
		
		this.containedElements = _containedElements;
	}
	
	
	/**
	 * Get the value of the '<em><b>properties</b></em>' attribute.
	 * 
	 * @return the value of the '<em>properties</em>' attribute.
	 */
	public int getProperties(){
		
		
		return this.properties;
	}
	
	
	/**
	 * Set the value of the '<em>properties</em>' reference.
	 * @param _properties 
	 *            the new value of the '<em>properties</em>' reference.
	 */
	public void setProperties(final int _properties){
		
		
		this.properties = _properties;
	}
	
	
	/**
	 * Get the value of the '<em><b>parent</b></em>' reference.
	 * 
	 * @return the value of the '<em>parent</em>' reference.
	 */
	public IAnalysedElement getParent(){
		
		
		return this.parent;
		
	}
	
	
	/**
	 * Set the value of the '<em>parent</em>' reference.
	 * @param _parent 
	 *            the new value of the '<em>parent</em>' reference.
	 */
	public void setParent(IAnalysedElement _parent){
		
		
		this.parent = _parent;
	}
	

	
	
	
	
	/**
	 * This method call the visitor behavior.
	 * 
	 * @param _visitor
	 *            the visitor to accept
	 */	
	public void accept(IArchitectureVisitor _visitor){
		_visitor.visitAnalysedElement(this);
	}
}
