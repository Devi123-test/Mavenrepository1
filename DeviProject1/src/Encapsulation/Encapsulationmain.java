package Encapsulation;

public class Encapsulationmain {

    private String name; // name = "Student1_Name"
    private int mobileno;
    private int a, b;


    void setName(String name){
        System.out.println("Name is assigned to private variable in parent");
        this.name = name;
    }

     String getName(){
        System.out.println("Return value for the name: ");
        return name;
    }

    void setmobile (int mobileno){
        this.mobileno = mobileno;
    }

    int getmobile(){
        System.out.println("Return value for the mobileno: ");
        return mobileno;
    }


    public static void main(String[] args) {

        Encapsulationmain Encapmain = new Encapsulationmain();

        Encapmain.name = "Student1_Name";

        System.out.println(Encapmain.name);

        Encapmain.setmobile(1234567890);
        System.out.println(Encapmain.getmobile());

        Encapmain.a = 10;
        Encapmain.b = 20;
        System.out.println(Encapmain.a + Encapmain.b);



    }

}
