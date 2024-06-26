package Janbatch;

  public class Methods2 {

    // Method has return type and non-return type
    public int a = 10, b=20;
    public void add(){
        System.out.println("Addition of two number from void method is: " + (a+b));

    }

    public void add(int m, int n){
        System.out.println("Addition of two number from parameter: " + (m+n));
    }

    public void add(float x, float y){
        System.out.println(x+y);
    }


   public void sub(){
        System.out.println("Subtraction of two number from void method is:" + (a-b));
    }

    public void mul(){
        System.out.println("Multiplication of two number from void method is:" + (a*b));
    }

//    int addreturn (){
//        System.out.println("Addition of two number from add return method is: ");
//        return a+b;
//    }

//    int a = 10, b = 20;
    float mark1 = 65.0f, mark2 = 72.0f, mark3 = 67.0f, mark4 = 70.0f, mark5 = 80.0f;
   public void add1(){
        System.out.println("Addition of two number from void method is: " + (a+b));
    }

   public float addreturn(){
        System.out.println("Addition of two number from add return method is: ");
        return a+b;
    }

   public String sturesult (){
        if (mark1 >60 && mark2 >=60 && mark3 >=60 && mark4 >= 60 && mark5 >= 60){
            return "Student result: Pass";
        } else {
            return "Student result: Fail";
        }

    }

      public static void main(String[] args) {

      } {

      } {
//        Methods metadd = new Methods();
//        metadd.matrixaddition();

        Methods2 met2 = new Methods2();
        met2.mul();
        met2.add();
        met2.sub();
        met2.add1();
        met2.add(3,9);
        met2.add(2.5f, 7.2f);
        System.out.println(met2.addreturn());
        System.out.println(met2.sturesult());
        System.out.println(met2.a);
        System.out.println(met2.b);



//        System.out.println(met2.addreturn());
      float addresult = met2.addreturn();
        System.out.println(addresult);
        // Multiply with 2 from the output of addition of two number from add method
        System.out.println("Multiplying 2 with add result is:" + addresult*2);

    }

}
