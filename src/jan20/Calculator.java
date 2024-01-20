package jan20;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator cal =  new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("****Welcome to our Calculator");
        System.out.println("Enter number1 ");
        int x = sc.nextInt();
        System.out.println("Enter number2 ");
        int y = sc.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int sum = cal.sum(x , y);
                System.out.println("Sum of two numbers are : " +sum);
                break;
            case 2:
                int differenece = cal.difference(x , y);
                System.out.println("Difference of two numbers are : " +differenece);
                break;
            case 3:
                int product = cal.product(x , y);
                System.out.println("product of two numbers are : " +product);
                break;
            case 4:
                int quotient = cal.division(x , y);
                System.out.println("Quotient of two numbers are : " +quotient);
                break;
            case 5:
                int modulus = cal.modulus(x , y);
                System.out.println("Reminder of two numbers are : " +modulus);
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
    public int sum(int a, int b){
        return a + b;
    }
    public int difference(int a, int b){
        return a - b;
    }
    public int product(int a, int b){
        return a * b;
    }
    public int division(int a, int b){
        return a / b;
    }
    public int modulus(int a, int b){
        return a % b;
    }
}
