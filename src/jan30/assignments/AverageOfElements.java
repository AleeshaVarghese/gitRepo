package jan30.assignments;

import java.util.Scanner;

public class AverageOfElements {

    public static void main(String[] args) {
        int[] num = new int[5];
        AverageOfElements avg = new AverageOfElements();
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Average of elements : "+avg.avgOfElements(num));
    }
    public int avgOfElements(int[] array){
        int sum = 0, avg = 0;
        for(int arr : array){
            sum += arr;
        }
        avg = (sum / array.length);
        return avg;
    }
}
