package javatraining;

import java.util.Scanner;

public class Conditional2 {

    public static void main(String[] args) {

//     String   studentname = "Rose";
////     int age = 32;
//     int age;
//     age = 42;
//     System.out.println("Student Name: "+ studentname + "  Age: " +age);

     //  Test12345£$&%^£*
     String name;
     int marks[] = new int[5];

     byte number1;
     short number2;
     int number3;
     long number4;
     float number5;
     double number6;
     char sex;
     boolean status;

//     Scanner sc = new Scanner(System.in);
//     System.out.println("Please enter student name: ");
//     String stuname1 = sc.next();
////     System.out.println("Please enter student age: ");
////     int stuage1 = sc.nextInt();
//     System.out.println("Please enter sudent total marks: ");
//     float totalmarks = sc.nextFloat();
////     System.out.println("Student Name: "+ stuname1 + "  Student Age: "+ stuage1 + "  Student height: "+     stuheight);
//totalmarks = 450;
//
//if (totalmarks >= 450) {
//    System.out.println("Grade Outstanding");
//} else if (totalmarks >= 400) {
//    System.out.println("Grade Very Good");
//} else if (totalmarks >= 350) {
//    System.out.println("Grade Good");
//} else if (totalmarks >= 300) {
//    System.out.println("Grade Average");
//} else {
//    System.out.println("Student need to improve");
//}

//int a =  30, b = 20;
//if (a > b) {
//    System.out.println("a is greater than b");
//} else {
//    System.out.println("b is greater than a");
//}

/*
if
if else
if else if
if else if else
Nested if
 */

     int personage = 21;
     int personweight = 60;
     String personlocation = "Baker Street";

//     if ((personage >= 20) && (personweight >= 60) && (personlocation == "Green Street")) {
//         System.out.println("Eligible for blood donation");
//     } else {
//         System.out.println("Not eligible for blood donation");
//     }

//     if(personage >= 20){
//         if(personweight >= 60){
//             if(personlocation == "Green Street"){
//                 System.out.println("Eligible for blood donation");
//             } else {
//                 System.out.println("Not eligible for blood donation based on location");
//             }
//         } else {
//             System.out.println("Not eligible for blood donation based on weight");
//         }
//
//     } else {
//         System.out.println("Not eligible for blood donation based on age");
//     }

        int x = 10, y = 20, z = 30;
        if (x > y) {
            if (x > z) {
                System.out.println("x is greater");
            }

        } else {
            if (y > z) {
                System.out.println("y is greater");
            } else {
                System.out.println("z is greater");
            }
        }


    }

}
