/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMymixParser;
import org.xtext.example.mydsl.services.MymixGrammarAccess;

public class MymixParser extends AbstractContentAssistParser {

	@Inject
	private MymixGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMymixParser createParser() {
		InternalMymixParser result = new InternalMymixParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
					put(grammarAccess.getTakeStuffAccess().getAlternatives_1(), "rule__TakeStuff__Alternatives_1");
					put(grammarAccess.getFilterAccess().getAlternatives(), "rule__Filter__Alternatives");
					put(grammarAccess.getProcedureAccess().getGroup(), "rule__Procedure__Group__0");
					put(grammarAccess.getTakeStuffAccess().getGroup(), "rule__TakeStuff__Group__0");
					put(grammarAccess.getTakeAccess().getGroup(), "rule__Take__Group__0");
					put(grammarAccess.getTakeAccess().getGroup_4(), "rule__Take__Group_4__0");
					put(grammarAccess.getPutSomeAccess().getGroup(), "rule__PutSome__Group__0");
					put(grammarAccess.getPutAllAccess().getGroup(), "rule__PutAll__Group__0");
					put(grammarAccess.getPutAccess().getGroup(), "rule__Put__Group__0");
					put(grammarAccess.getPutAccess().getGroup_4(), "rule__Put__Group_4__0");
					put(grammarAccess.getCheckAccess().getGroup(), "rule__Check__Group__0");
					put(grammarAccess.getCheckAccess().getGroup_2(), "rule__Check__Group_2__0");
					put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
					put(grammarAccess.getResultAccess().getGroup(), "rule__Result__Group__0");
					put(grammarAccess.getCupAccess().getGroup(), "rule__Cup__Group__0");
					put(grammarAccess.getQuantityAccess().getGroup(), "rule__Quantity__Group__0");
					put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
					put(grammarAccess.getDeviceAccess().getProceduresAssignment(), "rule__Device__ProceduresAssignment");
					put(grammarAccess.getProcedureAccess().getNameAssignment_1(), "rule__Procedure__NameAssignment_1");
					put(grammarAccess.getProcedureAccess().getBodyAssignment_2(), "rule__Procedure__BodyAssignment_2");
					put(grammarAccess.getProcedureAccess().getResultAssignment_3(), "rule__Procedure__ResultAssignment_3");
					put(grammarAccess.getTakeStuffAccess().getOpAssignment_0(), "rule__TakeStuff__OpAssignment_0");
					put(grammarAccess.getTakeStuffAccess().getBodyAssignment_1_0(), "rule__TakeStuff__BodyAssignment_1_0");
					put(grammarAccess.getTakeStuffAccess().getBodyAssignment_1_1(), "rule__TakeStuff__BodyAssignment_1_1");
					put(grammarAccess.getTakeAccess().getQuantityAssignment_1(), "rule__Take__QuantityAssignment_1");
					put(grammarAccess.getTakeAccess().getCupAssignment_3(), "rule__Take__CupAssignment_3");
					put(grammarAccess.getTakeAccess().getFilterAssignment_4_1(), "rule__Take__FilterAssignment_4_1");
					put(grammarAccess.getPutSomeAccess().getWaitAssignment_0(), "rule__PutSome__WaitAssignment_0");
					put(grammarAccess.getPutSomeAccess().getPutAssignment_1(), "rule__PutSome__PutAssignment_1");
					put(grammarAccess.getPutAllAccess().getCupAssignment_1(), "rule__PutAll__CupAssignment_1");
					put(grammarAccess.getPutAccess().getQuantityAssignment_1(), "rule__Put__QuantityAssignment_1");
					put(grammarAccess.getPutAccess().getCupAssignment_3(), "rule__Put__CupAssignment_3");
					put(grammarAccess.getPutAccess().getFilterAssignment_4_1(), "rule__Put__FilterAssignment_4_1");
					put(grammarAccess.getCheckAccess().getCupAssignment_1(), "rule__Check__CupAssignment_1");
					put(grammarAccess.getCheckAccess().getQuantityAssignment_2_1(), "rule__Check__QuantityAssignment_2_1");
					put(grammarAccess.getWaitAccess().getTimeAssignment_1(), "rule__Wait__TimeAssignment_1");
					put(grammarAccess.getResultAccess().getCupAssignment_1(), "rule__Result__CupAssignment_1");
					put(grammarAccess.getFilterAccess().getFilterAssignment_0(), "rule__Filter__FilterAssignment_0");
					put(grammarAccess.getFilterAccess().getFilterAssignment_1(), "rule__Filter__FilterAssignment_1");
					put(grammarAccess.getCupAccess().getCupAssignment_1(), "rule__Cup__CupAssignment_1");
					put(grammarAccess.getQuantityAccess().getQuantityAssignment_0(), "rule__Quantity__QuantityAssignment_0");
					put(grammarAccess.getTimeAccess().getTimeAssignment_0(), "rule__Time__TimeAssignment_0");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMymixParser typedParser = (InternalMymixParser) parser;
			typedParser.entryRuleDevice();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MymixGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MymixGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
