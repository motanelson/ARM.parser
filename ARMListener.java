// Generated from ARM.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ARMParser}.
 */
public interface ARMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ARMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ARMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ARMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MovInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMovInstruction(ARMParser.MovInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MovInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMovInstruction(ARMParser.MovInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAddInstruction(ARMParser.AddInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAddInstruction(ARMParser.AddInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSubInstruction(ARMParser.SubInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSubInstruction(ARMParser.SubInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMulInstruction(ARMParser.MulInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMulInstruction(ARMParser.MulInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCompareInstruction(ARMParser.CompareInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCompareInstruction(ARMParser.CompareInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BranchInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterBranchInstruction(ARMParser.BranchInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BranchInstruction}
	 * labeled alternative in {@link ARMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitBranchInstruction(ARMParser.BranchInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARMParser#movInstr}.
	 * @param ctx the parse tree
	 */
	void enterMovInstr(ARMParser.MovInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#movInstr}.
	 * @param ctx the parse tree
	 */
	void exitMovInstr(ARMParser.MovInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARMParser#addInstr}.
	 * @param ctx the parse tree
	 */
	void enterAddInstr(ARMParser.AddInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#addInstr}.
	 * @param ctx the parse tree
	 */
	void exitAddInstr(ARMParser.AddInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARMParser#subInstr}.
	 * @param ctx the parse tree
	 */
	void enterSubInstr(ARMParser.SubInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#subInstr}.
	 * @param ctx the parse tree
	 */
	void exitSubInstr(ARMParser.SubInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARMParser#mulInstr}.
	 * @param ctx the parse tree
	 */
	void enterMulInstr(ARMParser.MulInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#mulInstr}.
	 * @param ctx the parse tree
	 */
	void exitMulInstr(ARMParser.MulInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARMParser#cmpInstr}.
	 * @param ctx the parse tree
	 */
	void enterCmpInstr(ARMParser.CmpInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#cmpInstr}.
	 * @param ctx the parse tree
	 */
	void exitCmpInstr(ARMParser.CmpInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARMParser#bInstr}.
	 * @param ctx the parse tree
	 */
	void enterBInstr(ARMParser.BInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#bInstr}.
	 * @param ctx the parse tree
	 */
	void exitBInstr(ARMParser.BInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARMParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(ARMParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(ARMParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARMParser#immediate}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(ARMParser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARMParser#immediate}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(ARMParser.ImmediateContext ctx);
}