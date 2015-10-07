package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public abstract class AbstractCPU implements CPU
{

	protected IO ioSystem;
	protected Memory programMemory;
	protected Stack callStack;
	protected Stack expStack;

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.CPU#run()
	 */
	@Override
	public abstract void run();
	
	public abstract void wireToProgramMemory(Memory programMemory);

	public abstract void wireToExpStack(Stack expStack);

	public abstract void wireToCallStack(Stack callStack);

	public abstract void wireToIoSubsystem(IO ioSystem);

	public abstract void clearStacks();

	public abstract void setPC(int address);
}