package Constructor;

public class abcd {

    int a;

    void add(){
        System.out.println(15 + 24 + 86);
    }

     abcd(int a){

        System.out.println("Constructor method abcd is executed");
        this.a=a;
         System.out.println("Printing the value of a: "+a);
    }

    public static void main(String[] args) {
        abcd obj = new abcd(10);
        obj.add();

    }
}
