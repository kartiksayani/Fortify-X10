/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.QualifiedName#getS <em>S</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.QualifiedName#getDots <em>Dots</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName extends Qualified
{
  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference list.
   * The list contents are of type {@link srf.transpiler.fortxtrans.fortXTrans.SimpleName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference list.
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getQualifiedName_S()
   * @model containment="true"
   * @generated
   */
  EList<SimpleName> getS();

  /**
   * Returns the value of the '<em><b>Dots</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dots</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dots</em>' attribute.
   * @see #setDots(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getQualifiedName_Dots()
   * @model
   * @generated
   */
  String getDots();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.QualifiedName#getDots <em>Dots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dots</em>' attribute.
   * @see #getDots()
   * @generated
   */
  void setDots(String value);

} // QualifiedName
