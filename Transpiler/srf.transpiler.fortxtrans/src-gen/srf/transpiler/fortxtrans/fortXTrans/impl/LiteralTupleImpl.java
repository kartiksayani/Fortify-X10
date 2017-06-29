/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.Literal;
import srf.transpiler.fortxtrans.fortXTrans.LiteralTuple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LiteralTupleImpl#getLit <em>Lit</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LiteralTupleImpl#getLits <em>Lits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralTupleImpl extends MinimalEObjectImpl.Container implements LiteralTuple
{
  /**
   * The cached value of the '{@link #getLit() <em>Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected Literal lit;

  /**
   * The cached value of the '{@link #getLits() <em>Lits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLits()
   * @generated
   * @ordered
   */
  protected EList<Literal> lits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralTupleImpl()
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
    return FortXTransPackage.Literals.LITERAL_TUPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getLit()
  {
    return lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLit(Literal newLit, NotificationChain msgs)
  {
    Literal oldLit = lit;
    lit = newLit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.LITERAL_TUPLE__LIT, oldLit, newLit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLit(Literal newLit)
  {
    if (newLit != lit)
    {
      NotificationChain msgs = null;
      if (lit != null)
        msgs = ((InternalEObject)lit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LITERAL_TUPLE__LIT, null, msgs);
      if (newLit != null)
        msgs = ((InternalEObject)newLit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LITERAL_TUPLE__LIT, null, msgs);
      msgs = basicSetLit(newLit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LITERAL_TUPLE__LIT, newLit, newLit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Literal> getLits()
  {
    if (lits == null)
    {
      lits = new EObjectContainmentEList<Literal>(Literal.class, this, FortXTransPackage.LITERAL_TUPLE__LITS);
    }
    return lits;
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
      case FortXTransPackage.LITERAL_TUPLE__LIT:
        return basicSetLit(null, msgs);
      case FortXTransPackage.LITERAL_TUPLE__LITS:
        return ((InternalEList<?>)getLits()).basicRemove(otherEnd, msgs);
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
      case FortXTransPackage.LITERAL_TUPLE__LIT:
        return getLit();
      case FortXTransPackage.LITERAL_TUPLE__LITS:
        return getLits();
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
      case FortXTransPackage.LITERAL_TUPLE__LIT:
        setLit((Literal)newValue);
        return;
      case FortXTransPackage.LITERAL_TUPLE__LITS:
        getLits().clear();
        getLits().addAll((Collection<? extends Literal>)newValue);
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
      case FortXTransPackage.LITERAL_TUPLE__LIT:
        setLit((Literal)null);
        return;
      case FortXTransPackage.LITERAL_TUPLE__LITS:
        getLits().clear();
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
      case FortXTransPackage.LITERAL_TUPLE__LIT:
        return lit != null;
      case FortXTransPackage.LITERAL_TUPLE__LITS:
        return lits != null && !lits.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LiteralTupleImpl