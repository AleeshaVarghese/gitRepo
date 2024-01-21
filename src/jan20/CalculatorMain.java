package jan20;
import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int con = 0;

        System.out.println("****Welcome to our Calculator");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");

        do{
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            System.out.println("Select wheather do you want to go with 1. Two Number or 2. Three Numbers");
            int dec = sc.nextInt();
            if(dec == 1) {
                System.out.println("Enter the two numbers");
                a = sc.nextInt();
                b = sc.nextInt();
            }
            else if(dec ==2){
                System.out.println("Enter the three numbers");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
            }else{
                System.out.println("Invalid selection! Do you want to continue? 1.yes 2.no");
                con = sc.nextInt();
                continue;
            }
            switch (choice) {
                case 1:
                    if(dec == 1) {
                        System.out.println("Sum of two numbers are : " + cal.sum(a, b));
                    }
                    else if(dec ==2){
                        System.out.println("Sum of three numbers are : " +cal.sum(a, b, c));
                    }
                    break;
                case 2:
                    if(dec == 1) {
                        System.out.println("Difference of two numbers are : " + cal.difference(a, b));
                    }
                    else{
                        System.out.println("Difference of two numbers are : " +cal.difference(a, b, c));
                    }
                    break;
                case 3:
                    if(dec == 1) {
                        System.out.println("product of two numbers are : " +cal.product(a, b));
                    }
                    else{
                        System.out.println("Sum of two numbers are : " +cal.product(a, b, c));
                    }
                    break;
                case 4:
                    if(dec == 1) {
                        System.out.println("product of two numbers are : " +cal.division(a, b));
                    }
                    else{
                        System.out.println("Sum of two numbers are : " +cal.division(a, b, c));
                    }
                    break;
                case 5:
                    if(dec == 1) {
                        System.out.println("product of two numbers are : " +cal.modulus(a, b));
                    }
                    else{
                        System.out.println("Sum of two numbers are : " +cal.modulus(a, b, c));
                    }
                    break;
                default:
                    System.out.println("Invalid Selection");

            }
            System.out.println("Do you want to continue? 1.yes 2.no?");
            con = sc.nextInt();
         }while(con==1);

    }

}
