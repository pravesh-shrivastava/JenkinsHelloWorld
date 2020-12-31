package SeleniumPractice;

public class MainExecutionClass
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		
		System.out.println("Calling Addition");
		//int iSumResult = calc.getSum(10, 20);
		//System.out.println("Addition is: " +iSumResult);
		System.out.println("Addition is: " +calc.getSum(10, 20));
		
		System.out.println("Calling Subtraction");
		int iSubResult = calc.getSub(20, 10);
		System.out.println("Substraction is: " +iSubResult);
		
		System.out.println("Calling Multiplication");
		int iMulResult = calc.getMul(10, 20);
		System.out.println("Multiplication is: " +iMulResult);
		
		System.out.println("Caling Division");
		int iDivResult = calc.getDiv(20, 10);
		System.out.println("Division is: " +iDivResult);
	}

}
