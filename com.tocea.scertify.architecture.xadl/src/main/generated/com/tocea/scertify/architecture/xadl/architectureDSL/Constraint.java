/**
 */
package com.tocea.scertify.architecture.xadl.architectureDSL;

import com.tocea.codewatch.architecture.query.dsl.queryDsl.Query;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getQuery <em>Query</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getComparator <em>Comparator</em>}</li>
 *   <li>{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' reference.
   * @see #setQuery(Query)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getConstraint_Query()
   * @model
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getQuery <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

  /**
   * Returns the value of the '<em><b>Comparator</b></em>' attribute.
   * The literals are from the enumeration {@link com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparator</em>' attribute.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator
   * @see #setComparator(MetricComparator)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getConstraint_Comparator()
   * @model
   * @generated
   */
  MetricComparator getComparator();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getComparator <em>Comparator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparator</em>' attribute.
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.MetricComparator
   * @see #getComparator()
   * @generated
   */
  void setComparator(MetricComparator value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(XExpression)
   * @see com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureDSLPackage#getConstraint_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link com.tocea.scertify.architecture.xadl.architectureDSL.Constraint#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

} // Constraint
