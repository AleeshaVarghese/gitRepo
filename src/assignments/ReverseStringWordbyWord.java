package assignments;

import java.util.Arrays;

public class ReverseStringWordbyWord {
    public static void main(String[] args) {
        String str = "Java Programming is Fun";
        String[] temp = str.split(" ");
        String rev = "";
        for(int i = temp.length - 1; i >= 0; i--){
            rev += temp[i] + " ";
        }
        System.out.println("reverse string is "+rev);
    }
}
