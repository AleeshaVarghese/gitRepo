package jan14;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Enter the value for num1 :");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("Enter the value for num2 :");
        double num2 = sc.nextDouble();
        System.out.println("Division of two number is :"+ (num1/num2));

    }
}
