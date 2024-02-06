package feb03;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String str = "pragra";
        char[] ch = str.toCharArray();
        int n = str.length();
        for(int i = n - 1; i >= 0 ; i--){
            System.out.print(ch[i]);
        }



        System.out.println();
        System.out.println("**********************");
        String s1 = "Aleesha varghese";
        int m = s1.length();
        for(int i = m - 1; i >= 0 ; i--){
            System.out.print(s1.charAt(i));
        }

        System.out.println();
        System.out.println("**********************");
        String s2 = "Solomon";
        char[] ch1 = s2.toCharArray();
        char[] temp = new char[ch1.length];
        int j = 0;
        for (int i = ch1.length - 1; i >=0 ; i--) {
            temp[j] = ch1[i];
            j++;
        }
        System.out.println(temp);
    }


}
