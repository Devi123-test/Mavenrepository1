package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
//		int a = 50 / 0;
//		System.out.println("The value of a is: "+a);
//
//		System.out.println("The program is executed as the line number 6 is valid calculation, if invalid this will be skipped");


		try {
			int b = 50 / 0;
			System.out.println("Try block executed the result for b is: "+ b);
	}
	catch(Exception e)
	{
		System.out.println("The program has error, The catch block is executed and printing the exception message: "+e);
		System.out.println(e);		  //Prints Exception <Error> Message thrown by try Block
       e.printStackTrace();          //Prints <Line number> from where Error is occurring
	}
	finally {
		System.out.println("Finally Block Executed");
	}

		System.out.println("Remaining code is executed line number 1");
		System.out.println("Remaining code is executed line number 2");
		System.out.println("Remaining code is executed line number 3");
		System.out.println("Remaining code is executed line number 4");

	}
}
