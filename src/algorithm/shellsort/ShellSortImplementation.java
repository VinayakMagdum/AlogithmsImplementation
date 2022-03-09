package algorithm.shellsort;

/**
 * Implementation of Shell sort.
 * Worst case Complexity is O(n^2) i.e. quadratic.
 * UnStable sort algorithm
 *
 */
public class ShellSortImplementation {
    public static void main(String[] args) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22, 7};

        //Printing elements
        System.out.println("Array elements before sorting...");
        for (int i =0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");

        System.out.println();

        //Sorting elements
        for(int gap = arr.length/2; gap > 0; gap /= 2) {

            for(int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
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
