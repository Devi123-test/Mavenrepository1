package Inheritance;

class Accessmodifiersub extends  Accessmodifiermain {

    public void add1(){
        System.out.println("Addition method result from child: "+(x+y+z));
    }

    void sub1(){
        System.out.println("Subtraction method result child: "+(x-y-z));
    }

    void displaychild(){
        System.out.println("Display method result from child");
    }

    void sub(){
        System.out.println("Sub method running from child: "+(x-y-z));
    }

    public static void main(String[] args) {
        Accessmodifiersub cl1 = new Accessmodifiersub();
        System.out.println(cl1.x);
        System.out.println(cl1.y);
        cl1.add1();
        cl1.sub1();
        cl1.displaychild();
        cl1.display();
    }
}
