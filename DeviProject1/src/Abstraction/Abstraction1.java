package Abstraction;

 abstract class Abstraction1 {

     abstract void abs ();
     abstract void photoverify();
     abstract void addressverify();
     abstract void fileverify();
     void nonabstractmethod(){
         System.out.println("This is nonabstractmethod executed from parent");
     }

     int add(int a, int b){
         int c = a+b;
         System.out.println("Add method is executed from parent and output is: "+c);
         return c;
     }

}
