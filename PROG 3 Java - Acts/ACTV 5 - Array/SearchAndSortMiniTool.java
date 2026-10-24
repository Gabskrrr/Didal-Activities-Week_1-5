/*
ACT 5-3 :: Search And Sort Mini-Tool
@Author: Carl Didal
*/
import java.util.Arrays;

public class SearchAndSortMiniTool {
    /* Code from GeeksforGeeks.org */
    static int search(int scores[], int n, int searchFor) {
        for (int i = 0; i < n; i++) {
            if (scores[i] == searchFor)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] scores = {67, 78, 56, 90, 89, 76, 99, 100};
        int[] scoresCoffee = {67, 78, 56, 90, 89, 76, 99, 100};
        int n = scores.length;
        int searchFor = 76;

        int index = search(scores, n, searchFor);

        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("---------------------------------------------");
        System.out.println("Finding: " + searchFor);
        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element found at index: " + index);
        }

        Arrays.sort(scoresCoffee);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Sorted copy of Array (scores) " + Arrays.toString(scoresCoffee));
        System.out.println("--------------------------------------------------------------------");
    }
}