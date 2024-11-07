import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    // this finds the max value in an integer array
    private static int getMax(int[] arr) {
        int max = arr[0];

        for (int num : arr) {

            if (num > max) {
                max = num;


            }
        }
        return max;
    }

    // this is the counting sort function using exp to show the digit
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // Range for decimal digits (0 to 9)

        // counting the digits

        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // this shows the counting sort algorithm within the countingSort method of Radix sort. count[i]
        // is updated so we have the position of this digit
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // output array to arr[]
        System.arraycopy(output, 0, arr, 0, n);
    }

    // this is where we use radix sort as the main function
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // here is a loop that is part of a radix sort algorithm which will sort the array as to each digit place,
        // beginning from the least significant digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);


        }
    }

}


