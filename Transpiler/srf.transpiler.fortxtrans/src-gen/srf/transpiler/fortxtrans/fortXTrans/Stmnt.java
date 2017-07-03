/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stmnt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Stmnt#getDelim <em>Delim</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getStmnt()
 * @model
 * @generated
 */
public interface Stmnt extends EObject
{
  /**
   * Returns the value of the '<em><b>Delim</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delim</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delim</em>' containment reference.
   * @see #setDelim(DelimitedExpr)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getStmnt_Delim()
   * @model containment="true"
   * @generated
   */
  DelimitedExpr getDelim();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Stmnt#getDelim <em>Delim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delim</em>' containment reference.
   * @see #getDelim()
   * @generated
   */
  void setDelim(DelimitedExpr value);

} // Stmnt
