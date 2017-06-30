/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aliased API Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.AliasedAPIName#getOrig <em>Orig</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.AliasedAPIName#getAsName <em>As Name</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getAliasedAPIName()
 * @model
 * @generated
 */
public interface AliasedAPIName extends EObject
{
  /**
   * Returns the value of the '<em><b>Orig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orig</em>' containment reference.
   * @see #setOrig(QualifiedName)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getAliasedAPIName_Orig()
   * @model containment="true"
   * @generated
   */
  QualifiedName getOrig();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.AliasedAPIName#getOrig <em>Orig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orig</em>' containment reference.
   * @see #getOrig()
   * @generated
   */
  void setOrig(QualifiedName value);

  /**
   * Returns the value of the '<em><b>As Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>As Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>As Name</em>' attribute.
   * @see #setAsName(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getAliasedAPIName_AsName()
   * @model
   * @generated
   */
  String getAsName();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.AliasedAPIName#getAsName <em>As Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>As Name</em>' attribute.
   * @see #getAsName()
   * @generated
   */
  void setAsName(String value);

} // AliasedAPIName
