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
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.CPU#wireToProgramMemory(fr.iutvalence.info.m3105.stackmachine.Memory)
	 */
	@Override
	public abstract void wireToProgramMemory(Memory programMemory);

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.CPU#wireToExpStack(fr.iutvalence.info.m3105.stackmachine.Stack)
	 */
	@Override
	public abstract void wireToExpStack(Stack expStack);

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.CPU#wireToCallStack(fr.iutvalence.info.m3105.stackmachine.Stack)
	 */
	@Override
	public abstract void wireToCallStack(Stack callStack);

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.CPU#wireToIoSubsystem(fr.iutvalence.info.m3105.stackmachine.IO)
	 */
	@Override
	public abstract void wireToIoSubsystem(IO ioSystem);

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.CPU#clearStacks()
	 */
	@Override
	public abstract void clearStacks();

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.CPU#setPC(int)
	 */
	@Override
	public abstract void setPC(int address);
}