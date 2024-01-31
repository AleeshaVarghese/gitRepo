package jan30.assignments;

import java.util.Arrays;

public class TwoDCharArray {
    public static void main(String[] args) {
        char[][] arr = {{'a', 'b', 'c'},{'d', 'e', 'f'},{'g', 'h', 'i'}};
        System.out.println("******Character Matrix********");
        for(char[] ch : arr){
            for(char elements : ch){
                System.out.print(elements+" ");
            }
            System.out.println();
        }
    }
}
