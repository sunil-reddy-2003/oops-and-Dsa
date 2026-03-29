package recursion.Sequences;
import java.util.ArrayList;
public class SubsetsOfSumK {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int k=2;
        int sum=0;
        recursion(arr,0,k,new ArrayList<>(),sum);
    }

    static void recursion(int[] arr,int index,int k,ArrayList<Integer> list,int sum){

        if(index>= arr.length){
            if(sum==k){
                System.out.println(list);
                return;
            }else{
//                System.out.println("not sum"+list);
                return;
            }
        }

        list.add(arr[index]);
        recursion(arr, index+1, k, list, sum+arr[index]);
        int minus=list.remove(list.size()-1);
        recursion(arr,index+1,k,list,sum);
    }
}
