package recursion.BasicRecursionExamples;
import java.util.Arrays;
public class ReverseAnArray
{
    public static void main(String[] args) {
        int[] arr={ 1 , 2 , 3 , 4 , 5 };
        int left=0;
        int right=arr.length-1;
         recurs(arr,left,right);
        System.out.print(Arrays.toString(recursion(arr,left,right)));
    }

    static int[] recursion(int[] arr, int left, int right){
        if(left>right){
            return arr;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        return recursion(arr,left+1,right-1);
    }

 	static void recurs(int[] arr, int left, int right){
 	    if(left>right){
 	        System.out.println(Arrays.toString(arr));
 	        return;
 	    }
 	    int temp=arr[left];
 	    arr[left]=arr[right];
 	    arr[right]=temp;
 	    recurs(arr,left+1,right-1);
 	}
}