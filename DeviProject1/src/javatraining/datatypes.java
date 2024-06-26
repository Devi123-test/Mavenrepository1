package javatraining;

public class datatypes {
    public static void main(String[] args){
     byte n1;
      n1 = 20;
       int n2 = 30;
      //wrong execution because of different datatypes  System.out.println(n1,n2);
        System.out.println(n1);
        System.out.println(n2);

                byte number1 = 127;					   //1 byte // Java will allocate 1 byte to the variable number1
                short number2 = 32767;				    //2 bytes
                int number3 = 2147483647;				//4 bytes
        long number4 = 1234567891011112344L;    //8 bytes
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
                byte money1 = 127;
        System.out.println(money1);

                String sp = "£$%^^";
        System.out.println(sp);

                String special = "%*^&ssjsfkfsk";
        System.out.println(special);
                byte number111 = 11;
        System.out.println(number111);
                byte number222;
                number222 = 115;
        System.out.println(number222);
                long num34 = 1236812382237324723L;
        System.out.println(num34);
                float num35 = 123.345f;
        System.out.println(num35);
                double num36 = 1233243463.35034;
        System.out.println("check this different output " +num36);
        int m10; //Declare
        int m11 = 20; // Declare and value initialized
        byte  studentmark1 = 67, studentmark2 = 76, studentmark3 = 82, studentmark4 = 25, studentmark5 = 50;
        System.out.println("student2 mark " +studentmark2);
        //     int b = 20;
       int c = 30;

                int a, b = 20;
                a = 10;
                c = 30;
//
  String studentname = "John";
  String invoicenumber = "Inv123394-jul2023";
  System.out.println("total students marks " +(67+76+82+25+50));
//        System.out.println(studentname + " Total marks :" +(studentmark2+studentmark3+studentmark4+studentmark5));
   String x = "Student";
        System.out.println(x);
       String message = "Hi welcomes you to ITH training" ;
        System.out.println(message);
                char sex = 'M';		                  //2 bytes
                char m1 = 1000;
                char m2 = 2078;
        System.out.println("cant print more than 4digits if it is defined as char " + (m1+m2));
       boolean condition = true;	           //1 bit

       System.out.println("Variable int byte: " + number1 );
        System.out.println("Variable short is: " + number2 );
       System.out.println("Variable int is: "+ number3);
        System.out.println("variable long is: "+ number4);
        System.out.println("Variable String is: " + x);

        System.out.println("Printing the message as is: " + message);
        System.out.println("Variable char is: "+ sex);
        System.out.println("Variable boolean is: "+ condition);

//        float f1 = 10000.125f;     // 4 Byte
//        float f2 = (float) 3.0;

//        float f = f1/f2;
//        System.out.println("Print f1 value: " + f1);
//        System.out.println("Print f2 value: " + f2);
//        System.out.println("float f : " + f);
//
//        double d1 = 1000000.000123;    // 8 Byte
//        double d2 = 3.0;
//        double d = d1/d2;
//        System.out.println("double d : "+d);
//
//        float f3 = (float) d;
//        System.out.println("float f3 : "+f3);

//        double d3 = f;
//        double d4 = 2000000.00002345;
//        System.out.println( "double d3 : "+d3);
//        System.out.println("double d4 : "+d4);

            }

        }

