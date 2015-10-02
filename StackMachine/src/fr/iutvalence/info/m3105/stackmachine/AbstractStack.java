package fr.iutvalence.info.m3105.stackmachine;

public abstract class AbstractStack implements Stack
{

	protected int size;

	public AbstractStack(int size)
	{
		this.size=size;
	}

	@Override
	public int getSize()
	{
		return this.size;
	}
	
	
	

}