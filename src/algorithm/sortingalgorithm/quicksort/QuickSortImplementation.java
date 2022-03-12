package algorithm.sortingalgorithm.quicksort;

/**
 * Implementation of Quick sort.
 * Complexity is O(nlogn) i.e. logarithmic.
 * UnStable sort algorithm
 *
 */
public class QuickSortImplementation {
    public static void main(String[] args) {
        int input[] = {20, 35, -15, 7, 55, 1, -22, 7};

        //Printing elements
        System.out.println("Array elements before sorting...");
        for (int i =0; i < input.length; i++)
            System.out.print(input[i] + ", ");

        System.out.println();

        quickSort(input, 0, input.length);

        //Printing elements
        System.out.println("Array elements after sorting in ascending order...");
        for (int i =0; i < input.length; i++)
            System.out.print(input[i] + ", ");

//        mergeSortImplementation(input, 0, input.length, false);
//
//        System.out.println();
//
//        //Printing elements
//        System.out.println("Array elements after sorting in descending...");
//        for (int i =0; i < input.length; i++)
//            System.out.print(input[i] + ", ");
    }

    private static void quickSort(int[] input, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot  = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            //Note: Empty loop to find j value
            //Continue this loop till you find smaller value in right partition of pivot
            // once you find smaller than pivot then move it to left partition of pivot
            while (i < j && input[--j] >= pivot);

            if(i < j)
                input[i] = input[j];

            //Note: Empty loop to find i value
            //Continue this loop till you find greater value in left partition of pivot
            // once you find greater than pivot then move it to right partition of pivot
            while (i < j && input[++i] <=  pivot);
            if (i < j)
                input[j] = input[i];
        }
        input[j] = pivot;
        return j;
    }
}
