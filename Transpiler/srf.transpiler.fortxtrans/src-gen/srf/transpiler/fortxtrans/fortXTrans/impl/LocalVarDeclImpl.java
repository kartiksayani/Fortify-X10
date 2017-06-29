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

import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.IdOrTuple;
import srf.transpiler.fortxtrans.fortXTrans.InitVal;
import srf.transpiler.fortxtrans.fortXTrans.LiteralTuple;
import srf.transpiler.fortxtrans.fortXTrans.LocalVarDecl;
import srf.transpiler.fortxtrans.fortXTrans.NoNewlineVarWTypes;
import srf.transpiler.fortxtrans.fortXTrans.TupleType;
import srf.transpiler.fortxtrans.fortXTrans.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LocalVarDeclImpl#getMut <em>Mut</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LocalVarDeclImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LocalVarDeclImpl#getInit <em>Init</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LocalVarDeclImpl#getIdtup <em>Idtup</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LocalVarDeclImpl#getLitTup <em>Lit Tup</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LocalVarDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.LocalVarDeclImpl#getTuptype <em>Tuptype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalVarDeclImpl extends MinimalEObjectImpl.Container implements LocalVarDecl
{
  /**
   * The default value of the '{@link #getMut() <em>Mut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMut()
   * @generated
   * @ordered
   */
  protected static final String MUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMut() <em>Mut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMut()
   * @generated
   * @ordered
   */
  protected String mut = MUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected NoNewlineVarWTypes vars;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected InitVal init;

  /**
   * The cached value of the '{@link #getIdtup() <em>Idtup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdtup()
   * @generated
   * @ordered
   */
  protected IdOrTuple idtup;

  /**
   * The cached value of the '{@link #getLitTup() <em>Lit Tup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLitTup()
   * @generated
   * @ordered
   */
  protected LiteralTuple litTup;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getTuptype() <em>Tuptype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuptype()
   * @generated
   * @ordered
   */
  protected TupleType tuptype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalVarDeclImpl()
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
    return FortXTransPackage.Literals.LOCAL_VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMut()
  {
    return mut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMut(String newMut)
  {
    String oldMut = mut;
    mut = newMut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__MUT, oldMut, mut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoNewlineVarWTypes getVars()
  {
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVars(NoNewlineVarWTypes newVars, NotificationChain msgs)
  {
    NoNewlineVarWTypes oldVars = vars;
    vars = newVars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__VARS, oldVars, newVars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVars(NoNewlineVarWTypes newVars)
  {
    if (newVars != vars)
    {
      NotificationChain msgs = null;
      if (vars != null)
        msgs = ((InternalEObject)vars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__VARS, null, msgs);
      if (newVars != null)
        msgs = ((InternalEObject)newVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__VARS, null, msgs);
      msgs = basicSetVars(newVars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__VARS, newVars, newVars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitVal getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(InitVal newInit, NotificationChain msgs)
  {
    InitVal oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(InitVal newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdOrTuple getIdtup()
  {
    return idtup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdtup(IdOrTuple newIdtup, NotificationChain msgs)
  {
    IdOrTuple oldIdtup = idtup;
    idtup = newIdtup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__IDTUP, oldIdtup, newIdtup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdtup(IdOrTuple newIdtup)
  {
    if (newIdtup != idtup)
    {
      NotificationChain msgs = null;
      if (idtup != null)
        msgs = ((InternalEObject)idtup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__IDTUP, null, msgs);
      if (newIdtup != null)
        msgs = ((InternalEObject)newIdtup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__IDTUP, null, msgs);
      msgs = basicSetIdtup(newIdtup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__IDTUP, newIdtup, newIdtup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralTuple getLitTup()
  {
    return litTup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLitTup(LiteralTuple newLitTup, NotificationChain msgs)
  {
    LiteralTuple oldLitTup = litTup;
    litTup = newLitTup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP, oldLitTup, newLitTup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLitTup(LiteralTuple newLitTup)
  {
    if (newLitTup != litTup)
    {
      NotificationChain msgs = null;
      if (litTup != null)
        msgs = ((InternalEObject)litTup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP, null, msgs);
      if (newLitTup != null)
        msgs = ((InternalEObject)newLitTup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP, null, msgs);
      msgs = basicSetLitTup(newLitTup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP, newLitTup, newLitTup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleType getTuptype()
  {
    return tuptype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTuptype(TupleType newTuptype, NotificationChain msgs)
  {
    TupleType oldTuptype = tuptype;
    tuptype = newTuptype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE, oldTuptype, newTuptype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTuptype(TupleType newTuptype)
  {
    if (newTuptype != tuptype)
    {
      NotificationChain msgs = null;
      if (tuptype != null)
        msgs = ((InternalEObject)tuptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE, null, msgs);
      if (newTuptype != null)
        msgs = ((InternalEObject)newTuptype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE, null, msgs);
      msgs = basicSetTuptype(newTuptype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE, newTuptype, newTuptype));
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
      case FortXTransPackage.LOCAL_VAR_DECL__VARS:
        return basicSetVars(null, msgs);
      case FortXTransPackage.LOCAL_VAR_DECL__INIT:
        return basicSetInit(null, msgs);
      case FortXTransPackage.LOCAL_VAR_DECL__IDTUP:
        return basicSetIdtup(null, msgs);
      case FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP:
        return basicSetLitTup(null, msgs);
      case FortXTransPackage.LOCAL_VAR_DECL__TYPE:
        return basicSetType(null, msgs);
      case FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE:
        return basicSetTuptype(null, msgs);
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
      case FortXTransPackage.LOCAL_VAR_DECL__MUT:
        return getMut();
      case FortXTransPackage.LOCAL_VAR_DECL__VARS:
        return getVars();
      case FortXTransPackage.LOCAL_VAR_DECL__INIT:
        return getInit();
      case FortXTransPackage.LOCAL_VAR_DECL__IDTUP:
        return getIdtup();
      case FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP:
        return getLitTup();
      case FortXTransPackage.LOCAL_VAR_DECL__TYPE:
        return getType();
      case FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE:
        return getTuptype();
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
      case FortXTransPackage.LOCAL_VAR_DECL__MUT:
        setMut((String)newValue);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__VARS:
        setVars((NoNewlineVarWTypes)newValue);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__INIT:
        setInit((InitVal)newValue);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__IDTUP:
        setIdtup((IdOrTuple)newValue);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP:
        setLitTup((LiteralTuple)newValue);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__TYPE:
        setType((Type)newValue);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE:
        setTuptype((TupleType)newValue);
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
      case FortXTransPackage.LOCAL_VAR_DECL__MUT:
        setMut(MUT_EDEFAULT);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__VARS:
        setVars((NoNewlineVarWTypes)null);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__INIT:
        setInit((InitVal)null);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__IDTUP:
        setIdtup((IdOrTuple)null);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP:
        setLitTup((LiteralTuple)null);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__TYPE:
        setType((Type)null);
        return;
      case FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE:
        setTuptype((TupleType)null);
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
      case FortXTransPackage.LOCAL_VAR_DECL__MUT:
        return MUT_EDEFAULT == null ? mut != null : !MUT_EDEFAULT.equals(mut);
      case FortXTransPackage.LOCAL_VAR_DECL__VARS:
        return vars != null;
      case FortXTransPackage.LOCAL_VAR_DECL__INIT:
        return init != null;
      case FortXTransPackage.LOCAL_VAR_DECL__IDTUP:
        return idtup != null;
      case FortXTransPackage.LOCAL_VAR_DECL__LIT_TUP:
        return litTup != null;
      case FortXTransPackage.LOCAL_VAR_DECL__TYPE:
        return type != null;
      case FortXTransPackage.LOCAL_VAR_DECL__TUPTYPE:
        return tuptype != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mut: ");
    result.append(mut);
    result.append(')');
    return result.toString();
  }

} //LocalVarDeclImpl