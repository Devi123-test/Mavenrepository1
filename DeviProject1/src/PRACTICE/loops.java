package PRACTICE;

public class loops {
    public static void main(String[] args) {
  /*    int i=0;
        System.out.println("Printing numbers 1-10 using for loop");
        for(i=1;i<=10;i= i+1){
            System.out.print(i + " ");
        }
        System.out.println();
   System.out.println("Printing numbers 1-10 using while loop");
        int j=1;
        while(j<=10){
            System.out.print(j + " ");
            j=j+1;
        }
        System.out.println(); 
      System.out.println("printing numbers 1-10 using do while loop");
        int k=1;
        do{
            System.out.print(k + " ");
            k=k+1;
        }while(k<=10);
        }
*/
        int i = 0;
        System.out.println("Printing even numbers 1-10 using for loop");
        for (i = 0; i <= 10; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Printing odd numbers 1-10 using for loop");
        for (i = 1; i <= 10; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Printing even numbers 1-10 using while loop");
        int j = 0;
        while (j <= 10) {
            System.out.print(j + " ");
            j = j + 2;
        }
        System.out.println();
        System.out.println("Printing odd numbers 1-10 using while loop");
        int j1 = 1;
        while(j1<=10){
            System.out.print(j1 + " ");
            j1 = j1 + 2;
        }
        System.out.println();
        System.out.println("Printing even numbers 1-10 using do while loop");
        int k = 0;
        do {
            System.out.print(k + " ");
            k = k + 2;
        } while (k <= 10);
        System.out.println();
        System.out.println("Printing odd numbers 1-10 using do while loop");
        int k1 = 1;
        do {
            System.out.print(k1 + " ");
            k1 = k1 + 2;
        } while (k1 <= 10);
    }
}

