import java.util.Arrays;

public class InsertionSort {

    public static int[] selectionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] numList = {5,4,3,1,2};
        int n = numList.length;
        System.out.println("Original array" +Arrays.toString(numList));
        int[] sortedList = selectionSort(numList, n);
        System.out.println("Sorted array" + Arrays.toString(sortedList));
    }
}
