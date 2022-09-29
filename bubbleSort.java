import java.util.Arrays;

public class bubbleSort {

    public static void swap(int[]arr, int xj, int yj) {
        int temp = arr[xj];
        arr[xj] = arr[yj];
        arr[yj] = temp;
    }

    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            // System.out.println("outer loop" + i);
            boolean isSwapped = false;
            for (int j = 0; j < len-1-i; j++) {
                // System.out.println("inner loop" + j);
                if (arr[j] > arr[j+1]) {
                    isSwapped = true;
                    swap(arr, j, j+1);
                }
            }
            if (isSwapped == false) {
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numList = {5,4,3,1,2};
        System.out.println("Original array" +Arrays.toString(numList));
        int[] sortedList = bubbleSort(numList);
        System.out.println("Sorted array" + Arrays.toString(sortedList));
    }
}
