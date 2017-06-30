/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Param#getBId <em>BId</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Param#getIstype <em>Istype</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getParam()
 * @model
 * @generated
 */
public interface Param extends EObject
{
  /**
   * Returns the value of the '<em><b>BId</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BId</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BId</em>' containment reference.
   * @see #setBId(BindId)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getParam_BId()
   * @model containment="true"
   * @generated
   */
  BindId getBId();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Param#getBId <em>BId</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BId</em>' containment reference.
   * @see #getBId()
   * @generated
   */
  void setBId(BindId value);

  /**
   * Returns the value of the '<em><b>Istype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Istype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Istype</em>' containment reference.
   * @see #setIstype(IsType)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getParam_Istype()
   * @model containment="true"
   * @generated
   */
  IsType getIstype();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Param#getIstype <em>Istype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Istype</em>' containment reference.
   * @see #getIstype()
   * @generated
   */
  void setIstype(IsType value);

} // Param
