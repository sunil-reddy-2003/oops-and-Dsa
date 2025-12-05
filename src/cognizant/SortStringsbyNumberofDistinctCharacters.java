package cognizant;

import java.util.Arrays;
import java.util.HashSet;

public class SortStringsbyNumberofDistinctCharacters {

    public static void main(String[] args) {
        String[] arr = {"apple", "bat", "aaaa", "code"};

        int n = arr.length;
        int[] counts = new int[n];

        // Step 1: compute distinct count for each string
        for (int i = 0; i < n; i++) {
            counts[i] = distinctCount(arr[i]);
        }

        // Step 2: bubble sort both arrays based on counts[]
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j < n - i; j++) {
                if (counts[j] > counts[j + 1]) {

                    // swap counts
                    int tempCount = counts[j];
                    counts[j] = counts[j + 1];
                    counts[j + 1] = tempCount;

                    // swap strings
                    String tempStr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempStr;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    // Helper to count distinct characters
    private static int distinctCount(String s) {
        HashSet<Character> hashSet=new HashSet<>();
        for (char c : s.toCharArray()) {
            hashSet.add(c);
        }
        return hashSet.size();
    }
}
