package jan14;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        if(age>0 && age<13){
            System.out.println("Infant");
        }
        else if(age>=13 && age< 19){
            System.out.println("Teenager");
        }
        else if(age>=19 && age< 60){
             System.out.println("Adult");
        }
        else if(age>=60 && age> 100){
             System.out.println("Senior Citizen");
        }
        else
             System.out.println("Not a human");

    }
}
