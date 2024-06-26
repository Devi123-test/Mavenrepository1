package Janbatch;

import java.util.Scanner;

public class Methodarray {

    void matrixaddition (){

        // Matrix addition program
        int numset1[][] = new int[2][2];
        int numset2[][] = new int[2][2];
        int numset3[][] = new int[2][2];

        int num[] = new int [3]; // 20  30  40;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println("Please enter value for Numbserset1 considering the position:" + (i + 1) + " " + (j + 1));
                numset1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println("Please enter value for Numbserset2 considering the position:" + (i + 1) + " " + (j + 1));
                numset2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The addition of Numberset1 and Numbserset2 is as below: ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                numset3[i][j] = numset1[i][j] + numset2[i][j];
                System.out.print(numset3[i][j]+" ");
//                    System.out.println((numset1[i][j] + numset2[i][j])+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

    Methodarray method = new Methodarray();
    method.matrixaddition();


    }
}
