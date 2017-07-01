/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.GenSource#getStart <em>Start</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.GenSource#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenSource()
 * @model
 * @generated
 */
public interface GenSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(Expr)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenSource_Start()
   * @model containment="true"
   * @generated
   */
  Expr getStart();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.GenSource#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(Expr value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(Expr)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenSource_End()
   * @model containment="true"
   * @generated
   */
  Expr getEnd();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.GenSource#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(Expr value);

} // GenSource
