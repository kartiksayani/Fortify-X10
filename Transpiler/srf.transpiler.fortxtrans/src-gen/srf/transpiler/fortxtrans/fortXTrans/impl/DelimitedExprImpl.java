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

import srf.transpiler.fortxtrans.fortXTrans.BlockElems;
import srf.transpiler.fortxtrans.fortXTrans.DelimitedExpr;
import srf.transpiler.fortxtrans.fortXTrans.Do;
import srf.transpiler.fortxtrans.fortXTrans.DoFront;
import srf.transpiler.fortxtrans.fortXTrans.Elifs;
import srf.transpiler.fortxtrans.fortXTrans.Else;
import srf.transpiler.fortxtrans.fortXTrans.Expr;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.Generators;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delimited Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getDod <em>Dod</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getRet <em>Ret</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getAwhile <em>Awhile</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getWhiledod <em>Whiledod</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getAfor <em>Afor</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getGen <em>Gen</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getDofront <em>Dofront</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getAnif <em>Anif</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getElifs <em>Elifs</em>}</li>
 *   <li>{@link srf.transpiler.fortxtrans.fortXTrans.impl.DelimitedExprImpl#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelimitedExprImpl extends MinimalEObjectImpl.Container implements DelimitedExpr
{
  /**
   * The cached value of the '{@link #getDod() <em>Dod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDod()
   * @generated
   * @ordered
   */
  protected Do dod;

  /**
   * The default value of the '{@link #getRet() <em>Ret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRet()
   * @generated
   * @ordered
   */
  protected static final String RET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRet() <em>Ret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRet()
   * @generated
   * @ordered
   */
  protected String ret = RET_EDEFAULT;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Expr block;

  /**
   * The default value of the '{@link #getAwhile() <em>Awhile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAwhile()
   * @generated
   * @ordered
   */
  protected static final String AWHILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAwhile() <em>Awhile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAwhile()
   * @generated
   * @ordered
   */
  protected String awhile = AWHILE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

  /**
   * The cached value of the '{@link #getWhiledod() <em>Whiledod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhiledod()
   * @generated
   * @ordered
   */
  protected Do whiledod;

  /**
   * The default value of the '{@link #getAfor() <em>Afor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfor()
   * @generated
   * @ordered
   */
  protected static final String AFOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAfor() <em>Afor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfor()
   * @generated
   * @ordered
   */
  protected String afor = AFOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getGen() <em>Gen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGen()
   * @generated
   * @ordered
   */
  protected Generators gen;

  /**
   * The cached value of the '{@link #getDofront() <em>Dofront</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDofront()
   * @generated
   * @ordered
   */
  protected DoFront dofront;

  /**
   * The default value of the '{@link #getAnif() <em>Anif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnif()
   * @generated
   * @ordered
   */
  protected static final String ANIF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnif() <em>Anif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnif()
   * @generated
   * @ordered
   */
  protected String anif = ANIF_EDEFAULT;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected Expr cond;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected BlockElems blocks;

  /**
   * The cached value of the '{@link #getElifs() <em>Elifs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElifs()
   * @generated
   * @ordered
   */
  protected Elifs elifs;

  /**
   * The cached value of the '{@link #getEls() <em>Els</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEls()
   * @generated
   * @ordered
   */
  protected Else els;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DelimitedExprImpl()
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
    return FortXTransPackage.Literals.DELIMITED_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do getDod()
  {
    return dod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDod(Do newDod, NotificationChain msgs)
  {
    Do oldDod = dod;
    dod = newDod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__DOD, oldDod, newDod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDod(Do newDod)
  {
    if (newDod != dod)
    {
      NotificationChain msgs = null;
      if (dod != null)
        msgs = ((InternalEObject)dod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__DOD, null, msgs);
      if (newDod != null)
        msgs = ((InternalEObject)newDod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__DOD, null, msgs);
      msgs = basicSetDod(newDod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__DOD, newDod, newDod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRet()
  {
    return ret;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRet(String newRet)
  {
    String oldRet = ret;
    ret = newRet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__RET, oldRet, ret));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Expr newBlock, NotificationChain msgs)
  {
    Expr oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Expr newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAwhile()
  {
    return awhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAwhile(String newAwhile)
  {
    String oldAwhile = awhile;
    awhile = newAwhile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__AWHILE, oldAwhile, awhile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do getWhiledod()
  {
    return whiledod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhiledod(Do newWhiledod, NotificationChain msgs)
  {
    Do oldWhiledod = whiledod;
    whiledod = newWhiledod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__WHILEDOD, oldWhiledod, newWhiledod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhiledod(Do newWhiledod)
  {
    if (newWhiledod != whiledod)
    {
      NotificationChain msgs = null;
      if (whiledod != null)
        msgs = ((InternalEObject)whiledod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__WHILEDOD, null, msgs);
      if (newWhiledod != null)
        msgs = ((InternalEObject)newWhiledod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__WHILEDOD, null, msgs);
      msgs = basicSetWhiledod(newWhiledod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__WHILEDOD, newWhiledod, newWhiledod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAfor()
  {
    return afor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfor(String newAfor)
  {
    String oldAfor = afor;
    afor = newAfor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__AFOR, oldAfor, afor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generators getGen()
  {
    return gen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGen(Generators newGen, NotificationChain msgs)
  {
    Generators oldGen = gen;
    gen = newGen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__GEN, oldGen, newGen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGen(Generators newGen)
  {
    if (newGen != gen)
    {
      NotificationChain msgs = null;
      if (gen != null)
        msgs = ((InternalEObject)gen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__GEN, null, msgs);
      if (newGen != null)
        msgs = ((InternalEObject)newGen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__GEN, null, msgs);
      msgs = basicSetGen(newGen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__GEN, newGen, newGen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoFront getDofront()
  {
    return dofront;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDofront(DoFront newDofront, NotificationChain msgs)
  {
    DoFront oldDofront = dofront;
    dofront = newDofront;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__DOFRONT, oldDofront, newDofront);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDofront(DoFront newDofront)
  {
    if (newDofront != dofront)
    {
      NotificationChain msgs = null;
      if (dofront != null)
        msgs = ((InternalEObject)dofront).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__DOFRONT, null, msgs);
      if (newDofront != null)
        msgs = ((InternalEObject)newDofront).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__DOFRONT, null, msgs);
      msgs = basicSetDofront(newDofront, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__DOFRONT, newDofront, newDofront));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnif()
  {
    return anif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnif(String newAnif)
  {
    String oldAnif = anif;
    anif = newAnif;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__ANIF, oldAnif, anif));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(Expr newCond, NotificationChain msgs)
  {
    Expr oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(Expr newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockElems getBlocks()
  {
    return blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocks(BlockElems newBlocks, NotificationChain msgs)
  {
    BlockElems oldBlocks = blocks;
    blocks = newBlocks;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__BLOCKS, oldBlocks, newBlocks);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocks(BlockElems newBlocks)
  {
    if (newBlocks != blocks)
    {
      NotificationChain msgs = null;
      if (blocks != null)
        msgs = ((InternalEObject)blocks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__BLOCKS, null, msgs);
      if (newBlocks != null)
        msgs = ((InternalEObject)newBlocks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__BLOCKS, null, msgs);
      msgs = basicSetBlocks(newBlocks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__BLOCKS, newBlocks, newBlocks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elifs getElifs()
  {
    return elifs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElifs(Elifs newElifs, NotificationChain msgs)
  {
    Elifs oldElifs = elifs;
    elifs = newElifs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__ELIFS, oldElifs, newElifs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElifs(Elifs newElifs)
  {
    if (newElifs != elifs)
    {
      NotificationChain msgs = null;
      if (elifs != null)
        msgs = ((InternalEObject)elifs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__ELIFS, null, msgs);
      if (newElifs != null)
        msgs = ((InternalEObject)newElifs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__ELIFS, null, msgs);
      msgs = basicSetElifs(newElifs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__ELIFS, newElifs, newElifs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Else getEls()
  {
    return els;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEls(Else newEls, NotificationChain msgs)
  {
    Else oldEls = els;
    els = newEls;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__ELS, oldEls, newEls);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEls(Else newEls)
  {
    if (newEls != els)
    {
      NotificationChain msgs = null;
      if (els != null)
        msgs = ((InternalEObject)els).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__ELS, null, msgs);
      if (newEls != null)
        msgs = ((InternalEObject)newEls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FortXTransPackage.DELIMITED_EXPR__ELS, null, msgs);
      msgs = basicSetEls(newEls, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FortXTransPackage.DELIMITED_EXPR__ELS, newEls, newEls));
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
      case FortXTransPackage.DELIMITED_EXPR__DOD:
        return basicSetDod(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__BLOCK:
        return basicSetBlock(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__EXPR:
        return basicSetExpr(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__WHILEDOD:
        return basicSetWhiledod(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__GEN:
        return basicSetGen(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__DOFRONT:
        return basicSetDofront(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__COND:
        return basicSetCond(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__BLOCKS:
        return basicSetBlocks(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__ELIFS:
        return basicSetElifs(null, msgs);
      case FortXTransPackage.DELIMITED_EXPR__ELS:
        return basicSetEls(null, msgs);
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
      case FortXTransPackage.DELIMITED_EXPR__DOD:
        return getDod();
      case FortXTransPackage.DELIMITED_EXPR__RET:
        return getRet();
      case FortXTransPackage.DELIMITED_EXPR__BLOCK:
        return getBlock();
      case FortXTransPackage.DELIMITED_EXPR__AWHILE:
        return getAwhile();
      case FortXTransPackage.DELIMITED_EXPR__EXPR:
        return getExpr();
      case FortXTransPackage.DELIMITED_EXPR__WHILEDOD:
        return getWhiledod();
      case FortXTransPackage.DELIMITED_EXPR__AFOR:
        return getAfor();
      case FortXTransPackage.DELIMITED_EXPR__GEN:
        return getGen();
      case FortXTransPackage.DELIMITED_EXPR__DOFRONT:
        return getDofront();
      case FortXTransPackage.DELIMITED_EXPR__ANIF:
        return getAnif();
      case FortXTransPackage.DELIMITED_EXPR__COND:
        return getCond();
      case FortXTransPackage.DELIMITED_EXPR__BLOCKS:
        return getBlocks();
      case FortXTransPackage.DELIMITED_EXPR__ELIFS:
        return getElifs();
      case FortXTransPackage.DELIMITED_EXPR__ELS:
        return getEls();
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
      case FortXTransPackage.DELIMITED_EXPR__DOD:
        setDod((Do)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__RET:
        setRet((String)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__BLOCK:
        setBlock((Expr)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__AWHILE:
        setAwhile((String)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__EXPR:
        setExpr((Expr)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__WHILEDOD:
        setWhiledod((Do)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__AFOR:
        setAfor((String)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__GEN:
        setGen((Generators)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__DOFRONT:
        setDofront((DoFront)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__ANIF:
        setAnif((String)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__COND:
        setCond((Expr)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__BLOCKS:
        setBlocks((BlockElems)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__ELIFS:
        setElifs((Elifs)newValue);
        return;
      case FortXTransPackage.DELIMITED_EXPR__ELS:
        setEls((Else)newValue);
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
      case FortXTransPackage.DELIMITED_EXPR__DOD:
        setDod((Do)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__RET:
        setRet(RET_EDEFAULT);
        return;
      case FortXTransPackage.DELIMITED_EXPR__BLOCK:
        setBlock((Expr)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__AWHILE:
        setAwhile(AWHILE_EDEFAULT);
        return;
      case FortXTransPackage.DELIMITED_EXPR__EXPR:
        setExpr((Expr)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__WHILEDOD:
        setWhiledod((Do)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__AFOR:
        setAfor(AFOR_EDEFAULT);
        return;
      case FortXTransPackage.DELIMITED_EXPR__GEN:
        setGen((Generators)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__DOFRONT:
        setDofront((DoFront)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__ANIF:
        setAnif(ANIF_EDEFAULT);
        return;
      case FortXTransPackage.DELIMITED_EXPR__COND:
        setCond((Expr)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__BLOCKS:
        setBlocks((BlockElems)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__ELIFS:
        setElifs((Elifs)null);
        return;
      case FortXTransPackage.DELIMITED_EXPR__ELS:
        setEls((Else)null);
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
      case FortXTransPackage.DELIMITED_EXPR__DOD:
        return dod != null;
      case FortXTransPackage.DELIMITED_EXPR__RET:
        return RET_EDEFAULT == null ? ret != null : !RET_EDEFAULT.equals(ret);
      case FortXTransPackage.DELIMITED_EXPR__BLOCK:
        return block != null;
      case FortXTransPackage.DELIMITED_EXPR__AWHILE:
        return AWHILE_EDEFAULT == null ? awhile != null : !AWHILE_EDEFAULT.equals(awhile);
      case FortXTransPackage.DELIMITED_EXPR__EXPR:
        return expr != null;
      case FortXTransPackage.DELIMITED_EXPR__WHILEDOD:
        return whiledod != null;
      case FortXTransPackage.DELIMITED_EXPR__AFOR:
        return AFOR_EDEFAULT == null ? afor != null : !AFOR_EDEFAULT.equals(afor);
      case FortXTransPackage.DELIMITED_EXPR__GEN:
        return gen != null;
      case FortXTransPackage.DELIMITED_EXPR__DOFRONT:
        return dofront != null;
      case FortXTransPackage.DELIMITED_EXPR__ANIF:
        return ANIF_EDEFAULT == null ? anif != null : !ANIF_EDEFAULT.equals(anif);
      case FortXTransPackage.DELIMITED_EXPR__COND:
        return cond != null;
      case FortXTransPackage.DELIMITED_EXPR__BLOCKS:
        return blocks != null;
      case FortXTransPackage.DELIMITED_EXPR__ELIFS:
        return elifs != null;
      case FortXTransPackage.DELIMITED_EXPR__ELS:
        return els != null;
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
    result.append(" (ret: ");
    result.append(ret);
    result.append(", awhile: ");
    result.append(awhile);
    result.append(", afor: ");
    result.append(afor);
    result.append(", anif: ");
    result.append(anif);
    result.append(')');
    return result.toString();
  }

} //DelimitedExprImpl
