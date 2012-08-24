
package com.tocea.codewatch.architecture.core.api;



import java.util.List;



/**
 * This type describes the common abstraction to all primitive elements that can be analyzed
 * and built automatically by a base language indexer.
 * <p>
 * 
 * @author Antoine Floc'h
 * @since 23 aožt 2012
 * @copyright Copyright (C) 2010-2012 TOCEA
 */
public interface IAnalysedElement extends IArchitectureVisitable
{
    
    
    /**
     * Get the value of the '<em><b>name</b></em>' reference.
     * 
     * @return the value of the '<em>name</em>' reference.
     */
    String getName();
    
    
    /**
     * Set the value of the '<em>name</em>' reference.
     * 
     * @param _name
     *            the new value of the '<em>name</em>' reference.
     */
    void setName(final String _name);
    
    
    /**
     * Get the value of the '<em><b>outgoingRelationships</b></em>' containment reference.
     * 
     * @return the value of the '<em>outgoingRelationships</em>' reference.
     */
    List<IRelationship> getOutgoingRelationships();
    
    
    /**
     * Set the value of the '<em>outgoingRelationships</em>' containment reference.
     * 
     * @param _outgoingRelationships
     *            the new value of the '<em>outgoingRelationships</em>' reference.
     */
    void setOutgoingRelationships(final List<IRelationship> _outgoingRelationships);
    
    
    /**
     * Get the value of the '<em><b>incomingRelationships</b></em>' reference.
     * 
     * @return the value of the '<em>incomingRelationships</em>' reference.
     */
    List<IRelationship> getIncomingRelationships();
    
    
    /**
     * Set the value of the '<em>incomingRelationships</em>' reference.
     * 
     * @param _incomingRelationships
     *            the new value of the '<em>incomingRelationships</em>' reference.
     */
    void setIncomingRelationships(final List<IRelationship> _incomingRelationships);
    
    
    /**
     * Get the value of the '<em><b>idAnalyzedElement</b></em>' reference.
     * 
     * @return the value of the '<em>idAnalyzedElement</em>' reference.
     */
    int getIdAnalyzedElement();
    
    
    /**
     * Set the value of the '<em>idAnalyzedElement</em>' reference.
     * 
     * @param _idAnalyzedElement
     *            the new value of the '<em>idAnalyzedElement</em>' reference.
     */
    void setIdAnalyzedElement(final int _idAnalyzedElement);
    
    
    /**
     * Get the value of the '<em><b>containedElements</b></em>' containment reference.
     * 
     * @return the value of the '<em>containedElements</em>' reference.
     */
    List<IAnalysedElement> getContainedElements();
    
    
    /**
     * Set the value of the '<em>containedElements</em>' containment reference.
     * 
     * @param _containedElements
     *            the new value of the '<em>containedElements</em>' reference.
     */
    void setContainedElements(final List<IAnalysedElement> _containedElements);
    
    
    /**
     * Get the value of the '<em><b>properties</b></em>' reference.
     * 
     * @return the value of the '<em>properties</em>' reference.
     */
    int getProperties();
    
    
    /**
     * Set the value of the '<em>properties</em>' reference.
     * 
     * @param _properties
     *            the new value of the '<em>properties</em>' reference.
     */
    void setProperties(final int _properties);
    
    
    /**
     * Get the value of the '<em><b>parent</b></em>' reference.
     * 
     * @return the value of the '<em>parent</em>' reference.
     */
    IAnalysedElement getParent();
    
    
    /**
     * Set the value of the '<em>parent</em>' reference.
     * 
     * @param _parent
     *            the new value of the '<em>parent</em>' reference.
     */
    void setParent(final IAnalysedElement _parent);
    
    
    /**
     * This method call the visitor behavior.
     * 
     * @param _visitor
     *            the visitor to accept
     */
    public void accept(IArchitectureVisitor _visitor);
}
