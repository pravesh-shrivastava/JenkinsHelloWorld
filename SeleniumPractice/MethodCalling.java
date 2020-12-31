package SeleniumPractice;

public class MethodCalling
{
	public static void main(String[] args)
	{
		MethodCalling objMethodCalling = new MethodCalling();
		
		objMethodCalling.go();
		objMethodCalling.go1();
		objMethodCalling.go2();
		objMethodCalling.go3();
		
		go3();
	}
	
	public void go()
	{
		System.out.println("Inside go method");
	}
	
	public void go1()
	{
		System.out.println("Inside go1 method");
	}
	
	public void go2()
	{
		System.out.println("Inside go2 method");
	}
	
	public static void go3()
	{
		System.out.println("Inside go3 method");
	}

}
