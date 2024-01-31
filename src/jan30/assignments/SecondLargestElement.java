package jan30.assignments;

public class SecondLargestElement {

    public static void main(String[] args) {
        SecondLargestElement sort = new SecondLargestElement();
        int[] arr = {4, 8, 5, 2, 9};
        int n = arr.length;
        sort.sortElements(arr, n);
        if(n < 2)
            System.out.println("No second largest element is present");
        else
            System.out.println("second largest element is : "+ arr[n - 2]);
    }
    public void sortElements(int[] arr, int n){
        int temp;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
