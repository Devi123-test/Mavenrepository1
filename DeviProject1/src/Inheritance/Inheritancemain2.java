package Inheritance;

public class Inheritancemain2 extends Class1 {

    int e = 10, f = 20;

//    public void sum(){
//        System.out.println("The program written in child as sum method");
//        System.out.println(e+f);
//    }

//    void mul(){
//        System.out.println("The program written in child as mul method");
//        System.out.println(e*f);
//    }

    void addmethod1(){
        System.out.println("The program written in child as additional1 method");
    }

    void addmethod2(){
        System.out.println("The program written in child as additional2 method");
    }

    public static void main(String[] args) {
        Inheritancemain2 inhm2 = new Inheritancemain2();
        inhm2.addmethod1();
        inhm2.addmethod2();
        inhm2.sum();
        inhm2.mul();
        inhm2.sub();
        inhm2.div();
        inhm2.protectedmethod();
        inhm2.staticmethod();
        System.out.println(inhm2.j + " " + inhm2.k);
//        inhm2.primethod(); // Private is within the class cannot be called outside

    }

}
