package jan30.assignments;

public class SumTwoDArray {
    public static void main(String[] args) {
        int[][] array1 = {{54,12,14}, {22,36,40}, {16,24,15}};
        int[][] array2 = {{12,19,40}, {15,13,16}, {13,25,12}};
        int size = array1.length;
        System.out.println("********Array 1********");
        printArray(array1);
        System.out.println("********Array 2********");
        printArray(array2);
        System.out.println("********Sum**********");
        sumArray(array1, array2, size);
    }
    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void sumArray(int[][] array1, int[][] array2, int size){
        int sum[][] = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        printArray(sum);
    }
}
