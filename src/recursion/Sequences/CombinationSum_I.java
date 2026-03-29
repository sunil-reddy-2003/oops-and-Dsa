package recursion.Sequences;

import java.util.ArrayList;

public class CombinationSum_I {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int k = 7;
        all(0,arr,k,new ArrayList<>());
    }

    static void all(int index,int[] arr,int target,ArrayList<Integer> list){
        if(index== arr.length ){
            if(target==0){
                System.out.println(list);
            }return;
        }

        if(arr[index]<=target){
            list.add(arr[index]);
            all(index,arr,target-arr[index],list);
            list.remove(list.size()-1);
        }
        all(index+1,arr,target,list);

    }

}
