package PRACTICE;

public class operators {
    public static void main(String []args){
        System.out.println("1.Arithmetic operators");
        int a=100;
        int b=2105;
        System.out.println("addition " + (a+b));
        System.out.println("subtraction " + (b-a));
        System.out.println("multiplication " + (a*b));
        System.out.println("division " + (b/a));
        System.out.println("modulus " + (b%a));
        System.out.println("exponent " + (a*b*b));
        System.out.println("increment " + (++a));
        System.out.println("decrement " + (--b));
                System.out.println(+ (b += 1));
        System.out.println(+ (b -= 2));
        System.out.println(+ (b *= 5));
        System.out.println(+ (b /= 10));
        System.out.println(+ (b %= 20));
        System.out.println("now a = " + (a));
        System.out.println("now b = " + (b));
        System.out.println("check this different output a-- " + (a--));
        System.out.println("check this different output b++ " + (b++));

        System.out.println("2Relational operators");
        System.out.println("now a = " + (a));
        System.out.println("now b = " + (b));
        System.out.println("a is greater than b --" + (a>b));
        System.out.println("a is less than b --" + (a<b));
        System.out.println("a is greater than or equal to b -- " + (a>=b));
        System.out.println("a is less than or equal to b --" + (a<=b));
        System.out.println("a is not equal to b --" + (a!=b));
        System.out.println("a is equal to b -- " + (a==b));
        System.out.println("3.logical operators");
        int i=10; int j=20; int k=30;
        System.out.println("print k if it is greater using && -- " + (k>i && k>j));
        System.out.println("print  i if it is less using || -- " + (k<i || i<j));
        System.out.println("print  k if it is greater using ! -- " + !(k>i && k>j));
    }
}
