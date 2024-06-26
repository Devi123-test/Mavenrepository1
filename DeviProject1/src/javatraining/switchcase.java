package Javatraining;

public class switchcase {
    public static void main(String[] args) {

//        int x = 30;
//        switch (x) {
//            case 10:
//                System.out.println("x is 10");
//                break;
//            case 20:
//                System.out.println("x is 20");
//                break;
//            case 30:
//                System.out.println("x is 30");
//                break;
//            default:
//                System.out.println("x is not 10 or 20");
//        }


//        String semester = "Third";
//
//        switch (semester) {
//            case "First":
//                System.out.println("First semester");
//                break;
//            case "Second":
//                System.out.println("Second semester");
//                break;
//            case "Third":
//                System.out.println("Third semester");
//                break;
//            case "Fourth":
//                System.out.println("Fourth semester");
//                break;
//            default:
//                System.out.println("Invalid semester");
//        }

        String operator = "/";
        int num1 = 10, num2 = 20;
        switch (operator) {
            case "+":
                System.out.println("User selected Addition operation");
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("User selected Subtraction operation");
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("User selected Multiplication ");
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                System.out.println("User selected Division operation");
                System.out.println("Result: " + (num2 / num1));
                break;
            default:
                System.out.println("Invalid operator selected");
        }

    }

}
