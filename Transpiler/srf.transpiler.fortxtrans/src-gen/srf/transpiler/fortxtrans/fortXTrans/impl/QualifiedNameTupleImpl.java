/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.QualifiedName;
import srf.transpiler.fortxtrans.fortXTrans.QualifiedNameTuple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Name Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.QualifiedNameTupleImpl#getQlist <em>Qlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedNameTupleImpl extends MinimalEObjectImpl.Container implements QualifiedNameTuple
{
  /**
   * The cached value of the '{@link #getQlist() <em>Qlist</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQlist()
   * @generated
   * @ordered
   */
  protected EList<QualifiedName> qlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualifiedNameTupleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FortXTransPackage.Literals.QUALIFIED_NAME_TUPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualifiedName> getQlist()
  {
    if (qlist == null)
    {
      qlist = new EObjectContainmentEList<QualifiedName>(QualifiedName.class, this, FortXTransPackage.QUALIFIED_NAME_TUPLE__QLIST);
    }
    return qlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FortXTransPackage.QUALIFIED_NAME_TUPLE__QLIST:
        return ((InternalEList<?>)getQlist()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FortXTransPackage.QUALIFIED_NAME_TUPLE__QLIST:
        return getQlist();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FortXTransPackage.QUALIFIED_NAME_TUPLE__QLIST:
        getQlist().clear();
        getQlist().addAll((Collection<? extends QualifiedName>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FortXTransPackage.QUALIFIED_NAME_TUPLE__QLIST:
        getQlist().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FortXTransPackage.QUALIFIED_NAME_TUPLE__QLIST:
        return qlist != null && !qlist.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QualifiedNameTupleImpl
