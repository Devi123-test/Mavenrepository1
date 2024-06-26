
package PRACTICE;

public class Array {
    public static void main(String[] args) {
        int m1 = 69, m2 = 70, m3 = 71, m4 = 72, m5 = 73;
        System.out.println("Printing marks using direct variables");
        System.out.println("Mark1 is: " + m1);
        System.out.println("Mark2 is: " + m2);
        System.out.println("Mark3 is: " + m3);
        System.out.println("Mark4 is: " + m4);
        System.out.println("Mark5 is: " + m5);
        System.out.println("Total marks :" + (m1 + m2 + m3 + m4 + m5));
        System.out.println();
        int[] marks = {69, 70, 71, 72, 73};
        // method for sum of elements in an array
        int i;
        int sumarrays = 0;
        // Iterate through all elements and add them to sum
        for (i = 0; i < marks.length; i++)
            sumarrays += marks[i];
        System.out.println("Printing marks using array");
        System.out.println("Mark1 is: " + marks[0]);
        System.out.println("Mark2 is: " + marks[1]);
        System.out.println("Mark3 is: " + marks[2]);
        System.out.println("Mark4 is: " + marks[3]);
        System.out.println("Mark5 is: " + marks[4]);
        System.out.println();
        System.out.println("The sum of elements in array is " +sumarrays);


    }
}



