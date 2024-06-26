package Javatraining;

public class Operator {


    //Arithmetic Operators:
//+	Addition	Adds together two values	x + y
//-	Subtraction	Subtracts one value from another	x - y
//*	Multiplication	Multiplies two values	x * y
///	Division	Divides one value by another	x / y
//%	Modulus	Returns the division remainder	x % y
//
//++ 	Increment	Increases the value of a variable by 1	++x   (Also called Unary Operator)
//-- 	Decrement	Decreases the value of a variable by 1	--x   (Also called Unary Operator)

//Assignment Operators:
//Operator	Example	Same
//=	        x = 10	x = 10
//+=	    x += 2	x = x + 2

//-=	    x -= 2	x = x - 2
//*=	    x *= 2	x = x * 2
///=      	x /= 2	x = x / 2
//%=      	x %= 2	x = x % 2

//Relational / Comparison Operators:
// ==	Equal to	x == y
//!=	Not equal	x != y
//>	Greater than	x > y  x=
//<	Less than	x < y
//>=	Greater than or equal to	x >= y
//<=	Less than or equal to	x <= y


//Logical operators:
//&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
//|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
//!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

    public static void main(String[] args) {

//        int x = 5;
//        int y = 10;
//        System.out.println("Before increment the value of x is: "+x);
//        System.out.println("Before increment the value of y is: "+y);
//        x = x + 2; //7
//        y +=2; // same as y = y + 2, sum is 12
//        System.out.println("After increment the value of x is: "+x);
//        System.out.println("After increment the value of y is: "+y);
//        System.out.println(x*y); // 7*12 = 84

//        x--; //6
//        y-=2; // same as y = y - 2, sum is 10
//
//        System.out.println("After decrement the value of x is: "+x);
//        System.out.println("After decrement the value of y is: "+y);
//        x++;
//        System.out.println("After increment the value of x is: "+x);
//
//        x *= 2; //14
//        y = y * 2; // same as y = y * 2, sum is 20
//        System.out.println("multiply x with 2 is: "+x);
//        System.out.println("multiply y with 2 is: "+y);
//
//        x /= 2; //7
//        y = y / 2; // same as y = y / 2, sum is 10
//        System.out.println("divide x with 2 is: "+x);
//        System.out.println("divide y with 2 is: "+y);
//
//        x %= 2; //1
//        y = y % 2; // same as y = y % 2, sum is 0
//        System.out.println("modulus x with 2 is: "+x);
//        System.out.println("modulus y with 2 is: "+y);
//

//        int x = 20, y = 30;

//        if (x>=y){
//            System.out.println("x is greater than y");
//        }else {
//            System.out.println("y is greater than x");
//        }

//        x = 15;
//        if (x!=y){
//            System.out.println("x is not equal to y");
//        }else {
//            System.out.println("x is equal to y");
//        }

//        x = y;
//        if ((x==y)){
//            System.out.println("x is equal to y");
//            System.out.println("Printing x value: "+x);
//        }else {
//            System.out.println("x is not equal to y");
//            System.out.println("Printing y value: "+y);
//        }

//        if (x=2){
//            System.out.println("x is equal to 2");
//        }
//        else {
//            System.out.println("x is not equal to 2");
//        }

//        System.out.println("After increment the value of x is: "+x);
//        x--;
//        System.out.println("After decrement the value of x is: "+x);


//        x -= 2;  // decrement x with 2
//        x = x - 2;
//        System.out.println("After decrement the value of x is: " + x );

//        x *= 2;  // multiply x with 2
//        x = x * 2;
//        System.out.println("After multiply the value of x is: "+x);

//             x /= 2;  // divide x with 2
//        x = x / 2;
//        System.out.println("After division the value of x is: "+x);

//          x %= 2;  // modules x with 2
//        x = x % 2;
//        System.out.println("After modules the value of x is: "+ x);

//        x++;
//        System.out.println("x is incremented by default : "+x);

//        x--
//       System.out.println("x is decrement by default : "+x);

        //Arithmetic Operators:
//+	Addition	Adds together two values	x + y
//-	Subtraction	Subtracts one value from another	x - y
//*	Multiplication	Multiplies two values	x * y
///	Division	Divides one value by another	x / y
//%	Modulus	Returns the division remainder	x % y
//
//++	Increment	Increases the value of a variable by 1	++x   (Also called Unary Operator)
//--	Decrement	Decreases the value of a variable by 1	--x   (Also called Unary Operator)
//int x = 10;
//
//        System.out.println(x++);
//        System.out.println(x);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the number: ");
//        int num1 = sc.nextInt();

//
//int x = 11;
//short y = 2;
//long z =  (x%y); //Remainder = 0
//long j = (x/y); //Q = 5
//
//        System.out.println("Value of remainder z is: "+z);
//        System.out.println("Value of quotient j is: "+j);
//
//if (z==0)
//            System.out.println("It's even number");
//else
//        System.out.println("It's odd number");



        //++  --

//int a = 10, b = 15;

//        System.out.println("The value of a before addition: "+  a);
//        System.out.println("The value of b before subtraction: "+b);
//        System.out.println("The value for multiplication: "+ a * b);
//        System.out.println("The value for division: "+ a / b);
//        System.out.println("The value for modulus: "+ a % b);

//        int a = 10;
//        System.out.println("The value of a in first place is: "+ (a++));
//        System.out.println();
////        ++a; // or
//        System.out.println("The value of a in second place is: "+a);
//        a++;
//        System.out.println("Updated value of a is: "+a);

        //  --b;  //or
//        b--;
//
//        a++;
//        b--;
//
//        System.out.println("The value of a after addition: "+a);
//        System.out.println("The valu e of b after subtraction: "+b);

        //Assignment Operators:
//Operator	Example	Same
//=	        x = 10	x = 10
//+=	    x += 2	x = x + 2
//-=	    x -= 2	x = x - 2
//*=	    x *= 2	x = x * 2
///=      	x /= 2	x = x / 2
//%=      	x %= 2	x = x % 2

//        int m = 60 , n = 40;
//            m = m + 5; //or
//         m += 5; // both are same
//            m = m - 5  or m -= 5;
//            m = m * 5  or m *= 5;

//        System.out.println("The value of m is: "+m);

//        m %= 3;
//        System.out.println(m);


        //Relational / Comparison Operators:
// ==	Equal to	x == y
//!=	Not equal	x != y
//>	Greater than	x > y
//<	Less than	x < y
//>=	Greater than or equal to	x >= y
//<=	Less than or equal to	x <= y
//
//        int a = 12, b = 10;
//        System.out.println("The value of a is: "+a + " and the value of b is: "+b);
//
//        if (a == b)
//            System.out.println("a and b are equal");
//        else
//            System.out.println("a and b are not equal");
//
//        if (a != b)
//            System.out.println("a and b are not equal");
//        else
//            System.out.println("a and b are equal");
//
//        if (a > b)
//            System.out.println("a is greater than b");
//        else
//            System.out.println("b is greater than a");
//
//        a = 8;
//
//        if (a < b)
//            System.out.println("a is less than b");
//        else
//            System.out.println("b is less than a");

        int a = 25, b = 15;
//        if(a >= b)
//            System.out.println("a is greater than or equal to b");
//        else
//            System.out.println("b is greater than a");
//
//        if(a <= b)
//            System.out.println("a is less than or equal to b");
//        else
//            System.out.println("b is less than or equal to a");
//
//        if (a==b)
//            System.out.println("a and b are equal");
//        else
//            System.out.println("a and b are not equal");

//        a = b;
//        if (!(a==b))  // (a!=b)
//            System.out.println("a and b are not equal");
//        else
//            System.out.println("a and b are equal");


//        if (!(a>b))
//            System.out.println("a is not greater than b");
//        else
//            System.out.println("b is not greater than a");
//
//        if (a>b)
//            System.out.println("a is greater than b");
//        else
//            System.out.println("b is greater than a");

//        if (a<b)
//            System.out.println("a is smaller than b");
//        else
//            System.out.println("b is smaller than a");

//        int mark = 60;
//
//        if (mark >= 60)
//            System.out.println("Student eligible for promotion");
//        else
//            System.out.println("Student not eligible for promotion");

//        if (mark <= 60)
//            System.out.println("Student need additional coaching");
//        else
//            System.out.println("Student is studying as expected");

//           Logical operators:
//  && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
//  || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
//  !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

//        int a = 5, b = 7, c = 9, d = 12, e = 3;
//        if ((a>b) && (a>c) && (a>d) && (a>e))
//            System.out.println("a is greater");
//            else if ((b>c) && (b>d) && (b>e))
//            System.out.println("b is greater");
//            else if ((c>d) && (c>e))
//            System.out.println("c is greater");
//            else if (d>e)
//            System.out.println("d is greater");
//            else
//            System.out.println("e is greater");
//

//        int academic1mark = 51, academic2mark = 55, academic3mark = 65;
//        if (!(academic3mark <= 55))
//            System.out.println("Student eligible for promotion");
//        else
//            System.out.println("Student not eligible for promotion");

//        if (((academic1mark >=55) || (academic2mark >=55) || (academic3mark >=55)))
//            System.out.println("Student eligible for promotion");
//        else
//            System.out.println("Student not eligible for promotion");


////    ac1 >=60 and ac2 >=60 and ac3 >=60 then Promotion, means all academic marks >=60
//        if ((academic1mark >= 60) && (academic2mark >=60) && (academic3mark >=60))
//            System.out.println("Student eligible for promotion");
//        else
//            System.out.println("Student not eligible for promotion");

//    //      ac1 >=60 or ac2 >=60 or ac3 >=60 then Promotion , means any one of the academic is >=60
//        if ((academic1mark >= 60) || (academic2mark >=60) || (academic3mark >=60))
//            System.out.println("Student eligible for promotion");
//        else
//            System.out.println("Student not eligible for promotion");
//
//        if (((academic1mark >= 60) || (academic2mark >=60)) && (academic3mark >=60))
//            System.out.println("Student eligible for promotion");
//        else
//            System.out.println("Student not eligible for promotion");
//
//        if (!((academic1mark <= 60) && (academic2mark <=60) && (academic3mark <= 60)))
//            System.out.println("Student eligible for promotion");    //  !((academic1mark <= 60) && (academic2mark <=60) && (academic3mark <= 60))
//            else
//            System.out.println("Student not eligible for promotion");

//        ac1 >=60 and either ac2 >=60 or ac3 >=60 then Promotion
//        ac1 >=60;
//
//        ac2 or ac3 >=60

//        int academic1mark = 65, academic2mark = 59, academic3mark = 75;
//
//        if ((academic1mark >= 60) && ((academic2mark >=60) || (academic3mark>=60)))
//            System.out.println("Student eligible for promotion");
//        else
//            System.out.println("Student not eligible for promotion");

//        if ((academic1mark >= 60))
//            System.out.println("Student  eligible for promotion");
//        else
//            System.out.println("Student not eligible for promotion");

//        System.out.println("Below codes are printing using hard coded values:");
//        System.out.println("Addition of 10 and 20 is: "+(10+20));
//        System.out.println("Subtraction of 10 and 20 is: "+(10-20));
//        System.out.println("Multiplication of 10 and 20 is: "+(10*20));
//        System.out.println("Division of 10 and 20 is: "+(20/10));
//        System.out.println("Modulus of 10 and 20 is: "+(20%10));
//
//        int m = 12, n = 25;
//        System.out.println("Below codes are printing using vaiable m and n:");
//        System.out.println("Addition of m and n is: "+(m+n));
//        System.out.println("Subtraction of m and n is: "+(m-n));
//        System.out.println("Multiplication of m and n is: "+(m*n));
//        System.out.println("Division of m and n is: "+(n/m));
//        System.out.println("Modulus of m and n is: "+(n%m));

    }

}
