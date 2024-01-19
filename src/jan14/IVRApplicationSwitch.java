package jan14;

import java.util.Scanner;

public class IVRApplicationSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Welcome to Rogers Customer Service*********");
        System.out.println("Press 1 for English, 2 for French");
        int lang = sc.nextInt();
        switch (lang){
            case 1:
            System.out.println("Select the required service in English");
            System.out.println("1. Mobile");
            System.out.println("2. Internet");
            System.out.println("3. TV");
            int service = sc.nextInt();
            switch (service){
                case 1:
                    System.out.println("welcome to mobile service, Please select required service");
                    System.out.println("1. Tech Support");
                    System.out.println("2. Billing");
                    System.out.println("3. Exit");
                    int mobservice = sc.nextInt();
                    switch (mobservice){
                        case 1:
                            System.out.println("Welcome to Mobile Tech support");
                            break;
                        case 2:
                            System.out.println("welcome to Mobile Billing");
                            break;
                        case 3:
                            System.out.println("you are exiting from the Mobile service");
                            break;
                        default:
                    }
                break;
                case 2:
                    System.out.println("welcome to Internet service, Please select required service");
                    System.out.println("1. Tech Support");
                    System.out.println("2. Billing");
                    System.out.println("3. Exit");
                    int internetService = sc.nextInt();
                    switch (internetService){
                        case 1:
                            System.out.println("Welcome to Internet Tech support");
                            break;
                        case 2:
                            System.out.println("welcome to Internet Billing");
                            break;
                        case 3:
                            System.out.println("you are exiting from the Internet service");
                            break;
                        default:
                    }
                break;
                case 3:
                    System.out.println("welcome to TV service, Please select required service");
                    System.out.println("1. Tech Support");
                    System.out.println("2. Billing");
                    System.out.println("3. Exit");
                    int tvService = sc.nextInt();
                    switch (tvService){
                        case 1:
                            System.out.println("Welcome to TV Tech support");
                            break;
                        case 2:
                            System.out.println("welcome to TV Billing");
                            break;
                        case 3:
                            System.out.println("you are exiting from the TV service");
                            break;
                        default:
                    }
                break;
            }
            break;
            case 2:
                System.out.println("Welcome to french");
                break;
        }
    }
}
