package fr.iutvalence.info.m3105.stackmachine;

public class Instruction
{
	private int[] params;
	private int opCode;

	public Instruction(int in, int[] params)
	{
		this.params=params;
		this.opCode=in;
	}

	public int getOpCode()
	{
		return this.opCode;
	}

	public int[] getParams()
	{
		return this.params;
	}

}
