package recursion.Sequences;

import java.util.ArrayList;

public class PrintOnlyOneSequence {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int k=2;
        int sum=0;
        onlySingleSequence(arr,0,k,new ArrayList<>(),sum);
    }

    static boolean onlySingleSequence(int[] arr,int index,int k,ArrayList<Integer> list,int sum){

        if(index>= arr.length){
            if(sum==k){
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[index]);
        sum+=arr[index];
        if(onlySingleSequence(arr, index+1, k, list, sum)) return true;
        int minus=list.remove(list.size()-1);
        if(onlySingleSequence(arr,index+1,k,list,sum-minus)) return true;

        return false;
    }
}
