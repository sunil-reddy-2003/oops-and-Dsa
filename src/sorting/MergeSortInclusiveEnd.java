package sorting;

import java.util.Arrays;

public class MergeSortInclusiveEnd {
    static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) return;

        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        mergeArrays(arr, s, mid, e);
    }

    static void mergeArrays(int[] arr, int s, int m, int e) {
        int i = s;
        int j = m + 1;
        int k = 0;
        int[] merged = new int[e - s + 1];

        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i <= m) {
            merged[k++] = arr[i++];
        }

        while (j <= e) {
            merged[k++] = arr[j++];
        }

        // Copy the merged array back to original
        System.arraycopy(merged, 0, arr, s, merged.length);
//        for (int l = 0; l < merged.length; l++) {
//            arr[s + l] = merged[l];
//        }

    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
