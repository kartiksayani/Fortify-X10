/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
grammar InternalDomainModel;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.example.domainmodel.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.example.domainmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.domainmodel.services.DomainModelGrammarAccess;

}
@parser::members {
	private DomainModelGrammarAccess grammarAccess;

	public void setGrammarAccess(DomainModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDomainmodel
entryRuleDomainmodel
:
{ before(grammarAccess.getDomainmodelRule()); }
	 ruleDomainmodel
{ after(grammarAccess.getDomainmodelRule()); } 
	 EOF 
;

// Rule Domainmodel
ruleDomainmodel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); }
		(rule__Domainmodel__ElementsAssignment)*
		{ after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement
:
{ before(grammarAccess.getAbstractElementRule()); }
	 ruleAbstractElement
{ after(grammarAccess.getAbstractElementRule()); } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractElementAccess().getAlternatives()); }
		(rule__AbstractElement__Alternatives)
		{ after(grammarAccess.getAbstractElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePackageDecl
entryRulePackageDecl
:
{ before(grammarAccess.getPackageDeclRule()); }
	 rulePackageDecl
{ after(grammarAccess.getPackageDeclRule()); } 
	 EOF 
;

// Rule PackageDecl
rulePackageDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPackageDeclAccess().getGroup()); }
		(rule__PackageDecl__Group__0)
		{ after(grammarAccess.getPackageDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard
:
{ before(grammarAccess.getQualifiedNameWithWildcardRule()); }
	 ruleQualifiedNameWithWildcard
{ after(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
		(rule__QualifiedNameWithWildcard__Group__0)
		{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataType
entryRuleDataType
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeAccess().getGroup()); }
		(rule__DataType__Group__0)
		{ after(grammarAccess.getDataTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractElementAccess().getPackageDeclParserRuleCall_0()); }
		rulePackageDecl
		{ after(grammarAccess.getAbstractElementAccess().getPackageDeclParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); }
		ruleType
		{ after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); }
		ruleImport
		{ after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); }
		ruleDataType
		{ after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
		ruleEntity
		{ after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDecl__Group__0__Impl
	rule__PackageDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclAccess().getPackageKeyword_0()); }
	'package'
	{ after(grammarAccess.getPackageDeclAccess().getPackageKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDecl__Group__1__Impl
	rule__PackageDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclAccess().getNameAssignment_1()); }
	(rule__PackageDecl__NameAssignment_1)
	{ after(grammarAccess.getPackageDeclAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDecl__Group__2__Impl
	rule__PackageDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getPackageDeclAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDecl__Group__3__Impl
	rule__PackageDecl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclAccess().getElementsAssignment_3()); }
	(rule__PackageDecl__ElementsAssignment_3)*
	{ after(grammarAccess.getPackageDeclAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDecl__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getPackageDeclAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__Import__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedNameWithWildcard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__0__Impl
	rule__QualifiedNameWithWildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
	('.*')?
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__0__Impl
	rule__DataType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); }
	'datatype'
	{ after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
	(rule__DataType__NameAssignment_1)
	{ after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_2()); }
	(rule__Entity__Group_2__0)?
	{ after(grammarAccess.getEntityAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); }
	(rule__Entity__FeaturesAssignment_4)*
	{ after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__0__Impl
	rule__Entity__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); }
	'extends'
	{ after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); }
	(rule__Entity__SuperTypeAssignment_2_1)
	{ after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getManyAssignment_0()); }
	(rule__Feature__ManyAssignment_0)?
	{ after(grammarAccess.getFeatureAccess().getManyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
	(rule__Feature__NameAssignment_1)
	{ after(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
	rule__Feature__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); }
	(rule__Feature__TypeAssignment_3)
	{ after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Domainmodel__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); }
		ruleAbstractElement
		{ after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclAccess().getNameQualifiedNameParserRuleCall_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getPackageDeclAccess().getNameQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDecl__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclAccess().getElementsAbstractElementParserRuleCall_3_0()); }
		ruleAbstractElement
		{ after(grammarAccess.getPackageDeclAccess().getElementsAbstractElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
		ruleQualifiedNameWithWildcard
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__SuperTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FeaturesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); }
		ruleFeature
		{ after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ManyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
			'many'
			{ after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
		)
		{ after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
