package jan16.While;

public class factorial {
    public static void main(String[] args) {
        int num = 5;
        int value = num;
        int product = 1;
        while(num>0){
            product *=num;
            num--;
        }
        System.out.println("Factorial of "+value+" is "+product);
    }

}
