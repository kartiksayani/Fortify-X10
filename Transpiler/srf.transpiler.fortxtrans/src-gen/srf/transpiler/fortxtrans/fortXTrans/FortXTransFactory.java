/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage
 * @generated
 */
public interface FortXTransFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FortXTransFactory eINSTANCE = srf.transpiler.fortxtrans.fortXTrans.impl.FortXTransFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>API</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>API</em>'.
   * @generated
   */
  API createAPI();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Export</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export</em>'.
   * @generated
   */
  Export createExport();

  /**
   * Returns a new object of class '<em>Imported Names</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imported Names</em>'.
   * @generated
   */
  ImportedNames createImportedNames();

  /**
   * Returns a new object of class '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name</em>'.
   * @generated
   */
  QualifiedName createQualifiedName();

  /**
   * Returns a new object of class '<em>Qualified</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified</em>'.
   * @generated
   */
  Qualified createQualified();

  /**
   * Returns a new object of class '<em>Qualified Name Tuple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name Tuple</em>'.
   * @generated
   */
  QualifiedNameTuple createQualifiedNameTuple();

  /**
   * Returns a new object of class '<em>Simple Names</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Names</em>'.
   * @generated
   */
  SimpleNames createSimpleNames();

  /**
   * Returns a new object of class '<em>Simple Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Name</em>'.
   * @generated
   */
  SimpleName createSimpleName();

  /**
   * Returns a new object of class '<em>Aliased Simple Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aliased Simple Name</em>'.
   * @generated
   */
  AliasedSimpleName createAliasedSimpleName();

  /**
   * Returns a new object of class '<em>Aliased API Names</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aliased API Names</em>'.
   * @generated
   */
  AliasedAPINames createAliasedAPINames();

  /**
   * Returns a new object of class '<em>Aliased API Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aliased API Name</em>'.
   * @generated
   */
  AliasedAPIName createAliasedAPIName();

  /**
   * Returns a new object of class '<em>Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decls</em>'.
   * @generated
   */
  Decls createDecls();

  /**
   * Returns a new object of class '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl</em>'.
   * @generated
   */
  Decl createDecl();

  /**
   * Returns a new object of class '<em>Fn Mods</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fn Mods</em>'.
   * @generated
   */
  FnMods createFnMods();

  /**
   * Returns a new object of class '<em>Fn Mod</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fn Mod</em>'.
   * @generated
   */
  FnMod createFnMod();

  /**
   * Returns a new object of class '<em>Val Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Val Param</em>'.
   * @generated
   */
  ValParam createValParam();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Ret Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ret Type</em>'.
   * @generated
   */
  RetType createRetType();

  /**
   * Returns a new object of class '<em>Tuple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type</em>'.
   * @generated
   */
  TupleType createTupleType();

  /**
   * Returns a new object of class '<em>Fn Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fn Decl</em>'.
   * @generated
   */
  FnDecl createFnDecl();

  /**
   * Returns a new object of class '<em>Stmnts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmnts</em>'.
   * @generated
   */
  Stmnts createStmnts();

  /**
   * Returns a new object of class '<em>Stmnt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmnt</em>'.
   * @generated
   */
  Stmnt createStmnt();

  /**
   * Returns a new object of class '<em>Stmnt List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmnt List</em>'.
   * @generated
   */
  StmntList createStmntList();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Expr List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr List</em>'.
   * @generated
   */
  ExprList createExprList();

  /**
   * Returns a new object of class '<em>Expr Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Tail</em>'.
   * @generated
   */
  ExprTail createExprTail();

  /**
   * Returns a new object of class '<em>Delimited Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delimited Expr</em>'.
   * @generated
   */
  DelimitedExpr createDelimitedExpr();

  /**
   * Returns a new object of class '<em>Elifs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elifs</em>'.
   * @generated
   */
  Elifs createElifs();

  /**
   * Returns a new object of class '<em>Elif</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elif</em>'.
   * @generated
   */
  Elif createElif();

  /**
   * Returns a new object of class '<em>Else</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else</em>'.
   * @generated
   */
  Else createElse();

  /**
   * Returns a new object of class '<em>Generators</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generators</em>'.
   * @generated
   */
  Generators createGenerators();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns a new object of class '<em>Gen Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gen Source</em>'.
   * @generated
   */
  GenSource createGenSource();

  /**
   * Returns a new object of class '<em>Gen Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gen Clause</em>'.
   * @generated
   */
  GenClause createGenClause();

  /**
   * Returns a new object of class '<em>Block Elems</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Elems</em>'.
   * @generated
   */
  BlockElems createBlockElems();

  /**
   * Returns a new object of class '<em>Block Elem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Elem</em>'.
   * @generated
   */
  BlockElem createBlockElem();

  /**
   * Returns a new object of class '<em>Do</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do</em>'.
   * @generated
   */
  Do createDo();

  /**
   * Returns a new object of class '<em>Do Front</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Front</em>'.
   * @generated
   */
  DoFront createDoFront();

  /**
   * Returns a new object of class '<em>Is Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Type</em>'.
   * @generated
   */
  IsType createIsType();

  /**
   * Returns a new object of class '<em>Field Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Decl</em>'.
   * @generated
   */
  FieldDecl createFieldDecl();

  /**
   * Returns a new object of class '<em>No Newline Var WTypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Newline Var WTypes</em>'.
   * @generated
   */
  NoNewlineVarWTypes createNoNewlineVarWTypes();

  /**
   * Returns a new object of class '<em>No Newline Var WType</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Newline Var WType</em>'.
   * @generated
   */
  NoNewlineVarWType createNoNewlineVarWType();

  /**
   * Returns a new object of class '<em>Literal Tuple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Tuple</em>'.
   * @generated
   */
  LiteralTuple createLiteralTuple();

  /**
   * Returns a new object of class '<em>Literal Tup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Tup</em>'.
   * @generated
   */
  LiteralTup createLiteralTup();

  /**
   * Returns a new object of class '<em>Literal List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal List</em>'.
   * @generated
   */
  LiteralList createLiteralList();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Local Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Var Decl</em>'.
   * @generated
   */
  LocalVarDecl createLocalVarDecl();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns a new object of class '<em>Add Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Expr</em>'.
   * @generated
   */
  AddExpr createAddExpr();

  /**
   * Returns a new object of class '<em>Sub Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Expr</em>'.
   * @generated
   */
  SubExpr createSubExpr();

  /**
   * Returns a new object of class '<em>Div Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div Expr</em>'.
   * @generated
   */
  DivExpr createDivExpr();

  /**
   * Returns a new object of class '<em>Mult Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult Expr</em>'.
   * @generated
   */
  MultExpr createMultExpr();

  /**
   * Returns a new object of class '<em>Exponent Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exponent Expr</em>'.
   * @generated
   */
  ExponentExpr createExponentExpr();

  /**
   * Returns a new object of class '<em>Assop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assop</em>'.
   * @generated
   */
  Assop createAssop();

  /**
   * Returns a new object of class '<em>FCall</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FCall</em>'.
   * @generated
   */
  FCall createFCall();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns a new object of class '<em>Neg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neg</em>'.
   * @generated
   */
  Neg createNeg();

  /**
   * Returns a new object of class '<em>Paran</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paran</em>'.
   * @generated
   */
  Paran createParan();

  /**
   * Returns a new object of class '<em>Int Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Const</em>'.
   * @generated
   */
  IntConst createIntConst();

  /**
   * Returns a new object of class '<em>Float Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Const</em>'.
   * @generated
   */
  FloatConst createFloatConst();

  /**
   * Returns a new object of class '<em>Str Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Str Const</em>'.
   * @generated
   */
  StrConst createStrConst();

  /**
   * Returns a new object of class '<em>Bool Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Const</em>'.
   * @generated
   */
  BoolConst createBoolConst();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FortXTransPackage getFortXTransPackage();

} //FortXTransFactory
