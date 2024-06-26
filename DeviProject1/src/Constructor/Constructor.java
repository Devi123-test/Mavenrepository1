package Constructor;/*
*  A constructor in Java is a special method that is used to initialize objects.
*  The constructor is called when an object of a class is created.
*  It has the same name as that of the class and doesn't have a return type.
* There are two types of constructors parameterized constructors and no-arg constructors.
* */

public class Constructor {


    //Class and method name should be same
    String stuname;   // Declare

    public void display(){

//        System.out.println(stuname);
        System.out.println("Display method is executed");
    }

  public Constructor(){

//        this.stuname=stuname; // Parametrisation/ Initialization
        System.out.println("Constructor.Constructor Method executed");

    }



//   public ConstructorDemo(){
//        this.stuname=stuname; // example Webdriver driver = new chromedriver(); without passing arguments
//    }


    public static void main(String[] args) {
        Constructor c=new Constructor();

        abcd obj = new abcd(10);
        c.display();

//        ConstructorDemo c1 = new ConstructorDemo();
//        c.display();
    }
}
