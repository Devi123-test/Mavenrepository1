package DAY2SelfPractice_OOPS_ParentChild;

public class Parent_Encapsulation {
    private String person_name = "Shankar";
    private int age;

    public void get(){
        System.out.println(person_name);
    }
    public int set(int Person_age){
        this.age = Person_age;
        System.out.println(age);
        return age;
    }


    public static void main(String[] args) {
Parent_Encapsulation obj = new Parent_Encapsulation();
obj.get();
obj.set(44);
    }
}