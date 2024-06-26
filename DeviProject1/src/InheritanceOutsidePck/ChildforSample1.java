package InheritanceOutsidePck;

import Inheritance.Class1;

class ChildforSample1 extends Sample1 { 	  //Sub-Class
	public static void main(String[] args) 
	{
		 	int a = 10;
			int b = 5;
			
//			Accept obj = new Accept();
			ChildforSample1 obj = new ChildforSample1();
			c = obj.addNumbers(a, b);

		Class1 c1 = new Class1();
//		c1.protectedmethod(); // Protected can only access outside the package through child class inheritance

			System.out.println(c);
			}
}
