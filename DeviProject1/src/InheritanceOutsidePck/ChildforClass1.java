package InheritanceOutsidePck;

import Inheritance.Class1;

class ChildforClass1 extends Class1  {          //Non Sub-Class
	public static void main(String[] args) 
	{

//		Class1 cl1 = new Class1();
		ChildforClass1 cl1 = new ChildforClass1();
//		Class1 cl1 = new Class1();

		//Variables
		System.out.println("Public variable a: "+cl1.a);
		System.out.println("Public variable b: "+cl1.b);
//		System.out.println("Default variable x: \""+cl1.x); // default in parent
//		System.out.println("Default variable y: \""+cl1.y); //default in parent
//        System.out.println("Private variable: "+cl1.prinum1); // Private is within the class cannot be called outside
		System.out.println("Final variable: "+cl1.finnum2);
		System.out.println(cl1.m); // static variable accessing through object
		System.out.println(Class1.m); // static variable accessing through referring the class
		System.out.println(cl1.j + " " + cl1.k);
		System.out.println(cl1.j+" "+cl1.k);

		//Methods
//        cl1.primethod(); // Private is within the class cannot be called outside
		cl1.staticmethod();
		Class1.staticmethod();
		cl1.protectedmethod(); // protected can access outside the package through child class inheritance
		System.out.println(cl1.j + " " + cl1.k); // protected can access outside the package through child class inheritance

		//Sum Default method
		cl1.sum();
//		cl1.sub();  // Default cannot be access outside the package
//		cl1.mul();  // Default cannot be access outside the package
		cl1.div();
//		cl1.primethod(); // Private is within the class cannot be called outside



//	 	int a = 10;
//		int b = 20;
//		int c;
////		Accept obj = new Accept();
////		c = obj.addNumbers(a, b);
////		System.out.println(c);
//
//	Accessmodifiermain acm1 = new Accessmodifiermain();
//	acm1.add1();
//	System.out.println(acm1.x);



	}
}
