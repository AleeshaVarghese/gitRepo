package jan30.assignments;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int[] arr = {1, 9, 5, 3, 2, 10};
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
