package algorithm.searchingalgorithm.linersearch;

public class LinearSearchAlgorithm {

    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30, 35, 40};
        System.out.println(isElementExist(array,20));
        System.out.println(isElementExist(array,22));
        System.out.println(isElementExist(array,30));

    }

    public static boolean isElementExist(int[] input, int num) {
        for(int number : input) {
            if(number == num)
                return true;
        }
        return false;
    }
}
