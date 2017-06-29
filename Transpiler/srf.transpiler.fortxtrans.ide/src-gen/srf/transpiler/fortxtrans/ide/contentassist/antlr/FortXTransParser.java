/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import srf.transpiler.fortxtrans.ide.contentassist.antlr.internal.InternalFortXTransParser;
import srf.transpiler.fortxtrans.services.FortXTransGrammarAccess;

public class FortXTransParser extends AbstractContentAssistParser {

	@Inject
	private FortXTransGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFortXTransParser createParser() {
		InternalFortXTransParser result = new InternalFortXTransParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getImportAccess().getAlternatives(), "rule__Import__Alternatives");
					put(grammarAccess.getExportAccess().getAlternatives(), "rule__Export__Alternatives");
					put(grammarAccess.getImportedNamesAccess().getAlternatives(), "rule__ImportedNames__Alternatives");
					put(grammarAccess.getQualifiedNameAccess().getAlternatives(), "rule__QualifiedName__Alternatives");
					put(grammarAccess.getAPINameAccess().getAlternatives(), "rule__APIName__Alternatives");
					put(grammarAccess.getSimpleNamesAccess().getAlternatives(), "rule__SimpleNames__Alternatives");
					put(grammarAccess.getAliasedAPINamesAccess().getAlternatives(), "rule__AliasedAPINames__Alternatives");
					put(grammarAccess.getDeclAccess().getAlternatives(), "rule__Decl__Alternatives");
					put(grammarAccess.getFnModAccess().getAlternatives(), "rule__FnMod__Alternatives");
					put(grammarAccess.getValParamAccess().getAlternatives(), "rule__ValParam__Alternatives");
					put(grammarAccess.getRetTypeAccess().getAlternatives(), "rule__RetType__Alternatives");
					put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
					put(grammarAccess.getExprFrontAccess().getAlternatives(), "rule__ExprFront__Alternatives");
					put(grammarAccess.getDelimitedExprAccess().getAlternatives(), "rule__DelimitedExpr__Alternatives");
					put(grammarAccess.getBindingAccess().getAlternatives(), "rule__Binding__Alternatives");
					put(grammarAccess.getGenClauseAccess().getAlternatives(), "rule__GenClause__Alternatives");
					put(grammarAccess.getIdOrTupleAccess().getAlternatives(), "rule__IdOrTuple__Alternatives");
					put(grammarAccess.getBindIdAccess().getAlternatives(), "rule__BindId__Alternatives");
					put(grammarAccess.getFieldDeclAccess().getAlternatives(), "rule__FieldDecl__Alternatives");
					put(grammarAccess.getNoNewlineVarWTypesAccess().getAlternatives(), "rule__NoNewlineVarWTypes__Alternatives");
					put(grammarAccess.getInitValAccess().getAlternatives(), "rule__InitVal__Alternatives");
					put(grammarAccess.getLiteralTupleAccess().getAlternatives(), "rule__LiteralTuple__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getLocalVarDeclAccess().getAlternatives(), "rule__LocalVarDecl__Alternatives");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getAPIAccess().getGroup(), "rule__API__Group__0");
					put(grammarAccess.getImportAccess().getGroup_0(), "rule__Import__Group_0__0");
					put(grammarAccess.getImportAccess().getGroup_1(), "rule__Import__Group_1__0");
					put(grammarAccess.getExportAccess().getGroup_0(), "rule__Export__Group_0__0");
					put(grammarAccess.getExportAccess().getGroup_1(), "rule__Export__Group_1__0");
					put(grammarAccess.getExportAccess().getGroup_1_3(), "rule__Export__Group_1_3__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_0(), "rule__ImportedNames__Group_0__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_0_5(), "rule__ImportedNames__Group_0_5__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_1(), "rule__ImportedNames__Group_1__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_1_4(), "rule__ImportedNames__Group_1_4__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_1_5(), "rule__ImportedNames__Group_1_5__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_2(), "rule__ImportedNames__Group_2__0");
					put(grammarAccess.getImportedNamesAccess().getGroup_2_1(), "rule__ImportedNames__Group_2_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_0(), "rule__QualifiedName__Group_0__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1_1(), "rule__QualifiedName__Group_1_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_2(), "rule__QualifiedName__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_2_1(), "rule__QualifiedName__Group_2_1__0");
					put(grammarAccess.getAPINameAccess().getGroup_0(), "rule__APIName__Group_0__0");
					put(grammarAccess.getAPINameAccess().getGroup_1(), "rule__APIName__Group_1__0");
					put(grammarAccess.getAPINameAccess().getGroup_1_1(), "rule__APIName__Group_1_1__0");
					put(grammarAccess.getAPINameAccess().getGroup_2(), "rule__APIName__Group_2__0");
					put(grammarAccess.getAPINameAccess().getGroup_2_1(), "rule__APIName__Group_2_1__0");
					put(grammarAccess.getSimpleNamesAccess().getGroup_1(), "rule__SimpleNames__Group_1__0");
					put(grammarAccess.getSimpleNamesAccess().getGroup_1_2(), "rule__SimpleNames__Group_1_2__0");
					put(grammarAccess.getAliasedSimpleNameAccess().getGroup(), "rule__AliasedSimpleName__Group__0");
					put(grammarAccess.getAliasedSimpleNameAccess().getGroup_1(), "rule__AliasedSimpleName__Group_1__0");
					put(grammarAccess.getAliasedAPINamesAccess().getGroup_1(), "rule__AliasedAPINames__Group_1__0");
					put(grammarAccess.getAliasedAPINamesAccess().getGroup_1_2(), "rule__AliasedAPINames__Group_1_2__0");
					put(grammarAccess.getAliasedAPINameAccess().getGroup(), "rule__AliasedAPIName__Group__0");
					put(grammarAccess.getAliasedAPINameAccess().getGroup_1(), "rule__AliasedAPIName__Group_1__0");
					put(grammarAccess.getValParamAccess().getGroup_1(), "rule__ValParam__Group_1__0");
					put(grammarAccess.getValParamAccess().getGroup_1_1(), "rule__ValParam__Group_1_1__0");
					put(grammarAccess.getValParamAccess().getGroup_1_1_1(), "rule__ValParam__Group_1_1_1__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getRetTypeAccess().getGroup_0(), "rule__RetType__Group_0__0");
					put(grammarAccess.getRetTypeAccess().getGroup_1(), "rule__RetType__Group_1__0");
					put(grammarAccess.getTupleTypeAccess().getGroup(), "rule__TupleType__Group__0");
					put(grammarAccess.getTupleTypeAccess().getGroup_2(), "rule__TupleType__Group_2__0");
					put(grammarAccess.getFnDeclAccess().getGroup(), "rule__FnDecl__Group__0");
					put(grammarAccess.getFnDeclAccess().getGroup_4(), "rule__FnDecl__Group_4__0");
					put(grammarAccess.getExprAccess().getGroup_0(), "rule__Expr__Group_0__0");
					put(grammarAccess.getExprTailAccess().getGroup(), "rule__ExprTail__Group__0");
					put(grammarAccess.getDelimitedExprAccess().getGroup_1(), "rule__DelimitedExpr__Group_1__0");
					put(grammarAccess.getDelimitedExprAccess().getGroup_2(), "rule__DelimitedExpr__Group_2__0");
					put(grammarAccess.getDelimitedExprAccess().getGroup_3(), "rule__DelimitedExpr__Group_3__0");
					put(grammarAccess.getDelimitedExprAccess().getGroup_5(), "rule__DelimitedExpr__Group_5__0");
					put(grammarAccess.getParBlockElemsAccess().getGroup(), "rule__ParBlockElems__Group__0");
					put(grammarAccess.getParBlockElemsAccess().getGroup_2(), "rule__ParBlockElems__Group_2__0");
					put(grammarAccess.getElifsAccess().getGroup(), "rule__Elifs__Group__0");
					put(grammarAccess.getElifAccess().getGroup(), "rule__Elif__Group__0");
					put(grammarAccess.getElseAccess().getGroup(), "rule__Else__Group__0");
					put(grammarAccess.getGeneratorsAccess().getGroup(), "rule__Generators__Group__0");
					put(grammarAccess.getGeneratorsAccess().getGroup_1(), "rule__Generators__Group_1__0");
					put(grammarAccess.getBindingAccess().getGroup_0(), "rule__Binding__Group_0__0");
					put(grammarAccess.getBindingAccess().getGroup_1(), "rule__Binding__Group_1__0");
					put(grammarAccess.getBlockElemsAccess().getGroup(), "rule__BlockElems__Group__0");
					put(grammarAccess.getParanthesizedAccess().getGroup(), "rule__Paranthesized__Group__0");
					put(grammarAccess.getDoAccess().getGroup(), "rule__Do__Group__0");
					put(grammarAccess.getDoAccess().getGroup_1(), "rule__Do__Group_1__0");
					put(grammarAccess.getDoFrontAccess().getGroup(), "rule__DoFront__Group__0");
					put(grammarAccess.getDoFrontAccess().getGroup_0(), "rule__DoFront__Group_0__0");
					put(grammarAccess.getIdOrTupleAccess().getGroup_1(), "rule__IdOrTuple__Group_1__0");
					put(grammarAccess.getIdOrTupleAccess().getGroup_1_2(), "rule__IdOrTuple__Group_1_2__0");
					put(grammarAccess.getIsTypeAccess().getGroup(), "rule__IsType__Group__0");
					put(grammarAccess.getFieldDeclAccess().getGroup_0(), "rule__FieldDecl__Group_0__0");
					put(grammarAccess.getFieldDeclAccess().getGroup_1(), "rule__FieldDecl__Group_1__0");
					put(grammarAccess.getFieldDeclAccess().getGroup_2(), "rule__FieldDecl__Group_2__0");
					put(grammarAccess.getFieldDeclAccess().getGroup_3(), "rule__FieldDecl__Group_3__0");
					put(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1(), "rule__NoNewlineVarWTypes__Group_1__0");
					put(grammarAccess.getNoNewlineVarWTypesAccess().getGroup_1_2(), "rule__NoNewlineVarWTypes__Group_1_2__0");
					put(grammarAccess.getNoNewlineVarWTypeAccess().getGroup(), "rule__NoNewlineVarWType__Group__0");
					put(grammarAccess.getInitValAccess().getGroup_0(), "rule__InitVal__Group_0__0");
					put(grammarAccess.getInitValAccess().getGroup_1(), "rule__InitVal__Group_1__0");
					put(grammarAccess.getLiteralTupleAccess().getGroup_1(), "rule__LiteralTuple__Group_1__0");
					put(grammarAccess.getLiteralTupleAccess().getGroup_1_2(), "rule__LiteralTuple__Group_1_2__0");
					put(grammarAccess.getLocalVarDeclAccess().getGroup_0(), "rule__LocalVarDecl__Group_0__0");
					put(grammarAccess.getLocalVarDeclAccess().getGroup_1(), "rule__LocalVarDecl__Group_1__0");
					put(grammarAccess.getLocalVarDeclAccess().getGroup_2(), "rule__LocalVarDecl__Group_2__0");
					put(grammarAccess.getLocalVarDeclAccess().getGroup_3(), "rule__LocalVarDecl__Group_3__0");
					put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
					put(grammarAccess.getComponentAccess().getImportsAssignment_2(), "rule__Component__ImportsAssignment_2");
					put(grammarAccess.getComponentAccess().getExportsAssignment_3(), "rule__Component__ExportsAssignment_3");
					put(grammarAccess.getComponentAccess().getDeclsAssignment_4(), "rule__Component__DeclsAssignment_4");
					put(grammarAccess.getAPIAccess().getNameAssignment_1(), "rule__API__NameAssignment_1");
					put(grammarAccess.getAPIAccess().getImportsAssignment_2(), "rule__API__ImportsAssignment_2");
					put(grammarAccess.getImportAccess().getImpsAssignment_0_0(), "rule__Import__ImpsAssignment_0_0");
					put(grammarAccess.getImportAccess().getImportedNamesAssignment_0_1(), "rule__Import__ImportedNamesAssignment_0_1");
					put(grammarAccess.getImportAccess().getImpsAssignment_1_0(), "rule__Import__ImpsAssignment_1_0");
					put(grammarAccess.getImportAccess().getApiAssignment_1_1(), "rule__Import__ApiAssignment_1_1");
					put(grammarAccess.getImportAccess().getAliasedimportedNamesAssignment_1_2(), "rule__Import__AliasedimportedNamesAssignment_1_2");
					put(grammarAccess.getExportAccess().getExpAssignment_0_0(), "rule__Export__ExpAssignment_0_0");
					put(grammarAccess.getExportAccess().getExportedNameAssignment_0_1(), "rule__Export__ExportedNameAssignment_0_1");
					put(grammarAccess.getExportAccess().getExpAssignment_1_0(), "rule__Export__ExpAssignment_1_0");
					put(grammarAccess.getExportAccess().getBrackAssignment_1_1(), "rule__Export__BrackAssignment_1_1");
					put(grammarAccess.getExportAccess().getExportedNameAssignment_1_2(), "rule__Export__ExportedNameAssignment_1_2");
					put(grammarAccess.getExportAccess().getExportedNameAssignment_1_3_1(), "rule__Export__ExportedNameAssignment_1_3_1");
					put(grammarAccess.getImportedNamesAccess().getImpnameAssignment_0_0(), "rule__ImportedNames__ImpnameAssignment_0_0");
					put(grammarAccess.getImportedNamesAccess().getExceptAssignment_0_5_0(), "rule__ImportedNames__ExceptAssignment_0_5_0");
					put(grammarAccess.getImportedNamesAccess().getSimpAssignment_0_5_1(), "rule__ImportedNames__SimpAssignment_0_5_1");
					put(grammarAccess.getImportedNamesAccess().getImpnameAssignment_1_0(), "rule__ImportedNames__ImpnameAssignment_1_0");
					put(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_3(), "rule__ImportedNames__SimpListAssignment_1_3");
					put(grammarAccess.getImportedNamesAccess().getSimpListAssignment_1_4_1(), "rule__ImportedNames__SimpListAssignment_1_4_1");
					put(grammarAccess.getImportedNamesAccess().getCommaAssignment_1_5_0(), "rule__ImportedNames__CommaAssignment_1_5_0");
					put(grammarAccess.getImportedNamesAccess().getDotsAssignment_1_5_1(), "rule__ImportedNames__DotsAssignment_1_5_1");
					put(grammarAccess.getImportedNamesAccess().getImpnameAssignment_2_0(), "rule__ImportedNames__ImpnameAssignment_2_0");
					put(grammarAccess.getImportedNamesAccess().getAsnameAssignment_2_1_1(), "rule__ImportedNames__AsnameAssignment_2_1_1");
					put(grammarAccess.getSimpleNamesAccess().getNameListAssignment_0(), "rule__SimpleNames__NameListAssignment_0");
					put(grammarAccess.getSimpleNamesAccess().getBrackAssignment_1_0(), "rule__SimpleNames__BrackAssignment_1_0");
					put(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_1(), "rule__SimpleNames__NameListAssignment_1_1");
					put(grammarAccess.getSimpleNamesAccess().getNameListAssignment_1_2_1(), "rule__SimpleNames__NameListAssignment_1_2_1");
					put(grammarAccess.getSimpleNameAccess().getNameAssignment(), "rule__SimpleName__NameAssignment");
					put(grammarAccess.getAliasedSimpleNameAccess().getOrigAssignment_0(), "rule__AliasedSimpleName__OrigAssignment_0");
					put(grammarAccess.getAliasedSimpleNameAccess().getAsNameAssignment_1_1(), "rule__AliasedSimpleName__AsNameAssignment_1_1");
					put(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_0(), "rule__AliasedAPINames__NameListAssignment_0");
					put(grammarAccess.getAliasedAPINamesAccess().getBrackAssignment_1_0(), "rule__AliasedAPINames__BrackAssignment_1_0");
					put(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_1(), "rule__AliasedAPINames__NameListAssignment_1_1");
					put(grammarAccess.getAliasedAPINamesAccess().getNameListAssignment_1_2_1(), "rule__AliasedAPINames__NameListAssignment_1_2_1");
					put(grammarAccess.getAliasedAPINameAccess().getOrigAssignment_0(), "rule__AliasedAPIName__OrigAssignment_0");
					put(grammarAccess.getAliasedAPINameAccess().getAsNameAssignment_1_1(), "rule__AliasedAPIName__AsNameAssignment_1_1");
					put(grammarAccess.getDeclsAccess().getDeclsAssignment(), "rule__Decls__DeclsAssignment");
					put(grammarAccess.getDeclAccess().getFunctionAssignment_0(), "rule__Decl__FunctionAssignment_0");
					put(grammarAccess.getDeclAccess().getFieldAssignment_1(), "rule__Decl__FieldAssignment_1");
					put(grammarAccess.getFnModsAccess().getModsAssignment(), "rule__FnMods__ModsAssignment");
					put(grammarAccess.getFnModAccess().getModtypeAssignment_0(), "rule__FnMod__ModtypeAssignment_0");
					put(grammarAccess.getFnModAccess().getModtypeAssignment_1(), "rule__FnMod__ModtypeAssignment_1");
					put(grammarAccess.getFnModAccess().getModtypeAssignment_2(), "rule__FnMod__ModtypeAssignment_2");
					put(grammarAccess.getFnModAccess().getModtypeAssignment_3(), "rule__FnMod__ModtypeAssignment_3");
					put(grammarAccess.getValParamAccess().getParamsAssignment_0(), "rule__ValParam__ParamsAssignment_0");
					put(grammarAccess.getValParamAccess().getBrackAssignment_1_0(), "rule__ValParam__BrackAssignment_1_0");
					put(grammarAccess.getValParamAccess().getParamsAssignment_1_1_0(), "rule__ValParam__ParamsAssignment_1_1_0");
					put(grammarAccess.getValParamAccess().getParamsAssignment_1_1_1_1(), "rule__ValParam__ParamsAssignment_1_1_1_1");
					put(grammarAccess.getParamAccess().getBIdAssignment_0(), "rule__Param__BIdAssignment_0");
					put(grammarAccess.getParamAccess().getIstypeAssignment_1(), "rule__Param__IstypeAssignment_1");
					put(grammarAccess.getRetTypeAccess().getEmptyAssignment_0_1(), "rule__RetType__EmptyAssignment_0_1");
					put(grammarAccess.getRetTypeAccess().getTypeAssignment_1_1(), "rule__RetType__TypeAssignment_1_1");
					put(grammarAccess.getTupleTypeAccess().getTypesAssignment_1(), "rule__TupleType__TypesAssignment_1");
					put(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1(), "rule__TupleType__TypesAssignment_2_1");
					put(grammarAccess.getTypeAccess().getTnameAssignment(), "rule__Type__TnameAssignment");
					put(grammarAccess.getFnDeclAccess().getModsAssignment_0(), "rule__FnDecl__ModsAssignment_0");
					put(grammarAccess.getFnDeclAccess().getNameAssignment_1(), "rule__FnDecl__NameAssignment_1");
					put(grammarAccess.getFnDeclAccess().getParamsAssignment_2(), "rule__FnDecl__ParamsAssignment_2");
					put(grammarAccess.getFnDeclAccess().getRetValAssignment_3(), "rule__FnDecl__RetValAssignment_3");
					put(grammarAccess.getFnDeclAccess().getBodyAssignment_4_0(), "rule__FnDecl__BodyAssignment_4_0");
					put(grammarAccess.getFnDeclAccess().getFnItselfAssignment_4_1(), "rule__FnDecl__FnItselfAssignment_4_1");
					put(grammarAccess.getExprAccess().getFrontAssignment_0_0(), "rule__Expr__FrontAssignment_0_0");
					put(grammarAccess.getExprAccess().getTailsAssignment_0_1(), "rule__Expr__TailsAssignment_0_1");
					put(grammarAccess.getExprAccess().getLocVarAssignment_1(), "rule__Expr__LocVarAssignment_1");
					put(grammarAccess.getExprFrontAccess().getDelimAssignment_0(), "rule__ExprFront__DelimAssignment_0");
					put(grammarAccess.getExprFrontAccess().getIdAssignment_1(), "rule__ExprFront__IdAssignment_1");
					put(grammarAccess.getExprTailAccess().getTypeAssignment_1(), "rule__ExprTail__TypeAssignment_1");
					put(grammarAccess.getDelimitedExprAccess().getDodAssignment_0(), "rule__DelimitedExpr__DodAssignment_0");
					put(grammarAccess.getDelimitedExprAccess().getAwhileAssignment_1_0(), "rule__DelimitedExpr__AwhileAssignment_1_0");
					put(grammarAccess.getDelimitedExprAccess().getExprAssignment_1_1(), "rule__DelimitedExpr__ExprAssignment_1_1");
					put(grammarAccess.getDelimitedExprAccess().getWhiledodAssignment_1_2(), "rule__DelimitedExpr__WhiledodAssignment_1_2");
					put(grammarAccess.getDelimitedExprAccess().getAforAssignment_2_0(), "rule__DelimitedExpr__AforAssignment_2_0");
					put(grammarAccess.getDelimitedExprAccess().getGenAssignment_2_1(), "rule__DelimitedExpr__GenAssignment_2_1");
					put(grammarAccess.getDelimitedExprAccess().getDofrontAssignment_2_2(), "rule__DelimitedExpr__DofrontAssignment_2_2");
					put(grammarAccess.getDelimitedExprAccess().getAnifAssignment_3_0(), "rule__DelimitedExpr__AnifAssignment_3_0");
					put(grammarAccess.getDelimitedExprAccess().getCondAssignment_3_1(), "rule__DelimitedExpr__CondAssignment_3_1");
					put(grammarAccess.getDelimitedExprAccess().getBlockAssignment_3_3(), "rule__DelimitedExpr__BlockAssignment_3_3");
					put(grammarAccess.getDelimitedExprAccess().getElifsAssignment_3_4(), "rule__DelimitedExpr__ElifsAssignment_3_4");
					put(grammarAccess.getDelimitedExprAccess().getElsAssignment_3_5(), "rule__DelimitedExpr__ElsAssignment_3_5");
					put(grammarAccess.getDelimitedExprAccess().getParAssignment_4(), "rule__DelimitedExpr__ParAssignment_4");
					put(grammarAccess.getDelimitedExprAccess().getParblockAssignment_5_1(), "rule__DelimitedExpr__ParblockAssignment_5_1");
					put(grammarAccess.getParBlockElemsAccess().getBlockAssignment_1(), "rule__ParBlockElems__BlockAssignment_1");
					put(grammarAccess.getParBlockElemsAccess().getBlockAssignment_2_1(), "rule__ParBlockElems__BlockAssignment_2_1");
					put(grammarAccess.getElifsAccess().getEAssignment_0(), "rule__Elifs__EAssignment_0");
					put(grammarAccess.getElifsAccess().getEAssignment_1(), "rule__Elifs__EAssignment_1");
					put(grammarAccess.getElifAccess().getExprAssignment_1(), "rule__Elif__ExprAssignment_1");
					put(grammarAccess.getElifAccess().getBlockAssignment_3(), "rule__Elif__BlockAssignment_3");
					put(grammarAccess.getElseAccess().getBlockAssignment_1(), "rule__Else__BlockAssignment_1");
					put(grammarAccess.getGeneratorsAccess().getBindingAssignment_0(), "rule__Generators__BindingAssignment_0");
					put(grammarAccess.getGeneratorsAccess().getClauseAssignment_1_1(), "rule__Generators__ClauseAssignment_1_1");
					put(grammarAccess.getBindingAccess().getIdtupAssignment_0_0(), "rule__Binding__IdtupAssignment_0_0");
					put(grammarAccess.getBindingAccess().getExprAssignment_0_2(), "rule__Binding__ExprAssignment_0_2");
					put(grammarAccess.getBindingAccess().getIdtupAssignment_1_0(), "rule__Binding__IdtupAssignment_1_0");
					put(grammarAccess.getBindingAccess().getSeqAssignment_1_2(), "rule__Binding__SeqAssignment_1_2");
					put(grammarAccess.getBindingAccess().getExprAssignment_1_4(), "rule__Binding__ExprAssignment_1_4");
					put(grammarAccess.getGenClauseAccess().getBindingAssignment_0(), "rule__GenClause__BindingAssignment_0");
					put(grammarAccess.getGenClauseAccess().getExprAssignment_1(), "rule__GenClause__ExprAssignment_1");
					put(grammarAccess.getBlockElemsAccess().getBlockAssignment_0(), "rule__BlockElems__BlockAssignment_0");
					put(grammarAccess.getBlockElemsAccess().getBlockAssignment_1(), "rule__BlockElems__BlockAssignment_1");
					put(grammarAccess.getBlockElemAccess().getExpAssignment(), "rule__BlockElem__ExpAssignment");
					put(grammarAccess.getParanthesizedAccess().getExpAssignment_1(), "rule__Paranthesized__ExpAssignment_1");
					put(grammarAccess.getDoAccess().getDofsAssignment_0(), "rule__Do__DofsAssignment_0");
					put(grammarAccess.getDoAccess().getDofsAssignment_1_1(), "rule__Do__DofsAssignment_1_1");
					put(grammarAccess.getDoFrontAccess().getAtAssignment_0_0(), "rule__DoFront__AtAssignment_0_0");
					put(grammarAccess.getDoFrontAccess().getExpAssignment_0_1(), "rule__DoFront__ExpAssignment_0_1");
					put(grammarAccess.getDoFrontAccess().getAtomAssignment_1(), "rule__DoFront__AtomAssignment_1");
					put(grammarAccess.getDoFrontAccess().getBlockAssignment_3(), "rule__DoFront__BlockAssignment_3");
					put(grammarAccess.getIdOrTupleAccess().getBidAssignment_0(), "rule__IdOrTuple__BidAssignment_0");
					put(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_1(), "rule__IdOrTuple__BidAssignment_1_1");
					put(grammarAccess.getIdOrTupleAccess().getBidAssignment_1_2_1(), "rule__IdOrTuple__BidAssignment_1_2_1");
					put(grammarAccess.getIsTypeAccess().getTypeAssignment_1(), "rule__IsType__TypeAssignment_1");
					put(grammarAccess.getFieldDeclAccess().getPriAssignment_0_0(), "rule__FieldDecl__PriAssignment_0_0");
					put(grammarAccess.getFieldDeclAccess().getMutAssignment_0_1(), "rule__FieldDecl__MutAssignment_0_1");
					put(grammarAccess.getFieldDeclAccess().getVarsAssignment_0_2(), "rule__FieldDecl__VarsAssignment_0_2");
					put(grammarAccess.getFieldDeclAccess().getInitAssignment_0_3(), "rule__FieldDecl__InitAssignment_0_3");
					put(grammarAccess.getFieldDeclAccess().getPriAssignment_1_0(), "rule__FieldDecl__PriAssignment_1_0");
					put(grammarAccess.getFieldDeclAccess().getIdtupAssignment_1_1(), "rule__FieldDecl__IdtupAssignment_1_1");
					put(grammarAccess.getFieldDeclAccess().getLitTupAssignment_1_3(), "rule__FieldDecl__LitTupAssignment_1_3");
					put(grammarAccess.getFieldDeclAccess().getPriAssignment_2_0(), "rule__FieldDecl__PriAssignment_2_0");
					put(grammarAccess.getFieldDeclAccess().getMutAssignment_2_1(), "rule__FieldDecl__MutAssignment_2_1");
					put(grammarAccess.getFieldDeclAccess().getIdtupAssignment_2_2(), "rule__FieldDecl__IdtupAssignment_2_2");
					put(grammarAccess.getFieldDeclAccess().getTypeAssignment_2_4(), "rule__FieldDecl__TypeAssignment_2_4");
					put(grammarAccess.getFieldDeclAccess().getInitAssignment_2_6(), "rule__FieldDecl__InitAssignment_2_6");
					put(grammarAccess.getFieldDeclAccess().getPriAssignment_3_0(), "rule__FieldDecl__PriAssignment_3_0");
					put(grammarAccess.getFieldDeclAccess().getMutAssignment_3_1(), "rule__FieldDecl__MutAssignment_3_1");
					put(grammarAccess.getFieldDeclAccess().getIdtupAssignment_3_2(), "rule__FieldDecl__IdtupAssignment_3_2");
					put(grammarAccess.getFieldDeclAccess().getTuptypeAssignment_3_4(), "rule__FieldDecl__TuptypeAssignment_3_4");
					put(grammarAccess.getFieldDeclAccess().getInitAssignment_3_5(), "rule__FieldDecl__InitAssignment_3_5");
					put(grammarAccess.getNoNewlineVarWTypesAccess().getSingleAssignment_0(), "rule__NoNewlineVarWTypes__SingleAssignment_0");
					put(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleAssignment_1_1(), "rule__NoNewlineVarWTypes__MultipleAssignment_1_1");
					put(grammarAccess.getNoNewlineVarWTypesAccess().getMultipleAssignment_1_2_1(), "rule__NoNewlineVarWTypes__MultipleAssignment_1_2_1");
					put(grammarAccess.getNoNewlineVarWTypeAccess().getBidAssignment_0(), "rule__NoNewlineVarWType__BidAssignment_0");
					put(grammarAccess.getNoNewlineVarWTypeAccess().getIstypeAssignment_1(), "rule__NoNewlineVarWType__IstypeAssignment_1");
					put(grammarAccess.getInitValAccess().getMutAssignment_0_0(), "rule__InitVal__MutAssignment_0_0");
					put(grammarAccess.getInitValAccess().getLitAssignment_0_1(), "rule__InitVal__LitAssignment_0_1");
					put(grammarAccess.getInitValAccess().getImmutAssignment_1_0(), "rule__InitVal__ImmutAssignment_1_0");
					put(grammarAccess.getInitValAccess().getLitAssignment_1_1(), "rule__InitVal__LitAssignment_1_1");
					put(grammarAccess.getLiteralTupleAccess().getLitAssignment_0(), "rule__LiteralTuple__LitAssignment_0");
					put(grammarAccess.getLiteralTupleAccess().getLitsAssignment_1_1(), "rule__LiteralTuple__LitsAssignment_1_1");
					put(grammarAccess.getLiteralTupleAccess().getLitsAssignment_1_2_1(), "rule__LiteralTuple__LitsAssignment_1_2_1");
					put(grammarAccess.getLiteralAccess().getIntgAssignment_0(), "rule__Literal__IntgAssignment_0");
					put(grammarAccess.getLiteralAccess().getFlotAssignment_1(), "rule__Literal__FlotAssignment_1");
					put(grammarAccess.getLiteralAccess().getStrAssignment_2(), "rule__Literal__StrAssignment_2");
					put(grammarAccess.getLiteralAccess().getQAssignment_3(), "rule__Literal__QAssignment_3");
					put(grammarAccess.getLocalVarDeclAccess().getMutAssignment_0_0(), "rule__LocalVarDecl__MutAssignment_0_0");
					put(grammarAccess.getLocalVarDeclAccess().getVarsAssignment_0_1(), "rule__LocalVarDecl__VarsAssignment_0_1");
					put(grammarAccess.getLocalVarDeclAccess().getInitAssignment_0_2(), "rule__LocalVarDecl__InitAssignment_0_2");
					put(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_1_0(), "rule__LocalVarDecl__IdtupAssignment_1_0");
					put(grammarAccess.getLocalVarDeclAccess().getLitTupAssignment_1_2(), "rule__LocalVarDecl__LitTupAssignment_1_2");
					put(grammarAccess.getLocalVarDeclAccess().getMutAssignment_2_0(), "rule__LocalVarDecl__MutAssignment_2_0");
					put(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_2_1(), "rule__LocalVarDecl__IdtupAssignment_2_1");
					put(grammarAccess.getLocalVarDeclAccess().getTypeAssignment_2_3(), "rule__LocalVarDecl__TypeAssignment_2_3");
					put(grammarAccess.getLocalVarDeclAccess().getInitAssignment_2_5(), "rule__LocalVarDecl__InitAssignment_2_5");
					put(grammarAccess.getLocalVarDeclAccess().getMutAssignment_3_0(), "rule__LocalVarDecl__MutAssignment_3_0");
					put(grammarAccess.getLocalVarDeclAccess().getIdtupAssignment_3_1(), "rule__LocalVarDecl__IdtupAssignment_3_1");
					put(grammarAccess.getLocalVarDeclAccess().getTuptypeAssignment_3_3(), "rule__LocalVarDecl__TuptypeAssignment_3_3");
					put(grammarAccess.getLocalVarDeclAccess().getInitAssignment_3_4(), "rule__LocalVarDecl__InitAssignment_3_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FortXTransGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FortXTransGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
