import java.util.Arrays;

public class SelectionSort {

    public static void swap(int[]arr, int xj, int yj) {
        int temp = arr[xj];
        arr[xj] = arr[yj];
        arr[yj] = temp;
    }

    public static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, i, min);
            }
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
