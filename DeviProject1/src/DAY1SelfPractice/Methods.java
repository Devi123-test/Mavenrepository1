package DAY1SelfPractice;

public class Methods {
    int a = 5, b = 5;
    public static void main(String[] args) {
    Methods Obj = new Methods();
    Obj.add();
    Obj.subtract();
    Obj.multiply();
    Obj.division();
    Obj.addition(21,12);
    sub(12.3f,2.1f);

    }
        void add()
        {
            System.out.println(a+b);
        }
        int subtract()
        {
            System.out.println(a-b);;
            return (a-b);
        }
        int multiply()
        {
            System.out.println(a*b);;
            return (a*b);
        }
        void division()
        {
            float div = (float) a / b;
            System.out.println(div);
        }

        void addition(int x, int y){
            System.out.println(x+y);
        }
        static void sub(float i, float j)
        {
            System.out.println("subtraction"+(i-j));
        }

}