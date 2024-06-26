package DAY2SelfPractice_OOPS_ParentChild;

public class Inheritance {
    public static void Parentbirthplace(){
        System.out.println("TamilNadu");
    }
    public static void Country(){
        System.out.println("India");
    }
    public static void Food()
    {
        System.out.println("parotta");
    }
public static void Food(String Fav1){
    System.out.println(Fav1);
}
    public static void main(String[] args) {
        Parentbirthplace();
        Country();
        Food();
        Food("Chicken");
    }
}
