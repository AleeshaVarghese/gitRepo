package jan14;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
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

        if(choice == 1){
            System.out.println("Sum of 2 numbers are : " +(x+y));
        }else if(choice == 2){
            System.out.println("Difference of 2 numbers are : " +(x-y));
        }else if(choice == 3){
            System.out.println("product of 2 numbers are : " +(x*y));
        }else if(choice == 4){
            System.out.println("Quotient of 2 numbers are : " +(x/y));
        }else if(choice == 5){
            System.out.println("Reminder of 2 numbers are : " +(x%y));
        }else
            System.out.println("Invalid Selection");
    }
}
