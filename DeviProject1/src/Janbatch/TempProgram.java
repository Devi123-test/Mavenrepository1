package Janbatch;

class TempProgram {
    int a = 10, b = 20;
    float mark1 = 65.0f, mark2 = 72.0f, mark3 = 67.0f, mark4 = 70.0f, mark5 = 80.0f;
    void add1(){
        System.out.println("Addition of two number from void method is: " + (a+b));
    }

    float addreturn(){
        System.out.println("Addition of two number from add return method is: ");
        return a+b;
    }

    String sturesult (){
        if (mark1 >60 && mark2 >=60 && mark3 >=60 && mark4 >= 60 && mark5 >= 60){
        return "Student result: Pass";
    } else {
        return "Student result: Fail";
    }

    }


    public static void main(String[] args) {

//        TempProgram obj = new TempProgram();
//        System.out.println(obj.addreturn());
//        System.out.println(obj.sturesult());
//
//        Methods2 met2 = new Methods2();
//        met2.add();
//        met2.sub();
//        met2.mul();
//        met2.add1();
//        System.out.println(met2.addreturn());
//        System.out.println(met2.sturesult());
//        System.out.println(met2.a);
//        System.out.println(met2.b);
//        Statictype.add(60, 70);
//        System.out.println(Statictype.a);
//
//        protectedclass protect1 = new protectedclass();
//        protect1.add();

        Methodoverload methodover = new Methodoverload();
        methodover.add();
        System.out.println(methodover.add(3,6,9));
        methodover.add(12, 25);

//        int Academic1 = 65, Academic2 = 45; // Both Academic1 and 2 are >=60 then promoted
//        if ((Academic1 >= 60) || (Academic2 >=60)){
//            System.out.println("Student promoted");
//        } else
//        {
//            System.out.println("Student not promoted");
//        }

       // 1 t0 10 to print
//        int num = 12;
//        while (num <= 10){
//            System.out.print(num+" ");
////            num = num+1
//                num+=2;
//        }

//        do {
//            System.out.println(num);
//            num+=1;
//        } while (num <=10);

//        for (int i = 1; i <=10; i++){
//            System.out.print(i+" ");
//        }


        /*
        11 12 13
        21 22 23
        31 32 33
         */





    }
}
