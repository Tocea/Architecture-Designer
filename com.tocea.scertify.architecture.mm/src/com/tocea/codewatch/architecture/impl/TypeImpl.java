/**
 */
package com.tocea.codewatch.architecture.impl;

import com.tocea.codewatch.architecture.ArchitecturePackage;
import com.tocea.codewatch.architecture.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tocea.codewatch.architecture.impl.TypeImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.TypeImpl#isSource <em>Source</em>}</li>
 *   <li>{@link com.tocea.codewatch.architecture.impl.TypeImpl#isBinary <em>Binary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends AnalysedElementImpl implements Type {
	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSource()
	 * @generated
	 * @ordered
	 */
	protected boolean source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBinary() <em>Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBinary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BINARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBinary() <em>Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBinary()
	 * @generated
	 * @ordered
	 */
	protected boolean binary = BINARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TYPE__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(boolean newSource) {
		boolean oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TYPE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBinary() {
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinary(boolean newBinary) {
		boolean oldBinary = binary;
		binary = newBinary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TYPE__BINARY, oldBinary, binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.TYPE__QUALIFIED_NAME:
				return getQualifiedName();
			case ArchitecturePackage.TYPE__SOURCE:
				return isSource();
			case ArchitecturePackage.TYPE__BINARY:
				return isBinary();
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
			case ArchitecturePackage.TYPE__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case ArchitecturePackage.TYPE__SOURCE:
				setSource((Boolean)newValue);
				return;
			case ArchitecturePackage.TYPE__BINARY:
				setBinary((Boolean)newValue);
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
			case ArchitecturePackage.TYPE__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case ArchitecturePackage.TYPE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ArchitecturePackage.TYPE__BINARY:
				setBinary(BINARY_EDEFAULT);
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
			case ArchitecturePackage.TYPE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case ArchitecturePackage.TYPE__SOURCE:
				return source != SOURCE_EDEFAULT;
			case ArchitecturePackage.TYPE__BINARY:
				return binary != BINARY_EDEFAULT;
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
		result.append(" (qualifiedName: ");
		result.append(qualifiedName);
		result.append(", source: ");
		result.append(source);
		result.append(", binary: ");
		result.append(binary);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
