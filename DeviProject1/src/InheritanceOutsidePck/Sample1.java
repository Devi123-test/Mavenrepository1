package InheritanceOutsidePck;

import Inheritance.Class1;

//All default should only access within the package
//If converted to public then accessible outside the package within the project
public class Sample1 {				//Super-Class
	static int c;
	public int addNumbers(int a, int b)
	{
		c = a + b;
		return c;
	}

	protected String sturank(String Studentname){
		return Studentname;
	}
		
	public static void main(String[] args)
	{
		Sample1 obj = new Sample1();
		c = obj.addNumbers(10, 10);
		System.out.println(c);

		Class1 c1 = new Class1();
//		System.out.println(c1.x + " " + c1.y);  // Default cannot be access outside the package
//		c1.sub(); // Default cannot be access outside the package
//		c1.mul(); // Default cannot be access outside the package
		c1.div();
		c1.sum();
//		System.out.println(c1.x + " " + c1.y);
//		System.out.println(c1.j + " " + c1.k);
		System.out.println(c1.a + " " + c1.b);
//		c1.protectedmethod(); // Protected can only access outside the package through child class inheritance
//		System.out.println(c1.j + " " + c1.k); // Protected can only access outside the package through child class inheritance
//		System.out.println(c1.prinum1); // Private is within the class cannot be called outside
//		c1.primethod(); // Private is within the class cannot be called outside

	}
}
