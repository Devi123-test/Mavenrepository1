package DAY1SelfPractice;

public class Typecasting {
    public static void main(String[] args) {
            //Widening Casting (automatically) - converting a smaller type to a larger type size
            //byte -> short -> char -> int -> long -> float -> double
            int i = 99;
            double d = i;
            System.out.println("Print d " +d);
            //Narrowing Casting (manually) - converting a larger type to a smaller size type
            //double -> float -> long -> int -> char -> short -> byte
        double D = 99.5;
            int j = (int) D;
        System.out.println(D);
            System.out.println("Print j "+j);
            float n1= 100.678f;
            int n2 = (int) n1;
            System.out.println("Print n2 "+n1);
            //String to other data types
        String S = "12";
        Byte N1 = Byte.parseByte(S);
        Short N2 = Short.parseShort(S);
        int N3 = Integer.parseInt(S);
        long N4 = Long.parseLong(S);
        float N5 = Float.parseFloat(S);
        double N6 = Double.parseDouble(S);
        System.out.println("printing converted numbers " +N1+" "+N2+" "+N3+" "+N4+" "+N5+" "+N6);
        //PRIMITIVE TO STRING
        int N7 = 24;
        double N8 = 75.99;
        System.out.println(N7+N8);
        System.out.println("conversion to string: " + String.valueOf(N7) + String.valueOf(N8));
        String n9 = "true";
        boolean n10 = Boolean.parseBoolean(n9);
        System.out.println(n10);

    }

}
