package sorting;

import java.util.Arrays;

public class QuickSortPractice {
    public static void sortMethod(int low,int high,int[] nums){
        if(low>=high){return;}
        int start=low;
        int end=high;
        int mid=(start+end)/2;
        int pivot=nums[mid];
        while(start<=end){
            while (nums[start]<pivot){
                start++;
            }
            while (nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        sortMethod(low,end,nums);
        sortMethod(start,high,nums);
    }
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        QuickSortPractice.sortMethod(0,nums.length-1,nums);
        System.out.println(Arrays.toString(nums));
    }
}
