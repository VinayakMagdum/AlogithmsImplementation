package algorithm.sortingalgorithm.countingsort;

/**
 * Implementation of Counting sort.
 * Complexity is O(n^2) i.e. quadratic.
 * Stable sort algorithm
 *
 */
public class CountingSortImplementation {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        //Printing elements
        System.out.println("Array elements before sorting...");
        for (int i =0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");

        System.out.println();

        countingSort(arr, 1, 10);

        //Printing elements
        System.out.println("Array elements after sorting...");
        for (int i =0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }
        int j =0;
         for (int i = min; i <= max; i++) {
             while (countArray[i - min] > 0) {
                 input[j++] = i;
                 countArray[i -min]--;
             }
         }
    }
}
