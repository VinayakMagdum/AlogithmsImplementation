package algorithm.searchingalgorithm.binarysearchalgorithm;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] array = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeSearch(array, 7));
        System.out.println(iterativeSearch(array, 20));
        System.out.println(iterativeSearch(array, 27));

        System.out.println();

        System.out.println(recursiveSearch(array, 7, 0, array.length));
        System.out.println(recursiveSearch(array, 20, 0, array.length));
        System.out.println(recursiveSearch(array, 27, 0, array.length));

    }

    public static int iterativeSearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midPoint = (start + end)/ 2;
            if(input[midPoint] == value) {
                return midPoint;
            } else  if (input[midPoint] < value) {
                start = midPoint + 1;

            } else {
                end = midPoint;
            }
        }
        return -1;
    }

    public static int recursiveSearch(int[] input, int value, int start, int end) {

        if(start >= end) {
            return -1;
        }

        int midPoint = (start + end ) / 2;
        if(input[midPoint] == value) {
            return midPoint;
        } else  if (input[midPoint] < value) {
            start = midPoint + 1;

        } else {
            end = midPoint;
        }

        return recursiveSearch(input, value, start, end);
    }
}
