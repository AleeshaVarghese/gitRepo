package assignments;

import java.util.Locale;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Apple";
        str = str.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' ||
               str.charAt(i) == 'e' ||
               str.charAt(i) == 'i' ||
               str.charAt(i) == 'o' ||
               str.charAt(i) == 'u' ){
                vowelCount++;
            }else{
                consonantCount++;
            }
        }
        System.out.println("Vowel counts in given string is : "+vowelCount);
        System.out.println("Consonant counts in given string is : "+consonantCount);
    }

}
