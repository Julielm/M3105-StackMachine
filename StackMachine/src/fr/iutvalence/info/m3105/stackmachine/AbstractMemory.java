package fr.iutvalence.info.m3105.stackmachine;

public abstract class AbstractMemory implements Memory
{

	protected int startAddress;
	protected int endAddress;

	public AbstractMemory(int startAddress, int endAddress)
	{
		this.startAddress=startAddress;
		this.endAddress=endAddress;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#getStartAddress()
	 */
	@Override
	public int getStartAddress()
	{
		return this.startAddress;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#write(int, int)
	 */
	@Override
	public abstract void write(int currentAddress, int opCode);

	@Override
	public int getEndAddress()
	{
		return this.endAddress;
	}

}