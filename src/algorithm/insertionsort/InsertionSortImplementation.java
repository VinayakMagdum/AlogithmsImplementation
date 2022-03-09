package algorithm.insertionsort;

/**
 * Implementation of Insertion sort.
 * Complexity is O(n^2) i.e. quadratic.
 * Stable sort algorithm
 *
 */
public class InsertionSortImplementation {
    public static void main(String[] args) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22, 7};

        //Printing elements
        System.out.println("Array elements before sorting...");
        for (int i =0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");

        System.out.println();
        //Sorting elements
        for(int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            int j;
            for(j = i; j > 0 && (arr[j-1] > newElement); j--) {
                    arr[j] = arr[j-1];
            }
            arr[j] = newElement;
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
