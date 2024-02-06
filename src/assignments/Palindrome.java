package assignments;

public class Palindrome {
    public static void main(String[] args) {

        String str = "malayalam";
        int n = str.length();
        String rev = "";
        for(int i = n - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given String is non palindrome");
        }
    }
}
