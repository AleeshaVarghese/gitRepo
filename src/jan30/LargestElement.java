package jan30;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {23, 7, 5, 91,22};
        int big = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > big){
                big = arr[i];
            }
        }
        System.out.println("Largest element "+big);
    }
}
