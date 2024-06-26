package ExceptionHandling;

import java.util.Scanner;

public class Throw1 {
	void sampleMethod(int a) throws Exception
	{
		if (a > 0)
			System.out.println("Positive  : " + a);
		else
//			throw new Exception("Customized error message to display");
			System.out.println("User entered negative number");
		   throw new Exception("Negative Number");

	}

	void numcheck(int num) throws Exception {
		if (num <18) {
			throw new Exception("Number must be grater than eighteen");
		}
		else {
			System.out.println("Given number is valid, greater than eighteen: "+num);
		}
	}

	void numcheck1 (int num){
		if (num < 0)
		{
			System.out.println("Given number is negative");
		} else
		{
			System.out.println("Given number is positive");
		}
	}

	public static void main(String []args)
	{
		Throw1 obj = new Throw1();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter value for a to check negative number: ");
			int a = sc.nextInt();
			obj.sampleMethod(a);
			System.out.println("Enter value for num to check age: ");
			int num = sc.nextInt();
			obj.numcheck(num);
//			obj.numcheck(32);
			obj.sampleMethod(-10);

		}
		catch(Exception e)
		{
			System.out.println("Error thrown is: " +e);
		}
	}
}
