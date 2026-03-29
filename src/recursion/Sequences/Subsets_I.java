package recursion.Sequences;

import java.util.ArrayList;
import java.util.List;

public class Subsets_I {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = new ArrayList<>();
        all(0,arr,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    static void all(int index, int[] arr,ArrayList<Integer> list,List<List<Integer>> ans ){
//        System.out.println(list);
        ans.add(new ArrayList<>(list));
        for (int i = index; i < arr.length ; i++) {
            if (i!=index && arr[i]==arr[i-1]) continue;
            list.add(arr[i]);
            all(i+1,arr,list,ans);
            list.remove(list.size()-1);
        }
    }
}
