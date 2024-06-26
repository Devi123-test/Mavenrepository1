package Javatraining;

import java.util.Scanner;

public class Arraymultidimensional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5]; // 40 70 140 170 630
        int num[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Please give the user input for Row" + i + " and coloumn " + j);
                num[i][j] = sc.nextInt();
            }
        }

            System.out.println("Printing the multidimensional array value:");
            for (int m = 0; m < 3; m++) {
                for (int n = 0; n < 3; n++) {
                    System.out.print(num[m][n] + " ");
                }
                System.out.println();
            }
        }
    }

/*
10 20 30
10 11 12
20 21 22
 */
