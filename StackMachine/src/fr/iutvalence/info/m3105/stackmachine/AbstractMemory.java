package fr.iutvalence.info.m3105.stackmachine;

public class AbstractMemory implements
{

	protected int startAddress;
	protected int endAddress;

	public AbstractMemory(int startAddress, int endAddress)
	{
		this.startAddress=startAddress;
		this.endAddress=endAddress;
	}

	public int getStartAddress()
	{
		return this.startAddress;
	}

	public void write(int currentAddress, int opCode)
	{
		// TODO Auto-generated method stub
		
	}

}