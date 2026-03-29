package recursion.Sequences;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        boolean[] freq=new boolean[arr.length];
//        permutations(arr,freq,new ArrayList<>());
        List<List<Integer>> ans = new ArrayList<>();
        swapPermutations(0,arr,ans);
        System.out.println(ans);
    }
    private static void swapPermutations(int index,int[] arr,List<List<Integer>> ans){
        if(index==arr.length){
            List<Integer> list=new ArrayList<>();
            for (int j : arr) {
                list.add(j);
            }
            ans.add(list);
        }
        for (int i = index; i < arr.length; i++) {
            swap(i,index,arr);
            swapPermutations(index+1,arr,ans);
            swap(i,index,arr);
        }
    }
    static void swap(int i, int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void permutations(int[] arr, boolean[] freq, ArrayList<Integer> list) {
        if(list.size()==3){
            System.out.println(list);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!freq[i]){
                list.add(arr[i]);
                freq[i]=true;
                permutations(arr,freq,list);
                list.remove(list.size()-1);
                freq[i]=false;
            }
        }
    }

}
