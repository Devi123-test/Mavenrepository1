package Janbatch;

public class protectedclass {

    protected int a = 10, b = 20;

    protected void add() {
        System.out.println("Addition of two number from void method is: " + (a + b));
    }

    public static void main(String[] args) {

        protectedclass obj = new protectedclass();
        obj.add();

    }
}
