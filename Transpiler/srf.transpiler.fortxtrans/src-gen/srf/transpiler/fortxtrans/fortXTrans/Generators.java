/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Generators#getBinding <em>Binding</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.Generators#getClause <em>Clause</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenerators()
 * @model
 * @generated
 */
public interface Generators extends EObject
{
  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference.
   * @see #setBinding(Binding)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenerators_Binding()
   * @model containment="true"
   * @generated
   */
  Binding getBinding();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.Generators#getBinding <em>Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding</em>' containment reference.
   * @see #getBinding()
   * @generated
   */
  void setBinding(Binding value);

  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
   * The list contents are of type {@link srf.transpiler.fortxtrans.fortXTrans.GenClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference list.
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getGenerators_Clause()
   * @model containment="true"
   * @generated
   */
  EList<GenClause> getClause();

} // Generators