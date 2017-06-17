/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.example.domainmodel.domainModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainModel.PackageDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainModel.PackageDecl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainModel.DomainModelPackage#getPackageDecl()
 * @model
 * @generated
 */
public interface PackageDecl extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.domainmodel.domainModel.DomainModelPackage#getPackageDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainModel.PackageDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainModel.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.example.domainmodel.domainModel.DomainModelPackage#getPackageDecl_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // PackageDecl
