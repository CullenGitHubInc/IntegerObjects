import java.util.Arrays;

public class RadixSortTest {
    public static void main(String[] args) {
        // this is the array of integers for sorting in Radix sort
        int[] arr = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};


// this shows the original array as unsorted
        System.out.println("Original Array: " + Arrays.toString(arr));
        // this runs the Radix sort to the array
        RadixSort.radixSort(arr);
// this shows the display for after the Radix sort
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

}



