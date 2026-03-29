
package recursion.Sequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSum_II {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        //1 1 2 5 6 7 10
        int k = 8;
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        all(0,candidates,k,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    static void all(int index,int[] arr,int target,ArrayList<Integer> list,List<List<Integer>> ans){

        if(target==0){
            ans.add(new ArrayList<>(list));
//            System.out.println(list);
        }

        for (int i = index; i < arr.length; i++) {
            if(i>index && arr[i]==arr[i-1]) continue;

            if(arr[i]>target) break;
            list.add(arr[i]);
            all(i+1,arr,target-arr[i],list,ans);
            list.remove(list.size()-1);

        }

    }

}
