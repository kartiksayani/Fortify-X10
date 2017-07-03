/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import srf.transpiler.fortxtrans.fortXTrans.Expr;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.LocalVarDecl;
import srf.transpiler.fortxtrans.fortXTrans.Stmnt;
import srf.transpiler.fortxtrans.fortXTrans.StmntList;
import srf.transpiler.fortxtrans.fortXTrans.Stmnts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stmnts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.StmntsImpl#getFront <em>Front</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.StmntsImpl#getDelims <em>Delims</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.StmntsImpl#getLocVar <em>Loc Var</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.StmntsImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StmntsImpl extends MinimalEObjectImpl.Container implements Stmnts
{
  /**
   * The cached value of the '{@link #getFront() <em>Front</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFront()
   * @generated
   * @ordered
   */
  protected Stmnt front;

  /**
   * The cached value of the '{@link #getDelims() <em>Delims</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelims()
   * @generated
   * @ordered
   */
  protected StmntList delims;

  /**
   * The cached value of the '{@link #getLocVar() <em>Loc Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocVar()
   * @generated
   * @ordered
   */
  protected LocalVarDecl locVar;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expr exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StmntsImpl()
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
    return FortXTransPackage.Literals.STMNTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmnt getFront()
  {
    return front;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFront(Stmnt newFront, NotificationChain msgs)
  {
    Stmnt oldFront = front;
    front = newFront;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNTS__FRONT, oldFront, newFront);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFront(Stmnt newFront)
  {
    if (newFront != front)
    {
      NotificationChain msgs = null;
      if (front != null)
        msgs = ((InternalEObject)front).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNTS__FRONT, null, msgs);
      if (newFront != null)
        msgs = ((InternalEObject)newFront).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNTS__FRONT, null, msgs);
      msgs = basicSetFront(newFront, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNTS__FRONT, newFront, newFront));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StmntList getDelims()
  {
    return delims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelims(StmntList newDelims, NotificationChain msgs)
  {
    StmntList oldDelims = delims;
    delims = newDelims;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNTS__DELIMS, oldDelims, newDelims);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelims(StmntList newDelims)
  {
    if (newDelims != delims)
    {
      NotificationChain msgs = null;
      if (delims != null)
        msgs = ((InternalEObject)delims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNTS__DELIMS, null, msgs);
      if (newDelims != null)
        msgs = ((InternalEObject)newDelims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNTS__DELIMS, null, msgs);
      msgs = basicSetDelims(newDelims, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNTS__DELIMS, newDelims, newDelims));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVarDecl getLocVar()
  {
    return locVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocVar(LocalVarDecl newLocVar, NotificationChain msgs)
  {
    LocalVarDecl oldLocVar = locVar;
    locVar = newLocVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNTS__LOC_VAR, oldLocVar, newLocVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocVar(LocalVarDecl newLocVar)
  {
    if (newLocVar != locVar)
    {
      NotificationChain msgs = null;
      if (locVar != null)
        msgs = ((InternalEObject)locVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNTS__LOC_VAR, null, msgs);
      if (newLocVar != null)
        msgs = ((InternalEObject)newLocVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNTS__LOC_VAR, null, msgs);
      msgs = basicSetLocVar(newLocVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNTS__LOC_VAR, newLocVar, newLocVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expr newExp, NotificationChain msgs)
  {
    Expr oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNTS__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Expr newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNTS__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.STMNTS__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.STMNTS__EXP, newExp, newExp));
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
      case FortXTransPackage.STMNTS__FRONT:
        return basicSetFront(null, msgs);
      case FortXTransPackage.STMNTS__DELIMS:
        return basicSetDelims(null, msgs);
      case FortXTransPackage.STMNTS__LOC_VAR:
        return basicSetLocVar(null, msgs);
      case FortXTransPackage.STMNTS__EXP:
        return basicSetExp(null, msgs);
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
      case FortXTransPackage.STMNTS__FRONT:
        return getFront();
      case FortXTransPackage.STMNTS__DELIMS:
        return getDelims();
      case FortXTransPackage.STMNTS__LOC_VAR:
        return getLocVar();
      case FortXTransPackage.STMNTS__EXP:
        return getExp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FortXTransPackage.STMNTS__FRONT:
        setFront((Stmnt)newValue);
        return;
      case FortXTransPackage.STMNTS__DELIMS:
        setDelims((StmntList)newValue);
        return;
      case FortXTransPackage.STMNTS__LOC_VAR:
        setLocVar((LocalVarDecl)newValue);
        return;
      case FortXTransPackage.STMNTS__EXP:
        setExp((Expr)newValue);
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
      case FortXTransPackage.STMNTS__FRONT:
        setFront((Stmnt)null);
        return;
      case FortXTransPackage.STMNTS__DELIMS:
        setDelims((StmntList)null);
        return;
      case FortXTransPackage.STMNTS__LOC_VAR:
        setLocVar((LocalVarDecl)null);
        return;
      case FortXTransPackage.STMNTS__EXP:
        setExp((Expr)null);
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
      case FortXTransPackage.STMNTS__FRONT:
        return front != null;
      case FortXTransPackage.STMNTS__DELIMS:
        return delims != null;
      case FortXTransPackage.STMNTS__LOC_VAR:
        return locVar != null;
      case FortXTransPackage.STMNTS__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //StmntsImpl
