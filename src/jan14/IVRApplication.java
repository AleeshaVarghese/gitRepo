package jan14;

import java.util.Scanner;

public class IVRApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Welcome to Rogers Customer Service*********");
        System.out.println("Press 1 for English, 2 for French");
        int lang = sc.nextInt();
        if(lang == 1){
            System.out.println("Select the required service in English");
            System.out.println("1. Mobile");
            System.out.println("2. Internet");
            System.out.println("3. TV");
            int service = sc.nextInt();
            if(service == 1){
                System.out.println("Enter the required Mobile service");
                System.out.println("1. Tech Support");
                System.out.println("2. Billing");
                System.out.println("3. Exit");
                int mobservice = sc.nextInt();
                if(mobservice == 1)
                    System.out.println("Welcome to Mobile Tech support");
                else if (mobservice==2)
                    System.out.println("welcome to Mobile Billing");
                else
                    System.out.println("you are exiting from the Mobile service");
            }else if(service==2){
                System.out.println("Enter the required Internet service");
                System.out.println("1. Tech Support");
                System.out.println("2. Billing");
                System.out.println("3. Exit");
                int internetService = sc.nextInt();
                if(internetService == 1)
                    System.out.println("Welcome to Internet Tech support");
                else if (internetService==2)
                    System.out.println("welcome to Internet Billing");
                else
                    System.out.println("you are exiting from the Internet service");
            }else{
                System.out.println("Enter the required TV service");
                System.out.println("1. Tech Support");
                System.out.println("2. Billing");
                System.out.println("3. Exit");
                int tvService = sc.nextInt();
                if(tvService == 1)
                    System.out.println("Welcome to TV Tech support");
                else if (tvService==2)
                    System.out.println("welcome to TV Billing");
                else
                    System.out.println("you are exiting from the TV service");
            }
        }else{
            System.out.println("Select the required service in French");
            System.out.println("1. Mobile");
            System.out.println("2. Internet");
            System.out.println("3. TV");
            int ser = sc.nextInt();
            if(ser == 1){
                System.out.println("Enter the required Mobile service");
                System.out.println("1. Tech Support");
                System.out.println("2. Billing");
                System.out.println("3. Exit");
                int mobservice = sc.nextInt();
                if(mobservice == 1)
                    System.out.println("Welcome to Mobile Tech support");
                else if (mobservice==2)
                    System.out.println("welcome to Mobile Billing");
                else
                    System.out.println("you are exiting from the Mobile service");
            }else if(ser==2){
                System.out.println("Enter the required Internet service");
                System.out.println("1. Tech Support");
                System.out.println("2. Billing");
                System.out.println("3. Exit");
                int internetService = sc.nextInt();
                if(internetService == 1)
                    System.out.println("Welcome to Internet Tech support");
                else if (internetService==2)
                    System.out.println("welcome to Internet Billing");
                else
                    System.out.println("you are exiting from the Internet service");
            }else{
                System.out.println("Enter the required TV service");
                System.out.println("1. Tech Support");
                System.out.println("2. Billing");
                System.out.println("3. Exit");
                int tvService = sc.nextInt();
                if(tvService == 1)
                    System.out.println("Welcome to TV Tech support");
                else if (tvService==2)
                    System.out.println("welcome to TV Billing");
                else
                    System.out.println("you are exiting from the TV service");
            }
        }
    }
}
