package jan27;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruits you like");
        String[] fruits = new String[5];
        for(int i = 0; i < fruits.length; i++ ){
            fruits[i] = sc.nextLine();
        }
        System.out.println("************Your favourites fruits are***************");
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }
}
