package jan27;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 10, 9, 3,2};
        int[] temp = new int[arr.length];
        System.out.print(Arrays.toString(arr));
        System.out.println();
        int i=0;
            for(int j = arr.length - 1; j >= 0; j--){
                temp[i] = arr[j];
                i++;
            }
            System.out.print(Arrays.toString(temp));


    }
}
