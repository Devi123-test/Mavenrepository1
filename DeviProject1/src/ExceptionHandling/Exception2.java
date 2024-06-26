package ExceptionHandling;

public class Exception2 {

	public static void main(String[] args) throws Exception {

		int b[] = new int[5];    // 0 1 2 3 4
        	b[6] = 30;
			System.out.println("Value of b array index[4] is " +b[4]);

//		try {
//			int b[] = new int[5];    // 0 1 2 3 4
//        	b[5] = 30;
//			System.out.println("Value of b array index[4] is " +b[4]);
//		}
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e);
//			System.out.println("Trying to store value out of boundary index");
//		}


	}
}
