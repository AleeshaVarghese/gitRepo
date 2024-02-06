package feb03;

import java.util.Scanner;

public class CharArrayUserImput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        char[] ch = new char[10];
        System.out.println("Enter the char elements");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
        System.out.println("*****************");
        for(char c : ch){
            System.out.print(c);
        }

    }



}
