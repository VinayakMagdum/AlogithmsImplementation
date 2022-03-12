package algorithm.sortingalgorithm.selectionsort;

/**
 * Implementation of Selection sort.
 * Complexity is O(n^2) i.e. quadratic.
 * Unstable sort algorithm
 *
 */
public class SelectionSortImplementation {
    public static void main(String[] args) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22, 7};

        //Printing elements
        System.out.println("Array elements before sorting...");
        for (int i =0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");

        System.out.println();

        //Sorting elements
        for(int i = 0; i < arr.length -1; i++) {
            int largeNum = 0;
            for(int j = 1; j < (arr.length - i); j++) {
                if(arr[j] > arr[largeNum]) {
                    largeNum = j;
                }
            }
            swap(arr, largeNum, ((arr.length -1) - i));
        }

        //Printing elements
        System.out.println("Array elements after sorting...");
        for (int i =0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
    }

    /**
     * Swapping Elements
     *
     * @param arr   Array
     * @param i     First Index
     * @param j     Second Index
     */
    public static void swap(int[] arr, int i, int j) {
        if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
