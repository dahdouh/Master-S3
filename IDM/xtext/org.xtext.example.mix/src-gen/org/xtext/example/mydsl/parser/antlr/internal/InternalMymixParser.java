package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MymixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMymixParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'take'", "'from'", "'filter'", "'to'", "'put'", "'check'", "'forQuantity'", "'wait'", "'result'", "'A'", "'B'", "'cup'", "'mL'", "'sec'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMymixParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMymixParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMymixParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMymix.g"; }



     	private MymixGrammarAccess grammarAccess;

        public InternalMymixParser(TokenStream input, MymixGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Device";
       	}

       	@Override
       	protected MymixGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDevice"
    // InternalMymix.g:64:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalMymix.g:64:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalMymix.g:65:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalMymix.g:71:1: ruleDevice returns [EObject current=null] : ( (lv_procedures_0_0= ruleProcedure ) )* ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject lv_procedures_0_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:77:2: ( ( (lv_procedures_0_0= ruleProcedure ) )* )
            // InternalMymix.g:78:2: ( (lv_procedures_0_0= ruleProcedure ) )*
            {
            // InternalMymix.g:78:2: ( (lv_procedures_0_0= ruleProcedure ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMymix.g:79:3: (lv_procedures_0_0= ruleProcedure )
            	    {
            	    // InternalMymix.g:79:3: (lv_procedures_0_0= ruleProcedure )
            	    // InternalMymix.g:80:4: lv_procedures_0_0= ruleProcedure
            	    {

            	    				newCompositeNode(grammarAccess.getDeviceAccess().getProceduresProcedureParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_procedures_0_0=ruleProcedure();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    				}
            	    				add(
            	    					current,
            	    					"procedures",
            	    					lv_procedures_0_0,
            	    					"org.xtext.example.mydsl.Mymix.Procedure");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleProcedure"
    // InternalMymix.g:100:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalMymix.g:100:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalMymix.g:101:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalMymix.g:107:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleOperation ) )+ ( (lv_result_3_0= ruleResult ) ) ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_body_2_0 = null;

        EObject lv_result_3_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:113:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleOperation ) )+ ( (lv_result_3_0= ruleResult ) ) ) )
            // InternalMymix.g:114:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleOperation ) )+ ( (lv_result_3_0= ruleResult ) ) )
            {
            // InternalMymix.g:114:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleOperation ) )+ ( (lv_result_3_0= ruleResult ) ) )
            // InternalMymix.g:115:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleOperation ) )+ ( (lv_result_3_0= ruleResult ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
            		
            // InternalMymix.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMymix.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMymix.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMymix.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMymix.g:137:3: ( (lv_body_2_0= ruleOperation ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==17||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMymix.g:138:4: (lv_body_2_0= ruleOperation )
            	    {
            	    // InternalMymix.g:138:4: (lv_body_2_0= ruleOperation )
            	    // InternalMymix.g:139:5: lv_body_2_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getBodyOperationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_body_2_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_2_0,
            	    						"org.xtext.example.mydsl.Mymix.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalMymix.g:156:3: ( (lv_result_3_0= ruleResult ) )
            // InternalMymix.g:157:4: (lv_result_3_0= ruleResult )
            {
            // InternalMymix.g:157:4: (lv_result_3_0= ruleResult )
            // InternalMymix.g:158:5: lv_result_3_0= ruleResult
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getResultResultParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_result_3_0=ruleResult();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_3_0,
            						"org.xtext.example.mydsl.Mymix.Result");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleOperation"
    // InternalMymix.g:179:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMymix.g:179:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMymix.g:180:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMymix.g:186:1: ruleOperation returns [EObject current=null] : (this_Check_0= ruleCheck | this_Wait_1= ruleWait | this_TakeStuff_2= ruleTakeStuff ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Check_0 = null;

        EObject this_Wait_1 = null;

        EObject this_TakeStuff_2 = null;



        	enterRule();

        try {
            // InternalMymix.g:192:2: ( (this_Check_0= ruleCheck | this_Wait_1= ruleWait | this_TakeStuff_2= ruleTakeStuff ) )
            // InternalMymix.g:193:2: (this_Check_0= ruleCheck | this_Wait_1= ruleWait | this_TakeStuff_2= ruleTakeStuff )
            {
            // InternalMymix.g:193:2: (this_Check_0= ruleCheck | this_Wait_1= ruleWait | this_TakeStuff_2= ruleTakeStuff )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMymix.g:194:3: this_Check_0= ruleCheck
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getCheckParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Check_0=ruleCheck();

                    state._fsp--;


                    			current = this_Check_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMymix.g:203:3: this_Wait_1= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getWaitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_1=ruleWait();

                    state._fsp--;


                    			current = this_Wait_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMymix.g:212:3: this_TakeStuff_2= ruleTakeStuff
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getTakeStuffParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TakeStuff_2=ruleTakeStuff();

                    state._fsp--;


                    			current = this_TakeStuff_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleTakeStuff"
    // InternalMymix.g:224:1: entryRuleTakeStuff returns [EObject current=null] : iv_ruleTakeStuff= ruleTakeStuff EOF ;
    public final EObject entryRuleTakeStuff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakeStuff = null;


        try {
            // InternalMymix.g:224:50: (iv_ruleTakeStuff= ruleTakeStuff EOF )
            // InternalMymix.g:225:2: iv_ruleTakeStuff= ruleTakeStuff EOF
            {
             newCompositeNode(grammarAccess.getTakeStuffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTakeStuff=ruleTakeStuff();

            state._fsp--;

             current =iv_ruleTakeStuff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTakeStuff"


    // $ANTLR start "ruleTakeStuff"
    // InternalMymix.g:231:1: ruleTakeStuff returns [EObject current=null] : ( ( (lv_op_0_0= ruleTake ) ) ( ( (lv_body_1_0= rulePutSome ) ) | ( (lv_body_2_0= rulePutAll ) ) ) ) ;
    public final EObject ruleTakeStuff() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_0 = null;

        EObject lv_body_1_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:237:2: ( ( ( (lv_op_0_0= ruleTake ) ) ( ( (lv_body_1_0= rulePutSome ) ) | ( (lv_body_2_0= rulePutAll ) ) ) ) )
            // InternalMymix.g:238:2: ( ( (lv_op_0_0= ruleTake ) ) ( ( (lv_body_1_0= rulePutSome ) ) | ( (lv_body_2_0= rulePutAll ) ) ) )
            {
            // InternalMymix.g:238:2: ( ( (lv_op_0_0= ruleTake ) ) ( ( (lv_body_1_0= rulePutSome ) ) | ( (lv_body_2_0= rulePutAll ) ) ) )
            // InternalMymix.g:239:3: ( (lv_op_0_0= ruleTake ) ) ( ( (lv_body_1_0= rulePutSome ) ) | ( (lv_body_2_0= rulePutAll ) ) )
            {
            // InternalMymix.g:239:3: ( (lv_op_0_0= ruleTake ) )
            // InternalMymix.g:240:4: (lv_op_0_0= ruleTake )
            {
            // InternalMymix.g:240:4: (lv_op_0_0= ruleTake )
            // InternalMymix.g:241:5: lv_op_0_0= ruleTake
            {

            					newCompositeNode(grammarAccess.getTakeStuffAccess().getOpTakeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_op_0_0=ruleTake();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTakeStuffRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"org.xtext.example.mydsl.Mymix.Take");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMymix.g:258:3: ( ( (lv_body_1_0= rulePutSome ) ) | ( (lv_body_2_0= rulePutAll ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16||LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMymix.g:259:4: ( (lv_body_1_0= rulePutSome ) )
                    {
                    // InternalMymix.g:259:4: ( (lv_body_1_0= rulePutSome ) )
                    // InternalMymix.g:260:5: (lv_body_1_0= rulePutSome )
                    {
                    // InternalMymix.g:260:5: (lv_body_1_0= rulePutSome )
                    // InternalMymix.g:261:6: lv_body_1_0= rulePutSome
                    {

                    						newCompositeNode(grammarAccess.getTakeStuffAccess().getBodyPutSomeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_1_0=rulePutSome();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTakeStuffRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_1_0,
                    							"org.xtext.example.mydsl.Mymix.PutSome");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMymix.g:279:4: ( (lv_body_2_0= rulePutAll ) )
                    {
                    // InternalMymix.g:279:4: ( (lv_body_2_0= rulePutAll ) )
                    // InternalMymix.g:280:5: (lv_body_2_0= rulePutAll )
                    {
                    // InternalMymix.g:280:5: (lv_body_2_0= rulePutAll )
                    // InternalMymix.g:281:6: lv_body_2_0= rulePutAll
                    {

                    						newCompositeNode(grammarAccess.getTakeStuffAccess().getBodyPutAllParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_2_0=rulePutAll();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTakeStuffRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_0,
                    							"org.xtext.example.mydsl.Mymix.PutAll");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTakeStuff"


    // $ANTLR start "entryRuleTake"
    // InternalMymix.g:303:1: entryRuleTake returns [EObject current=null] : iv_ruleTake= ruleTake EOF ;
    public final EObject entryRuleTake() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTake = null;


        try {
            // InternalMymix.g:303:45: (iv_ruleTake= ruleTake EOF )
            // InternalMymix.g:304:2: iv_ruleTake= ruleTake EOF
            {
             newCompositeNode(grammarAccess.getTakeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTake=ruleTake();

            state._fsp--;

             current =iv_ruleTake; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTake"


    // $ANTLR start "ruleTake"
    // InternalMymix.g:310:1: ruleTake returns [EObject current=null] : (otherlv_0= 'take' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )? ) ;
    public final EObject ruleTake() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_quantity_1_0 = null;

        EObject lv_cup_3_0 = null;

        EObject lv_filter_5_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:316:2: ( (otherlv_0= 'take' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )? ) )
            // InternalMymix.g:317:2: (otherlv_0= 'take' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )? )
            {
            // InternalMymix.g:317:2: (otherlv_0= 'take' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )? )
            // InternalMymix.g:318:3: otherlv_0= 'take' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTakeAccess().getTakeKeyword_0());
            		
            // InternalMymix.g:322:3: ( (lv_quantity_1_0= ruleQuantity ) )
            // InternalMymix.g:323:4: (lv_quantity_1_0= ruleQuantity )
            {
            // InternalMymix.g:323:4: (lv_quantity_1_0= ruleQuantity )
            // InternalMymix.g:324:5: lv_quantity_1_0= ruleQuantity
            {

            					newCompositeNode(grammarAccess.getTakeAccess().getQuantityQuantityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_quantity_1_0=ruleQuantity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTakeRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_1_0,
            						"org.xtext.example.mydsl.Mymix.Quantity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTakeAccess().getFromKeyword_2());
            		
            // InternalMymix.g:345:3: ( (lv_cup_3_0= ruleCup ) )
            // InternalMymix.g:346:4: (lv_cup_3_0= ruleCup )
            {
            // InternalMymix.g:346:4: (lv_cup_3_0= ruleCup )
            // InternalMymix.g:347:5: lv_cup_3_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getTakeAccess().getCupCupParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_cup_3_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTakeRule());
            					}
            					set(
            						current,
            						"cup",
            						lv_cup_3_0,
            						"org.xtext.example.mydsl.Mymix.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMymix.g:364:3: (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMymix.g:365:4: otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getTakeAccess().getFilterKeyword_4_0());
                    			
                    // InternalMymix.g:369:4: ( (lv_filter_5_0= ruleFilter ) )
                    // InternalMymix.g:370:5: (lv_filter_5_0= ruleFilter )
                    {
                    // InternalMymix.g:370:5: (lv_filter_5_0= ruleFilter )
                    // InternalMymix.g:371:6: lv_filter_5_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getTakeAccess().getFilterFilterParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_filter_5_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTakeRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_5_0,
                    							"org.xtext.example.mydsl.Mymix.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTake"


    // $ANTLR start "entryRulePutSome"
    // InternalMymix.g:393:1: entryRulePutSome returns [EObject current=null] : iv_rulePutSome= rulePutSome EOF ;
    public final EObject entryRulePutSome() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutSome = null;


        try {
            // InternalMymix.g:393:48: (iv_rulePutSome= rulePutSome EOF )
            // InternalMymix.g:394:2: iv_rulePutSome= rulePutSome EOF
            {
             newCompositeNode(grammarAccess.getPutSomeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePutSome=rulePutSome();

            state._fsp--;

             current =iv_rulePutSome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePutSome"


    // $ANTLR start "rulePutSome"
    // InternalMymix.g:400:1: rulePutSome returns [EObject current=null] : ( ( (lv_wait_0_0= ruleWait ) )? ( (lv_put_1_0= rulePut ) ) )+ ;
    public final EObject rulePutSome() throws RecognitionException {
        EObject current = null;

        EObject lv_wait_0_0 = null;

        EObject lv_put_1_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:406:2: ( ( ( (lv_wait_0_0= ruleWait ) )? ( (lv_put_1_0= rulePut ) ) )+ )
            // InternalMymix.g:407:2: ( ( (lv_wait_0_0= ruleWait ) )? ( (lv_put_1_0= rulePut ) ) )+
            {
            // InternalMymix.g:407:2: ( ( (lv_wait_0_0= ruleWait ) )? ( (lv_put_1_0= rulePut ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_INT) ) {
                        int LA7_4 = input.LA(3);

                        if ( (LA7_4==25) ) {
                            int LA7_5 = input.LA(4);

                            if ( (LA7_5==16) ) {
                                alt7=1;
                            }


                        }
                        else if ( (LA7_4==16) ) {
                            alt7=1;
                        }


                    }


                }
                else if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMymix.g:408:3: ( (lv_wait_0_0= ruleWait ) )? ( (lv_put_1_0= rulePut ) )
            	    {
            	    // InternalMymix.g:408:3: ( (lv_wait_0_0= ruleWait ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==19) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMymix.g:409:4: (lv_wait_0_0= ruleWait )
            	            {
            	            // InternalMymix.g:409:4: (lv_wait_0_0= ruleWait )
            	            // InternalMymix.g:410:5: lv_wait_0_0= ruleWait
            	            {

            	            					newCompositeNode(grammarAccess.getPutSomeAccess().getWaitWaitParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_13);
            	            lv_wait_0_0=ruleWait();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getPutSomeRule());
            	            					}
            	            					add(
            	            						current,
            	            						"wait",
            	            						lv_wait_0_0,
            	            						"org.xtext.example.mydsl.Mymix.Wait");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMymix.g:427:3: ( (lv_put_1_0= rulePut ) )
            	    // InternalMymix.g:428:4: (lv_put_1_0= rulePut )
            	    {
            	    // InternalMymix.g:428:4: (lv_put_1_0= rulePut )
            	    // InternalMymix.g:429:5: lv_put_1_0= rulePut
            	    {

            	    					newCompositeNode(grammarAccess.getPutSomeAccess().getPutPutParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_put_1_0=rulePut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPutSomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"put",
            	    						lv_put_1_0,
            	    						"org.xtext.example.mydsl.Mymix.Put");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePutSome"


    // $ANTLR start "entryRulePutAll"
    // InternalMymix.g:450:1: entryRulePutAll returns [EObject current=null] : iv_rulePutAll= rulePutAll EOF ;
    public final EObject entryRulePutAll() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutAll = null;


        try {
            // InternalMymix.g:450:47: (iv_rulePutAll= rulePutAll EOF )
            // InternalMymix.g:451:2: iv_rulePutAll= rulePutAll EOF
            {
             newCompositeNode(grammarAccess.getPutAllRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePutAll=rulePutAll();

            state._fsp--;

             current =iv_rulePutAll; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePutAll"


    // $ANTLR start "rulePutAll"
    // InternalMymix.g:457:1: rulePutAll returns [EObject current=null] : (otherlv_0= 'to' ( (lv_cup_1_0= ruleCup ) ) ) ;
    public final EObject rulePutAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cup_1_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:463:2: ( (otherlv_0= 'to' ( (lv_cup_1_0= ruleCup ) ) ) )
            // InternalMymix.g:464:2: (otherlv_0= 'to' ( (lv_cup_1_0= ruleCup ) ) )
            {
            // InternalMymix.g:464:2: (otherlv_0= 'to' ( (lv_cup_1_0= ruleCup ) ) )
            // InternalMymix.g:465:3: otherlv_0= 'to' ( (lv_cup_1_0= ruleCup ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPutAllAccess().getToKeyword_0());
            		
            // InternalMymix.g:469:3: ( (lv_cup_1_0= ruleCup ) )
            // InternalMymix.g:470:4: (lv_cup_1_0= ruleCup )
            {
            // InternalMymix.g:470:4: (lv_cup_1_0= ruleCup )
            // InternalMymix.g:471:5: lv_cup_1_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getPutAllAccess().getCupCupParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cup_1_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPutAllRule());
            					}
            					set(
            						current,
            						"cup",
            						lv_cup_1_0,
            						"org.xtext.example.mydsl.Mymix.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePutAll"


    // $ANTLR start "entryRulePut"
    // InternalMymix.g:492:1: entryRulePut returns [EObject current=null] : iv_rulePut= rulePut EOF ;
    public final EObject entryRulePut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePut = null;


        try {
            // InternalMymix.g:492:44: (iv_rulePut= rulePut EOF )
            // InternalMymix.g:493:2: iv_rulePut= rulePut EOF
            {
             newCompositeNode(grammarAccess.getPutRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePut=rulePut();

            state._fsp--;

             current =iv_rulePut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePut"


    // $ANTLR start "rulePut"
    // InternalMymix.g:499:1: rulePut returns [EObject current=null] : (otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'to' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )? ) ;
    public final EObject rulePut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_quantity_1_0 = null;

        EObject lv_cup_3_0 = null;

        EObject lv_filter_5_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:505:2: ( (otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'to' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )? ) )
            // InternalMymix.g:506:2: (otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'to' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )? )
            {
            // InternalMymix.g:506:2: (otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'to' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )? )
            // InternalMymix.g:507:3: otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'to' ( (lv_cup_3_0= ruleCup ) ) (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPutAccess().getPutKeyword_0());
            		
            // InternalMymix.g:511:3: ( (lv_quantity_1_0= ruleQuantity ) )
            // InternalMymix.g:512:4: (lv_quantity_1_0= ruleQuantity )
            {
            // InternalMymix.g:512:4: (lv_quantity_1_0= ruleQuantity )
            // InternalMymix.g:513:5: lv_quantity_1_0= ruleQuantity
            {

            					newCompositeNode(grammarAccess.getPutAccess().getQuantityQuantityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_quantity_1_0=ruleQuantity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPutRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_1_0,
            						"org.xtext.example.mydsl.Mymix.Quantity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPutAccess().getToKeyword_2());
            		
            // InternalMymix.g:534:3: ( (lv_cup_3_0= ruleCup ) )
            // InternalMymix.g:535:4: (lv_cup_3_0= ruleCup )
            {
            // InternalMymix.g:535:4: (lv_cup_3_0= ruleCup )
            // InternalMymix.g:536:5: lv_cup_3_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getPutAccess().getCupCupParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_cup_3_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPutRule());
            					}
            					set(
            						current,
            						"cup",
            						lv_cup_3_0,
            						"org.xtext.example.mydsl.Mymix.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMymix.g:553:3: (otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMymix.g:554:4: otherlv_4= 'filter' ( (lv_filter_5_0= ruleFilter ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getPutAccess().getFilterKeyword_4_0());
                    			
                    // InternalMymix.g:558:4: ( (lv_filter_5_0= ruleFilter ) )
                    // InternalMymix.g:559:5: (lv_filter_5_0= ruleFilter )
                    {
                    // InternalMymix.g:559:5: (lv_filter_5_0= ruleFilter )
                    // InternalMymix.g:560:6: lv_filter_5_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getPutAccess().getFilterFilterParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_filter_5_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPutRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_5_0,
                    							"org.xtext.example.mydsl.Mymix.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePut"


    // $ANTLR start "entryRuleCheck"
    // InternalMymix.g:582:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalMymix.g:582:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalMymix.g:583:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalMymix.g:589:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' ( (lv_cup_1_0= ruleCup ) ) (otherlv_2= 'forQuantity' ( (lv_quantity_3_0= ruleQuantity ) ) )? ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cup_1_0 = null;

        EObject lv_quantity_3_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:595:2: ( (otherlv_0= 'check' ( (lv_cup_1_0= ruleCup ) ) (otherlv_2= 'forQuantity' ( (lv_quantity_3_0= ruleQuantity ) ) )? ) )
            // InternalMymix.g:596:2: (otherlv_0= 'check' ( (lv_cup_1_0= ruleCup ) ) (otherlv_2= 'forQuantity' ( (lv_quantity_3_0= ruleQuantity ) ) )? )
            {
            // InternalMymix.g:596:2: (otherlv_0= 'check' ( (lv_cup_1_0= ruleCup ) ) (otherlv_2= 'forQuantity' ( (lv_quantity_3_0= ruleQuantity ) ) )? )
            // InternalMymix.g:597:3: otherlv_0= 'check' ( (lv_cup_1_0= ruleCup ) ) (otherlv_2= 'forQuantity' ( (lv_quantity_3_0= ruleQuantity ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalMymix.g:601:3: ( (lv_cup_1_0= ruleCup ) )
            // InternalMymix.g:602:4: (lv_cup_1_0= ruleCup )
            {
            // InternalMymix.g:602:4: (lv_cup_1_0= ruleCup )
            // InternalMymix.g:603:5: lv_cup_1_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getCheckAccess().getCupCupParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_cup_1_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckRule());
            					}
            					set(
            						current,
            						"cup",
            						lv_cup_1_0,
            						"org.xtext.example.mydsl.Mymix.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMymix.g:620:3: (otherlv_2= 'forQuantity' ( (lv_quantity_3_0= ruleQuantity ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMymix.g:621:4: otherlv_2= 'forQuantity' ( (lv_quantity_3_0= ruleQuantity ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getCheckAccess().getForQuantityKeyword_2_0());
                    			
                    // InternalMymix.g:625:4: ( (lv_quantity_3_0= ruleQuantity ) )
                    // InternalMymix.g:626:5: (lv_quantity_3_0= ruleQuantity )
                    {
                    // InternalMymix.g:626:5: (lv_quantity_3_0= ruleQuantity )
                    // InternalMymix.g:627:6: lv_quantity_3_0= ruleQuantity
                    {

                    						newCompositeNode(grammarAccess.getCheckAccess().getQuantityQuantityParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_quantity_3_0=ruleQuantity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckRule());
                    						}
                    						set(
                    							current,
                    							"quantity",
                    							lv_quantity_3_0,
                    							"org.xtext.example.mydsl.Mymix.Quantity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleWait"
    // InternalMymix.g:649:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalMymix.g:649:45: (iv_ruleWait= ruleWait EOF )
            // InternalMymix.g:650:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalMymix.g:656:1: ruleWait returns [EObject current=null] : (otherlv_0= 'wait' ( (lv_time_1_0= ruleTime ) ) ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:662:2: ( (otherlv_0= 'wait' ( (lv_time_1_0= ruleTime ) ) ) )
            // InternalMymix.g:663:2: (otherlv_0= 'wait' ( (lv_time_1_0= ruleTime ) ) )
            {
            // InternalMymix.g:663:2: (otherlv_0= 'wait' ( (lv_time_1_0= ruleTime ) ) )
            // InternalMymix.g:664:3: otherlv_0= 'wait' ( (lv_time_1_0= ruleTime ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWaitKeyword_0());
            		
            // InternalMymix.g:668:3: ( (lv_time_1_0= ruleTime ) )
            // InternalMymix.g:669:4: (lv_time_1_0= ruleTime )
            {
            // InternalMymix.g:669:4: (lv_time_1_0= ruleTime )
            // InternalMymix.g:670:5: lv_time_1_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getTimeTimeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_1_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.xtext.example.mydsl.Mymix.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleResult"
    // InternalMymix.g:691:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalMymix.g:691:47: (iv_ruleResult= ruleResult EOF )
            // InternalMymix.g:692:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalMymix.g:698:1: ruleResult returns [EObject current=null] : (otherlv_0= 'result' ( (lv_cup_1_0= ruleCup ) ) ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cup_1_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:704:2: ( (otherlv_0= 'result' ( (lv_cup_1_0= ruleCup ) ) ) )
            // InternalMymix.g:705:2: (otherlv_0= 'result' ( (lv_cup_1_0= ruleCup ) ) )
            {
            // InternalMymix.g:705:2: (otherlv_0= 'result' ( (lv_cup_1_0= ruleCup ) ) )
            // InternalMymix.g:706:3: otherlv_0= 'result' ( (lv_cup_1_0= ruleCup ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getResultAccess().getResultKeyword_0());
            		
            // InternalMymix.g:710:3: ( (lv_cup_1_0= ruleCup ) )
            // InternalMymix.g:711:4: (lv_cup_1_0= ruleCup )
            {
            // InternalMymix.g:711:4: (lv_cup_1_0= ruleCup )
            // InternalMymix.g:712:5: lv_cup_1_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getResultAccess().getCupCupParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cup_1_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResultRule());
            					}
            					set(
            						current,
            						"cup",
            						lv_cup_1_0,
            						"org.xtext.example.mydsl.Mymix.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleFilter"
    // InternalMymix.g:733:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalMymix.g:733:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalMymix.g:734:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalMymix.g:740:1: ruleFilter returns [EObject current=null] : ( ( (lv_filter_0_0= 'A' ) ) | ( (lv_filter_1_0= 'B' ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_filter_0_0=null;
        Token lv_filter_1_0=null;


        	enterRule();

        try {
            // InternalMymix.g:746:2: ( ( ( (lv_filter_0_0= 'A' ) ) | ( (lv_filter_1_0= 'B' ) ) ) )
            // InternalMymix.g:747:2: ( ( (lv_filter_0_0= 'A' ) ) | ( (lv_filter_1_0= 'B' ) ) )
            {
            // InternalMymix.g:747:2: ( ( (lv_filter_0_0= 'A' ) ) | ( (lv_filter_1_0= 'B' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMymix.g:748:3: ( (lv_filter_0_0= 'A' ) )
                    {
                    // InternalMymix.g:748:3: ( (lv_filter_0_0= 'A' ) )
                    // InternalMymix.g:749:4: (lv_filter_0_0= 'A' )
                    {
                    // InternalMymix.g:749:4: (lv_filter_0_0= 'A' )
                    // InternalMymix.g:750:5: lv_filter_0_0= 'A'
                    {
                    lv_filter_0_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_filter_0_0, grammarAccess.getFilterAccess().getFilterAKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterRule());
                    					}
                    					setWithLastConsumed(current, "filter", lv_filter_0_0, "A");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMymix.g:763:3: ( (lv_filter_1_0= 'B' ) )
                    {
                    // InternalMymix.g:763:3: ( (lv_filter_1_0= 'B' ) )
                    // InternalMymix.g:764:4: (lv_filter_1_0= 'B' )
                    {
                    // InternalMymix.g:764:4: (lv_filter_1_0= 'B' )
                    // InternalMymix.g:765:5: lv_filter_1_0= 'B'
                    {
                    lv_filter_1_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_filter_1_0, grammarAccess.getFilterAccess().getFilterBKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterRule());
                    					}
                    					setWithLastConsumed(current, "filter", lv_filter_1_0, "B");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleCup"
    // InternalMymix.g:781:1: entryRuleCup returns [EObject current=null] : iv_ruleCup= ruleCup EOF ;
    public final EObject entryRuleCup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCup = null;


        try {
            // InternalMymix.g:781:44: (iv_ruleCup= ruleCup EOF )
            // InternalMymix.g:782:2: iv_ruleCup= ruleCup EOF
            {
             newCompositeNode(grammarAccess.getCupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCup=ruleCup();

            state._fsp--;

             current =iv_ruleCup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCup"


    // $ANTLR start "ruleCup"
    // InternalMymix.g:788:1: ruleCup returns [EObject current=null] : ( (otherlv_0= 'cup' )? ( (lv_cup_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cup_1_0=null;


        	enterRule();

        try {
            // InternalMymix.g:794:2: ( ( (otherlv_0= 'cup' )? ( (lv_cup_1_0= RULE_INT ) ) ) )
            // InternalMymix.g:795:2: ( (otherlv_0= 'cup' )? ( (lv_cup_1_0= RULE_INT ) ) )
            {
            // InternalMymix.g:795:2: ( (otherlv_0= 'cup' )? ( (lv_cup_1_0= RULE_INT ) ) )
            // InternalMymix.g:796:3: (otherlv_0= 'cup' )? ( (lv_cup_1_0= RULE_INT ) )
            {
            // InternalMymix.g:796:3: (otherlv_0= 'cup' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMymix.g:797:4: otherlv_0= 'cup'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getCupAccess().getCupKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMymix.g:802:3: ( (lv_cup_1_0= RULE_INT ) )
            // InternalMymix.g:803:4: (lv_cup_1_0= RULE_INT )
            {
            // InternalMymix.g:803:4: (lv_cup_1_0= RULE_INT )
            // InternalMymix.g:804:5: lv_cup_1_0= RULE_INT
            {
            lv_cup_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_cup_1_0, grammarAccess.getCupAccess().getCupINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cup",
            						lv_cup_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCup"


    // $ANTLR start "entryRuleQuantity"
    // InternalMymix.g:824:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalMymix.g:824:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalMymix.g:825:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalMymix.g:831:1: ruleQuantity returns [EObject current=null] : ( ( (lv_quantity_0_0= RULE_INT ) ) (otherlv_1= 'mL' )? ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_quantity_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMymix.g:837:2: ( ( ( (lv_quantity_0_0= RULE_INT ) ) (otherlv_1= 'mL' )? ) )
            // InternalMymix.g:838:2: ( ( (lv_quantity_0_0= RULE_INT ) ) (otherlv_1= 'mL' )? )
            {
            // InternalMymix.g:838:2: ( ( (lv_quantity_0_0= RULE_INT ) ) (otherlv_1= 'mL' )? )
            // InternalMymix.g:839:3: ( (lv_quantity_0_0= RULE_INT ) ) (otherlv_1= 'mL' )?
            {
            // InternalMymix.g:839:3: ( (lv_quantity_0_0= RULE_INT ) )
            // InternalMymix.g:840:4: (lv_quantity_0_0= RULE_INT )
            {
            // InternalMymix.g:840:4: (lv_quantity_0_0= RULE_INT )
            // InternalMymix.g:841:5: lv_quantity_0_0= RULE_INT
            {
            lv_quantity_0_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_quantity_0_0, grammarAccess.getQuantityAccess().getQuantityINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMymix.g:857:3: (otherlv_1= 'mL' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMymix.g:858:4: otherlv_1= 'mL'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuantityAccess().getMLKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleTime"
    // InternalMymix.g:867:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalMymix.g:867:45: (iv_ruleTime= ruleTime EOF )
            // InternalMymix.g:868:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalMymix.g:874:1: ruleTime returns [EObject current=null] : ( ( (lv_time_0_0= RULE_INT ) ) (otherlv_1= 'sec' )? ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMymix.g:880:2: ( ( ( (lv_time_0_0= RULE_INT ) ) (otherlv_1= 'sec' )? ) )
            // InternalMymix.g:881:2: ( ( (lv_time_0_0= RULE_INT ) ) (otherlv_1= 'sec' )? )
            {
            // InternalMymix.g:881:2: ( ( (lv_time_0_0= RULE_INT ) ) (otherlv_1= 'sec' )? )
            // InternalMymix.g:882:3: ( (lv_time_0_0= RULE_INT ) ) (otherlv_1= 'sec' )?
            {
            // InternalMymix.g:882:3: ( (lv_time_0_0= RULE_INT ) )
            // InternalMymix.g:883:4: (lv_time_0_0= RULE_INT )
            {
            // InternalMymix.g:883:4: (lv_time_0_0= RULE_INT )
            // InternalMymix.g:884:5: lv_time_0_0= RULE_INT
            {
            lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_time_0_0, grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMymix.g:900:3: (otherlv_1= 'sec' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMymix.g:901:4: otherlv_1= 'sec'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getSecKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A1000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001A1000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});

}