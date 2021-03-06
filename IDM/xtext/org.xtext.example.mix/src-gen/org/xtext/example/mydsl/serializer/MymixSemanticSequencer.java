/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.mymix.Check;
import org.xtext.example.mydsl.mymix.Cup;
import org.xtext.example.mydsl.mymix.Device;
import org.xtext.example.mydsl.mymix.Filter;
import org.xtext.example.mydsl.mymix.MymixPackage;
import org.xtext.example.mydsl.mymix.Procedure;
import org.xtext.example.mydsl.mymix.Put;
import org.xtext.example.mydsl.mymix.PutAll;
import org.xtext.example.mydsl.mymix.PutSome;
import org.xtext.example.mydsl.mymix.Quantity;
import org.xtext.example.mydsl.mymix.Result;
import org.xtext.example.mydsl.mymix.Take;
import org.xtext.example.mydsl.mymix.TakeStuff;
import org.xtext.example.mydsl.mymix.Time;
import org.xtext.example.mydsl.mymix.Wait;
import org.xtext.example.mydsl.services.MymixGrammarAccess;

@SuppressWarnings("all")
public class MymixSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MymixGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MymixPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MymixPackage.CHECK:
				sequence_Check(context, (Check) semanticObject); 
				return; 
			case MymixPackage.CUP:
				sequence_Cup(context, (Cup) semanticObject); 
				return; 
			case MymixPackage.DEVICE:
				sequence_Device(context, (Device) semanticObject); 
				return; 
			case MymixPackage.FILTER:
				sequence_Filter(context, (Filter) semanticObject); 
				return; 
			case MymixPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case MymixPackage.PUT:
				sequence_Put(context, (Put) semanticObject); 
				return; 
			case MymixPackage.PUT_ALL:
				sequence_PutAll(context, (PutAll) semanticObject); 
				return; 
			case MymixPackage.PUT_SOME:
				sequence_PutSome(context, (PutSome) semanticObject); 
				return; 
			case MymixPackage.QUANTITY:
				sequence_Quantity(context, (Quantity) semanticObject); 
				return; 
			case MymixPackage.RESULT:
				sequence_Result(context, (Result) semanticObject); 
				return; 
			case MymixPackage.TAKE:
				sequence_Take(context, (Take) semanticObject); 
				return; 
			case MymixPackage.TAKE_STUFF:
				sequence_TakeStuff(context, (TakeStuff) semanticObject); 
				return; 
			case MymixPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case MymixPackage.WAIT:
				sequence_Wait(context, (Wait) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Operation returns Check
	 *     Check returns Check
	 *
	 * Constraint:
	 *     (cup=Cup quantity=Quantity?)
	 */
	protected void sequence_Check(ISerializationContext context, Check semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cup returns Cup
	 *
	 * Constraint:
	 *     cup=INT
	 */
	protected void sequence_Cup(ISerializationContext context, Cup semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MymixPackage.Literals.CUP__CUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MymixPackage.Literals.CUP__CUP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCupAccess().getCupINTTerminalRuleCall_1_0(), semanticObject.getCup());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Device returns Device
	 *
	 * Constraint:
	 *     procedures+=Procedure+
	 */
	protected void sequence_Device(ISerializationContext context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns Filter
	 *
	 * Constraint:
	 *     (filter='A' | filter='B')
	 */
	protected void sequence_Filter(ISerializationContext context, Filter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Procedure returns Procedure
	 *
	 * Constraint:
	 *     (name=ID body+=Operation+ result=Result)
	 */
	protected void sequence_Procedure(ISerializationContext context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PutAll returns PutAll
	 *
	 * Constraint:
	 *     cup=Cup
	 */
	protected void sequence_PutAll(ISerializationContext context, PutAll semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MymixPackage.Literals.PUT_ALL__CUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MymixPackage.Literals.PUT_ALL__CUP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPutAllAccess().getCupCupParserRuleCall_1_0(), semanticObject.getCup());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PutSome returns PutSome
	 *
	 * Constraint:
	 *     (wait+=Wait? put+=Put)+
	 */
	protected void sequence_PutSome(ISerializationContext context, PutSome semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Put returns Put
	 *
	 * Constraint:
	 *     (quantity=Quantity cup=Cup filter=Filter?)
	 */
	protected void sequence_Put(ISerializationContext context, Put semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Quantity returns Quantity
	 *
	 * Constraint:
	 *     quantity=INT
	 */
	protected void sequence_Quantity(ISerializationContext context, Quantity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MymixPackage.Literals.QUANTITY__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MymixPackage.Literals.QUANTITY__QUANTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQuantityAccess().getQuantityINTTerminalRuleCall_0_0(), semanticObject.getQuantity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Result returns Result
	 *
	 * Constraint:
	 *     cup=Cup
	 */
	protected void sequence_Result(ISerializationContext context, Result semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MymixPackage.Literals.RESULT__CUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MymixPackage.Literals.RESULT__CUP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResultAccess().getCupCupParserRuleCall_1_0(), semanticObject.getCup());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns TakeStuff
	 *     TakeStuff returns TakeStuff
	 *
	 * Constraint:
	 *     (op=Take (body=PutSome | body=PutAll))
	 */
	protected void sequence_TakeStuff(ISerializationContext context, TakeStuff semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Take returns Take
	 *
	 * Constraint:
	 *     (quantity=Quantity cup=Cup filter=Filter?)
	 */
	protected void sequence_Take(ISerializationContext context, Take semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Time returns Time
	 *
	 * Constraint:
	 *     time=INT
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MymixPackage.Literals.TIME__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MymixPackage.Literals.TIME__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Wait
	 *     Wait returns Wait
	 *
	 * Constraint:
	 *     time=Time
	 */
	protected void sequence_Wait(ISerializationContext context, Wait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MymixPackage.Literals.WAIT__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MymixPackage.Literals.WAIT__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWaitAccess().getTimeTimeParserRuleCall_1_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
}
