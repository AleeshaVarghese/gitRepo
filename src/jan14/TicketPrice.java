package jan14;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        String day = sc.nextLine();
        if(day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday")) {
            System.out.println("Ticket price is $10");
        }
        else if(day.equalsIgnoreCase("saturday")) {
            System.out.println("Ticket price is $15");
        }
        else
            System.out.println("ticket rice is $12");
    }

}
