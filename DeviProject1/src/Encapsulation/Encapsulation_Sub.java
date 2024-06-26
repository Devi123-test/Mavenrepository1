package Encapsulation;

public class Encapsulation_Sub {


    public static void main(String[] args) {
        Encapsulationmain Encap1 = new Encapsulationmain();
//        Encap1.name = "Student1_Name";
//        Encap1.mobileno = 75226644;
//        Encap1.a = 10;
//        Encap1.b = 20;

//        System.out.println(Encap1.name);


        Encap1.setName("Student1_Name");
        String privatename = Encap1.getName();
        System.out.println(Encap1.getName());
        System.out.println("Private variable name: " + privatename);


//         Encap1.setmobile(75226644);
//
//
//        System.out.println(Encap1.getName());
//        System.out.println(Encap1.getmobile());


    }

}
