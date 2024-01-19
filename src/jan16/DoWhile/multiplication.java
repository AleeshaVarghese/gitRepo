package jan16.DoWhile;

public class multiplication {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int product;
        do{
            product = (num*i);
            System.out.println(num +" * "+i+" = "+product);
            i++;
        }while(i<=10);

    }
}
