package jan16.ForLoop;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        for(int i = 1; i<=20; i++){
            int num = sc.nextInt();
            if(num == 6){
                System.out.println("You won 100M Lottery!!!!!!!!");
//                System.out.println("Do you want to continue? Yes/No");
//                String check= sc.nextLine();
//                if(check.equals("yes")){
//                    System.out.println("ifffffff");
//                    continue;
//                }else{
//                    System.out.println("elsseee");
//                    break;
//                }

            }
            else if(num%5==0){
                System.out.println("you won 5 points");
                continue;
            }
            else if(num%7 == 0){
                System.out.println("you won 7 points");
                continue;
            }
        }
    }
}
