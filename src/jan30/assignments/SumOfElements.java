package jan30.assignments;

import java.util.Scanner;

public class SumOfElements {

    public static void main(String[] args) {
        int[] num = new int[5];
        SumOfElements sum = new SumOfElements();
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Sum of elements are : "+sum.sumOfElements(num));
    }
    public int sumOfElements(int[] array){
        int sum = 0;
        for(int arr : array){
            sum += arr;
        }
        return sum;
    }
}
