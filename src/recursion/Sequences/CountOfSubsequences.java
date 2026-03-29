package recursion.Sequences;

public class CountOfSubsequences {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int k=2;
        int sum=0;
        System.out.println(recursion(arr,0,k,sum));
    }

    static int recursion(int[] arr,int index,int k,int sum){

        if(index>= arr.length){
            if(sum==k){
                return 1;
            }return 0;
        }

        int left=recursion(arr, index+1, k, sum+arr[index]);
        int right=recursion(arr,index+1,k,sum);
        return left+right;
    }
}
