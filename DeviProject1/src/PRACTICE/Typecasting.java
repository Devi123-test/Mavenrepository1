package PRACTICE;

import static java.lang.Integer.parseInt;

public class Typecasting {
    public static void main(String[] args) {
        // Converting one Data type to another Data type- upcasting, downcasting
  //      upcasting- converting lower data type to higher data type
        // Converting int to double
        /*int i = 10;
        double d = i;
        System.out.println("Converting int to double: " + d);*/

/* downcasting- converting higher data type to lower data type
//Converting double to int is not possible as it is possible loss of data but there is a option of rounding up using (int)

        double myDouble = 3.75; // Example double value
        int myInt = (int) Math.round(myDouble); // Round the double and cast it to int

        System.out.println("Original double: " + myDouble);
        System.out.println("Converted int: " + myInt);
        */
 /*Converting char to int will return only unicode value
        char c = 'A';
        int c1 = (int) c;
        System.out.println(c);
        System.out.println("Converting char to int: " + c1);*/
        //Converting int to char
        int i2 = 65;
        char c2 = (char) i2;
        // Parseint is used to convert String to integer, For example, if you have a string "123", you can use Integer.parseInt("123") to convert it to the integer 123.
        String str = "123";
int num = Integer.parseInt(str);
System.out.println(num); // Output: 123

    }
}
