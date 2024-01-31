package jan30.assignments;

import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5},{7, 2, 8}};
        System.out.println("**********Matrix***********");
        for(int[] elements : arr){
            for(int num : elements){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
