package Recursion.Sequences;

import java.util.Arrays;

public class NumberOfInversions {
    public static void main(String[] args) {
        int[] nums={5,3,2,1,4};
        System.out.println(merge(nums,0,nums.length-1));
        System.out.println(Arrays.toString(nums));
    }
    static int merge(int[] nums,int low,int high){
        int count=0;
        if(low>=high) return count;
        int mid=(low+high)/2;
        count+=merge(nums,low,mid);
        count+=merge(nums,mid+1,high);
        count+=mergeArrays(nums,low,mid,high);
        return count;
    }
    static int mergeArrays(int[] nums,int start,int mid,int end){
        int count=0;
        int[] merged=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=end){
            if(nums[i]<nums[j]){
                merged[k++]=nums[i];
                i++;
            }else{
                count+=(mid-i+1);
                merged[k++]=nums[j];
                j++;
            }
        }
        while (i<=mid){
                merged[k++]=nums[i];
                i++;
        }
        while (j<=end){
                merged[k++]=nums[j];
                j++;
        }
        for (int p = 0; p < merged.length; p++) {
            nums[start + p] = merged[p];
        }
        return count;
    }
}
