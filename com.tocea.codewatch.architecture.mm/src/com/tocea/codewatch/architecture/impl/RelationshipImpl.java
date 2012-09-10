/**
 */
package com.tocea.codewatch.architecture.impl;

import com.tocea.codewatch.architecture.AnalysedElement;
import com.tocea.codewatch.architecture.ArchitecturePackage;
import com.tocea.codewatch.architecture.Relationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.RelationshipImpl#getRelationShipId <em>Relation Ship Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationshipImpl extends EObjectImpl implements Relationship {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AnalysedElement target;

	/**
	 * The default value of the '{@link #getRelationShipId() <em>Relation Ship Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationShipId()
	 * @generated
	 * @ordered
	 */
	protected static final int RELATION_SHIP_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelationShipId() <em>Relation Ship Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationShipId()
	 * @generated
	 * @ordered
	 */
	protected int relationShipId = RELATION_SHIP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysedElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (AnalysedElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysedElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(AnalysedElement newTarget, NotificationChain msgs) {
		AnalysedElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.RELATIONSHIP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AnalysedElement newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS, AnalysedElement.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS, AnalysedElement.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.RELATIONSHIP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysedElement getSource() {
		if (eContainerFeatureID() != ArchitecturePackage.RELATIONSHIP__SOURCE) return null;
		return (AnalysedElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AnalysedElement newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, ArchitecturePackage.RELATIONSHIP__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AnalysedElement newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != ArchitecturePackage.RELATIONSHIP__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS, AnalysedElement.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.RELATIONSHIP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelationShipId() {
		return relationShipId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationShipId(int newRelationShipId) {
		int oldRelationShipId = relationShipId;
		relationShipId = newRelationShipId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.RELATIONSHIP__RELATION_SHIP_ID, oldRelationShipId, relationShipId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.RELATIONSHIP__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ArchitecturePackage.ANALYSED_ELEMENT__INCOMING_RELATIONSHIPS, AnalysedElement.class, msgs);
				return basicSetTarget((AnalysedElement)otherEnd, msgs);
			case ArchitecturePackage.RELATIONSHIP__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((AnalysedElement)otherEnd, msgs);
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
			case ArchitecturePackage.RELATIONSHIP__TARGET:
				return basicSetTarget(null, msgs);
			case ArchitecturePackage.RELATIONSHIP__SOURCE:
				return basicSetSource(null, msgs);
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
			case ArchitecturePackage.RELATIONSHIP__SOURCE:
				return eInternalContainer().eInverseRemove(this, ArchitecturePackage.ANALYSED_ELEMENT__OUTGOING_RELATIONSHIPS, AnalysedElement.class, msgs);
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
			case ArchitecturePackage.RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ArchitecturePackage.RELATIONSHIP__SOURCE:
				return getSource();
			case ArchitecturePackage.RELATIONSHIP__RELATION_SHIP_ID:
				return getRelationShipId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturePackage.RELATIONSHIP__TARGET:
				setTarget((AnalysedElement)newValue);
				return;
			case ArchitecturePackage.RELATIONSHIP__SOURCE:
				setSource((AnalysedElement)newValue);
				return;
			case ArchitecturePackage.RELATIONSHIP__RELATION_SHIP_ID:
				setRelationShipId((Integer)newValue);
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
			case ArchitecturePackage.RELATIONSHIP__TARGET:
				setTarget((AnalysedElement)null);
				return;
			case ArchitecturePackage.RELATIONSHIP__SOURCE:
				setSource((AnalysedElement)null);
				return;
			case ArchitecturePackage.RELATIONSHIP__RELATION_SHIP_ID:
				setRelationShipId(RELATION_SHIP_ID_EDEFAULT);
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
			case ArchitecturePackage.RELATIONSHIP__TARGET:
				return target != null;
			case ArchitecturePackage.RELATIONSHIP__SOURCE:
				return getSource() != null;
			case ArchitecturePackage.RELATIONSHIP__RELATION_SHIP_ID:
				return relationShipId != RELATION_SHIP_ID_EDEFAULT;
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
		result.append(" (relationShipId: ");
		result.append(relationShipId);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
