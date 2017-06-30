/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#getImpname <em>Impname</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#isExcept <em>Except</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#getSimp <em>Simp</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#getSimpList <em>Simp List</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#isComma <em>Comma</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#isDots <em>Dots</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#getAsname <em>Asname</em>}</li>
 * </ul>
 *
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getImportedNames()
 * @model
 * @generated
 */
public interface ImportedNames extends EObject
{
  /**
   * Returns the value of the '<em><b>Impname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impname</em>' containment reference.
   * @see #setImpname(QualifiedName)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getImportedNames_Impname()
   * @model containment="true"
   * @generated
   */
  QualifiedName getImpname();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#getImpname <em>Impname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impname</em>' containment reference.
   * @see #getImpname()
   * @generated
   */
  void setImpname(QualifiedName value);

  /**
   * Returns the value of the '<em><b>Except</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Except</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Except</em>' attribute.
   * @see #setExcept(boolean)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getImportedNames_Except()
   * @model
   * @generated
   */
  boolean isExcept();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#isExcept <em>Except</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Except</em>' attribute.
   * @see #isExcept()
   * @generated
   */
  void setExcept(boolean value);

  /**
   * Returns the value of the '<em><b>Simp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simp</em>' containment reference.
   * @see #setSimp(SimpleNames)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getImportedNames_Simp()
   * @model containment="true"
   * @generated
   */
  SimpleNames getSimp();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#getSimp <em>Simp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simp</em>' containment reference.
   * @see #getSimp()
   * @generated
   */
  void setSimp(SimpleNames value);

  /**
   * Returns the value of the '<em><b>Simp List</b></em>' containment reference list.
   * The list contents are of type {@link srf.transpiler.fortxtrans.fortXTrans.AliasedSimpleName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simp List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simp List</em>' containment reference list.
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getImportedNames_SimpList()
   * @model containment="true"
   * @generated
   */
  EList<AliasedSimpleName> getSimpList();

  /**
   * Returns the value of the '<em><b>Comma</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comma</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comma</em>' attribute.
   * @see #setComma(boolean)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getImportedNames_Comma()
   * @model
   * @generated
   */
  boolean isComma();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#isComma <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comma</em>' attribute.
   * @see #isComma()
   * @generated
   */
  void setComma(boolean value);

  /**
   * Returns the value of the '<em><b>Dots</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dots</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dots</em>' attribute.
   * @see #setDots(boolean)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getImportedNames_Dots()
   * @model
   * @generated
   */
  boolean isDots();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#isDots <em>Dots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dots</em>' attribute.
   * @see #isDots()
   * @generated
   */
  void setDots(boolean value);

  /**
   * Returns the value of the '<em><b>Asname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asname</em>' attribute.
   * @see #setAsname(String)
   * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage#getImportedNames_Asname()
   * @model
   * @generated
   */
  String getAsname();

  /**
   * Sets the value of the '{@link srf.transpiler.fortxtrans.fortXTrans.ImportedNames#getAsname <em>Asname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asname</em>' attribute.
   * @see #getAsname()
   * @generated
   */
  void setAsname(String value);

} // ImportedNames
