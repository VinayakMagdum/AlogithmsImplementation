package algorithm.sortingalgorithm.mergesort;

/**
 * Implementation of Merge sort.
 * Complexity is O(nlogn) i.e. logarithmic.
 * Stable sort algorithm
 *
 */
public class MergeSortImplementation {
    public static void main(String[] args) {
        int input[] = {20, 35, -15, 7, 55, 1, -22, 7};

        //Printing elements
        System.out.println("Array elements before sorting...");
        for (int i =0; i < input.length; i++)
            System.out.print(input[i] + ", ");

        System.out.println();

        mergeSortImplementation(input, 0, input.length, true);

        //Printing elements
        System.out.println("Array elements after sorting in ascending order...");
        for (int i =0; i < input.length; i++)
            System.out.print(input[i] + ", ");

        mergeSortImplementation(input, 0, input.length, false);

        System.out.println();

        //Printing elements
        System.out.println("Array elements after sorting in descending...");
        for (int i =0; i < input.length; i++)
            System.out.print(input[i] + ", ");
    }

    private static void mergeSortImplementation(int[] input, int start, int end, boolean printAscending) {
        splitArray(input, start, end, printAscending);
    }

    private static void splitArray(int[] input, int start, int end, boolean printAscending) {

        //to break recursion
        if(end - start < 2) {
            return;
        }

        int mid = (start + end) /2;

        splitArray(input, start, mid, printAscending);
        splitArray(input, mid, end, printAscending);
        if(printAscending) {

            mergeArrayAscending(input, start, mid, end);
        } else {
            mergeArrayDescending(input, start, mid, end);
        }
    }

    private static void mergeArrayAscending(int[] input, int start, int mid, int end) {
        // input[mid-1] is last element in left partition and
        // input[mid] is the first element in the right partition.
        if(input[mid-1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    private static void mergeArrayDescending(int[] input, int start, int mid, int end) {
        // input[mid-1] is last element in left partition and
        // input[mid] is the first element in the right partition.
        if(input[mid-1] >= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
