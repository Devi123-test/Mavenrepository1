package DAY2SelfPractice_OOPS_ParentChild;

public class Child1 extends Inheritance{
    public static void Country(){
        //method overriding-polymorphism
        System.out.println("UK");
    }



    public static void main(String[] args) {
        //Encapsulation
        Parent_Encapsulation Obj1 = new Parent_Encapsulation();
        Obj1.get();
        Obj1.set(45);
        //Inheritance
       Parentbirthplace();
       //super, final
        //polymorphism
        Country();// overriding-polymorphism
       Food();
       Food("Mutton");//overloading-polymorphism
        //Abstraction

           }
}
