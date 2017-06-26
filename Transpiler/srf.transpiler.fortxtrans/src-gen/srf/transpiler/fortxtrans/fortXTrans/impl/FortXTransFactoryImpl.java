/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import srf.transpiler.fortxtrans.fortXTrans.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FortXTransFactoryImpl extends EFactoryImpl implements FortXTransFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FortXTransFactory init()
  {
    try
    {
      FortXTransFactory theFortXTransFactory = (FortXTransFactory)EPackage.Registry.INSTANCE.getEFactory(FortXTransPackage.eNS_URI);
      if (theFortXTransFactory != null)
      {
        return theFortXTransFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FortXTransFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FortXTransFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FortXTransPackage.MODEL: return createModel();
      case FortXTransPackage.COMPONENT: return createComponent();
      case FortXTransPackage.API: return createAPI();
      case FortXTransPackage.IMPORT: return createImport();
      case FortXTransPackage.EXPORT: return createExport();
      case FortXTransPackage.IMPORTED_NAMES: return createImportedNames();
      case FortXTransPackage.SIMPLE_NAMES: return createSimpleNames();
      case FortXTransPackage.SIMPLE_NAME: return createSimpleName();
      case FortXTransPackage.ALIASED_SIMPLE_NAME: return createAliasedSimpleName();
      case FortXTransPackage.ALIASED_API_NAMES: return createAliasedAPINames();
      case FortXTransPackage.ALIASED_API_NAME: return createAliasedAPIName();
      case FortXTransPackage.DECLS: return createDecls();
      case FortXTransPackage.DECL: return createDecl();
      case FortXTransPackage.FN_DECL: return createFnDecl();
      case FortXTransPackage.FN_MODS: return createFnMods();
      case FortXTransPackage.FN_MOD: return createFnMod();
      case FortXTransPackage.VAL_PARAM: return createValParam();
      case FortXTransPackage.PARAM: return createParam();
      case FortXTransPackage.IS_TYPE: return createIsType();
      case FortXTransPackage.RET_TYPE: return createRetType();
      case FortXTransPackage.TYPE: return createType();
      case FortXTransPackage.EXPRESSION: return createExpression();
      case FortXTransPackage.EXPR_TAIL: return createExprTail();
      case FortXTransPackage.EXPR: return createExpr();
      case FortXTransPackage.EXPR_FRONT: return createExprFront();
      case FortXTransPackage.DELIMITED: return createDelimited();
      case FortXTransPackage.PARANTHESIZED: return createParanthesized();
      case FortXTransPackage.DO: return createDo();
      case FortXTransPackage.BLOCK_ELEM: return createBlockELem();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public API createAPI()
  {
    APIImpl api = new APIImpl();
    return api;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Export createExport()
  {
    ExportImpl export = new ExportImpl();
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportedNames createImportedNames()
  {
    ImportedNamesImpl importedNames = new ImportedNamesImpl();
    return importedNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleNames createSimpleNames()
  {
    SimpleNamesImpl simpleNames = new SimpleNamesImpl();
    return simpleNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleName createSimpleName()
  {
    SimpleNameImpl simpleName = new SimpleNameImpl();
    return simpleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasedSimpleName createAliasedSimpleName()
  {
    AliasedSimpleNameImpl aliasedSimpleName = new AliasedSimpleNameImpl();
    return aliasedSimpleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasedAPINames createAliasedAPINames()
  {
    AliasedAPINamesImpl aliasedAPINames = new AliasedAPINamesImpl();
    return aliasedAPINames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasedAPIName createAliasedAPIName()
  {
    AliasedAPINameImpl aliasedAPIName = new AliasedAPINameImpl();
    return aliasedAPIName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decls createDecls()
  {
    DeclsImpl decls = new DeclsImpl();
    return decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl createDecl()
  {
    DeclImpl decl = new DeclImpl();
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnDecl createFnDecl()
  {
    FnDeclImpl fnDecl = new FnDeclImpl();
    return fnDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnMods createFnMods()
  {
    FnModsImpl fnMods = new FnModsImpl();
    return fnMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnMod createFnMod()
  {
    FnModImpl fnMod = new FnModImpl();
    return fnMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValParam createValParam()
  {
    ValParamImpl valParam = new ValParamImpl();
    return valParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsType createIsType()
  {
    IsTypeImpl isType = new IsTypeImpl();
    return isType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetType createRetType()
  {
    RetTypeImpl retType = new RetTypeImpl();
    return retType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprTail createExprTail()
  {
    ExprTailImpl exprTail = new ExprTailImpl();
    return exprTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprFront createExprFront()
  {
    ExprFrontImpl exprFront = new ExprFrontImpl();
    return exprFront;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delimited createDelimited()
  {
    DelimitedImpl delimited = new DelimitedImpl();
    return delimited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paranthesized createParanthesized()
  {
    ParanthesizedImpl paranthesized = new ParanthesizedImpl();
    return paranthesized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do createDo()
  {
    DoImpl do_ = new DoImpl();
    return do_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockELem createBlockELem()
  {
    BlockELemImpl blockELem = new BlockELemImpl();
    return blockELem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FortXTransPackage getFortXTransPackage()
  {
    return (FortXTransPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FortXTransPackage getPackage()
  {
    return FortXTransPackage.eINSTANCE;
  }

} //FortXTransFactoryImpl
