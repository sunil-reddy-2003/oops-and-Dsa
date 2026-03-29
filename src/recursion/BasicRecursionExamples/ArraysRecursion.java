package recursion.BasicRecursionExamples;

public class ArraysRecursion {

    static boolean sortedOrNot(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sortedOrNot(arr,i+1);
    }



    public static void main(String[] sunil){
        int[] arr={1,2,3,44,5,6,7,8};
        System.out.println(sortedOrNot(arr,0));
    }
}
