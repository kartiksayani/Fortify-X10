/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
grammar InternalFortXTrans;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package srf.transpiler.fortxtrans.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package srf.transpiler.fortxtrans.ide.contentassist.antlr.internal;

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
import srf.transpiler.fortxtrans.services.FortXTransGrammarAccess;

}
@parser::members {
	private FortXTransGrammarAccess grammarAccess;

	public void setGrammarAccess(FortXTransGrammarAccess grammarAccess) {
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

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getFileParserRuleCall()); }
		ruleFile
		{ after(grammarAccess.getModelAccess().getFileParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFile
entryRuleFile
:
{ before(grammarAccess.getFileRule()); }
	 ruleFile
{ after(grammarAccess.getFileRule()); } 
	 EOF 
;

// Rule File
ruleFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFileAccess().getAlternatives()); }
		(rule__File__Alternatives)
		{ after(grammarAccess.getFileAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponent
entryRuleComponent
:
{ before(grammarAccess.getComponentRule()); }
	 ruleComponent
{ after(grammarAccess.getComponentRule()); } 
	 EOF 
;

// Rule Component
ruleComponent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentAccess().getGroup()); }
		(rule__Component__Group__0)
		{ after(grammarAccess.getComponentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleApi
entryRuleApi
:
{ before(grammarAccess.getApiRule()); }
	 ruleApi
{ after(grammarAccess.getApiRule()); } 
	 EOF 
;

// Rule Api
ruleApi 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getApiAccess().getGroup()); }
		(rule__Api__Group__0)
		{ after(grammarAccess.getApiAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFileAccess().getComponentParserRuleCall_0()); }
		ruleComponent
		{ after(grammarAccess.getFileAccess().getComponentParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFileAccess().getApiParserRuleCall_1()); }
		ruleApi
		{ after(grammarAccess.getFileAccess().getApiParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__0__Impl
	rule__Component__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getComponentKeyword_0()); }
	'component'
	{ after(grammarAccess.getComponentAccess().getComponentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getNameAssignment_1()); }
	(rule__Component__NameAssignment_1)
	{ after(grammarAccess.getComponentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Api__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Api__Group__0__Impl
	rule__Api__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApiAccess().getApiKeyword_0()); }
	'api'
	{ after(grammarAccess.getApiAccess().getApiKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Api__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApiAccess().getNameAssignment_1()); }
	(rule__Api__NameAssignment_1)
	{ after(grammarAccess.getApiAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Component__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getApiAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getApiAccess().getNameIDTerminalRuleCall_1_0()); }
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