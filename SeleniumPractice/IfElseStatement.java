package SeleniumPractice;

public class IfElseStatement
{
	public static void main(String[] args)
	{
		int num = (int) (Math.random() * 20);
		System.out.println(num);
		
		if(num <= 10)
		{
			System.out.println("Generated number " +num+ " is less than or equal to 10");
		}
		else if(num > 10 && num <15)
		{
			System.out.println("Generated number " +num+ " is lying between 10 & 15");
		}
		else
		{
			System.out.println("Generated number " +num+ " is greater than 14");
		}
	}
}