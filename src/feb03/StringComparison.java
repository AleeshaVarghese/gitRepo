package feb03;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "phone";
        String s2 = "phone";
        String s3 = new String("phone");
        String s4 = "phone";
        s1 = "test";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s4));
        System.out.println(30+13+s1+10+20);
        System.out.println(s1+10+20);
    }
}
