package jan16.While;

public class multiplication {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int product;
        while(i <= 10){
            product = (num*i);
            System.out.println(num +" * "+i+" = "+product);
            i++;
        }
    }
}
