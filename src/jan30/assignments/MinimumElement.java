package jan30.assignments;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = new int[5];
        MinimumElement min = new MinimumElement();
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Smallest of elements is : "+min.minOfElements(arr));
    }
    public int minOfElements(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
