/**
 */
package com.tocea.codewatch.architecture.impl;

import com.tocea.codewatch.architecture.AnalysedElement;
import com.tocea.codewatch.architecture.ArchitecturePackage;
import com.tocea.codewatch.architecture.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl#getOutgoingRelationships <em>Outgoing Relationships</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl#getIncomingRelationships <em>Incoming Relationships</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl#getIdAnalyzedElement <em>Id Analyzed Element</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.AnalysedElementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AnalysedElementImpl extends EObjectImpl implements AnalysedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingRelationships() <em>Outgoing Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> outgoingRelationships;

	/**
	 * The cached value of the '{@link #getIncomingRelationships() <em>Incoming Relationships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> incomingRelationships;

	/**
	 * The default value of the '{@link #getIdAnalyzedElement() <em>Id Analyzed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAnalyzedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_ANALYZED_ELEMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdAnalyzedElement() <em>Id Analyzed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAnalyzedElement()
	 * @generated
	 * @ordered
	 */
	protected int idAnalyzedElement = ID_ANALYZED_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysedElement> containedElements;

	/**
	 * The default value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected static final int PROPERTIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected int properties = PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ANALYSED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ANALYSED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getOutgoingRelationships() {
		if (outgoingRelationships == null) {
			outgoingRelationships = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS, ArchitecturePackage.RELATIONSHIP__SOURCE);
		}
		return outgoingRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getIncomingRelationships() {
		if (incomingRelationships == null) {
			incomingRelationships = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS, ArchitecturePackage.RELATIONSHIP__TARGET);
		}
		return incomingRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdAnalyzedElement() {
		return idAnalyzedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAnalyzedElement(int newIdAnalyzedElement) {
		int oldIdAnalyzedElement = idAnalyzedElement;
		idAnalyzedElement = newIdAnalyzedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT, oldIdAnalyzedElement, idAnalyzedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysedElement> getContainedElements() {
		if (containedElements == null) {
			containedElements = new EObjectContainmentWithInverseEList<AnalysedElement>(AnalysedElement.class, this, ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS, ArchitecturePackage.ANALYSED_ELEMENT__PARENT);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(int newProperties) {
		int oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ANALYSED_ELEMENT__PROPERTIES, oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysedElement getParent() {
		if (eContainerFeatureID() != ArchitecturePackage.ANALYSED_ELEMENT__PARENT) return null;
		return (AnalysedElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AnalysedElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ArchitecturePackage.ANALYSED_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AnalysedElement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ArchitecturePackage.ANALYSED_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS, AnalysedElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ANALYSED_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingRelationships()).basicAdd(otherEnd, msgs);
			case ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingRelationships()).basicAdd(otherEnd, msgs);
			case ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedElements()).basicAdd(otherEnd, msgs);
			case ArchitecturePackage.ANALYSED_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AnalysedElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS:
				return ((InternalEList<?>)getOutgoingRelationships()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS:
				return ((InternalEList<?>)getIncomingRelationships()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS:
				return ((InternalEList<?>)getContainedElements()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ANALYSED_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ArchitecturePackage.ANALYSED_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS, AnalysedElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.ANALYSED_ELEMENT__NAME:
				return getName();
			case ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS:
				return getOutgoingRelationships();
			case ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS:
				return getIncomingRelationships();
			case ArchitecturePackage.ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT:
				return getIdAnalyzedElement();
			case ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS:
				return getContainedElements();
			case ArchitecturePackage.ANALYSED_ELEMENT__PROPERTIES:
				return getProperties();
			case ArchitecturePackage.ANALYSED_ELEMENT__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturePackage.ANALYSED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS:
				getOutgoingRelationships().clear();
				getOutgoingRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS:
				getIncomingRelationships().clear();
				getIncomingRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT:
				setIdAnalyzedElement((Integer)newValue);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				getContainedElements().addAll((Collection<? extends AnalysedElement>)newValue);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__PROPERTIES:
				setProperties((Integer)newValue);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__PARENT:
				setParent((AnalysedElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.ANALYSED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS:
				getOutgoingRelationships().clear();
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS:
				getIncomingRelationships().clear();
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT:
				setIdAnalyzedElement(ID_ANALYZED_ELEMENT_EDEFAULT);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__PROPERTIES:
				setProperties(PROPERTIES_EDEFAULT);
				return;
			case ArchitecturePackage.ANALYSED_ELEMENT__PARENT:
				setParent((AnalysedElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.ANALYSED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS:
				return outgoingRelationships != null && !outgoingRelationships.isEmpty();
			case ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS:
				return incomingRelationships != null && !incomingRelationships.isEmpty();
			case ArchitecturePackage.ANALYSED_ELEMENT__ID_ANALYZED_ELEMENT:
				return idAnalyzedElement != ID_ANALYZED_ELEMENT_EDEFAULT;
			case ArchitecturePackage.ANALYSED_ELEMENT__CONTAINED_ELEMENTS:
				return containedElements != null && !containedElements.isEmpty();
			case ArchitecturePackage.ANALYSED_ELEMENT__PROPERTIES:
				return properties != PROPERTIES_EDEFAULT;
			case ArchitecturePackage.ANALYSED_ELEMENT__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", idAnalyzedElement: ");
		result.append(idAnalyzedElement);
		result.append(", properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}

} //AnalysedElementImpl
