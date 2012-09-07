package com.tocea.codewatch.architecture.dsl.serializer;

import com.google.inject.Inject;
import com.tocea.codewatch.architecture.dsl.services.ArchitectureDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ArchitectureDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ArchitectureDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Pattern_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__;
	protected AbstractElementAlias match_Relationship_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__;
	protected AbstractElementAlias match_Role_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ArchitectureDSLGrammarAccess) access;
		match_Pattern_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getPatternAccess().getSemicolonKeyword_5_1()));
		match_Relationship_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getRelationshipAccess().getSemicolonKeyword_5_1()));
		match_Role_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getRoleAccess().getSemicolonKeyword_5_1()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2()));
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Pattern_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__.equals(syntax))
				emit_Pattern_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Relationship_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__.equals(syntax))
				emit_Relationship_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Role_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__.equals(syntax))
				emit_Role_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q.equals(syntax))
				emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_Pattern_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Relationship_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_Role_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
