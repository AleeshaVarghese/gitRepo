package jan30.assignments;

public class SecondSmallestElement {

    public static void main(String[] args) {
        SecondSmallestElement sort = new SecondSmallestElement();
        int[] arr = {4, 8, 5, 2, 9};
        int n = arr.length;
        sort.sortElements(arr, n);
        if(n < 2)
            System.out.println("No second largest element is present");
        else
            System.out.println("second largest element is : "+ arr[1]);
    }
    public void sortElements(int[] arr, int n){
        int temp;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
