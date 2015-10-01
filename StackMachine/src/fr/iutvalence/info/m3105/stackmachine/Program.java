package fr.iutvalence.info.m3105.stackmachine;

public class Program {
	
	private int instructionCount;
	private Instruction[] instructions;

	public Program(Instruction[] instructions)
	{
		this.instructions=instructions;
		this.instructionCount=this.instructions.length;
	}

	public int getInstructionCount()
	{
		return this.instructionCount;
	}

	public Instruction getInstructionAt(int instructionNumber)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
