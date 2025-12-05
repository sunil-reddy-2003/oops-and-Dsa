
package cognizant;

import java.util.HashSet;

public class CheckifAnyTwoNumbersSumUptoK {
    public static void main(String[] args) {
//        int[] arr={2, 7, 11, 15}; int k = 9;
//        int[] arr={3, 5, 1, 4}; int k = 10;
//        int[] arr={1, 2, 3, 4, 5}; int k = 6;
//        int[] arr={10, -2, 8, 12, 4}; int k = 6;
        int[] arr = {5, 5, 5}; int k = 10;

        System.out.println(checkSum(arr, k));
    }

    private static boolean checkSum(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            int target = k - x;

            if (set.contains(target)) {
                return true;   // Found pair (x, target)
            }

            set.add(x);
        }

        return false;  // No pair found
    }
}
