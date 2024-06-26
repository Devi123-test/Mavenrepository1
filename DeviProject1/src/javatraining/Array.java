package javatraining;

public class Array {

    public static void main(String[] args) {
        String student1name = "Sundhar", student2name = "John", student3name = "Rose", student4name = "Alex", student5name = "Tom";
        int Englishmark = 71, Mathsmark = 70, Socialmark = 71, Sciencemark = 72, Biomark = 73;
        float floatnum1 = 20.05f;
        System.out.println("Printing marks using direct variables");
        System.out.println("Mark1 is: " + Englishmark);
        System.out.println("Mark2 is: " + Mathsmark);
        System.out.println("Mark3 is: " + Socialmark);
        System.out.println("Mark4 is: " + Sciencemark);
        System.out.println("Mark5 is: " + Biomark);
        System.out.println("Total marks :" + (Englishmark + Mathsmark + Socialmark + Sciencemark + Biomark));


        int [] totalmarks = {380, 410, 486, 395, 492}; // Out of 500
        String studentname [] = {"Ram", "John", "Rose", "Alex", "Tom"};
        System.out.println("Printing marks using array");
        System.out.println("Mark1 is: " + totalmarks[0]);
        System.out.println("Mark2 is: " + totalmarks[1]);
        System.out.println("Mark3 is: " + totalmarks[2]);
        System.out.println("Mark4 is: " + totalmarks[3]);
        System.out.println("Mark5 is: " + totalmarks[4]);
        for (int i = 0; i < 5; i++){
            System.out.println("Studentname"+(i+1)+" "+studentname[i]+"  Marks: "+totalmarks[i]);
        }


    }
}
