

public class threadDump
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		sleep();
	}
	
	public static void sleep()
	{
		try
		{
			Thread.sleep(600000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}
