package sorting;

public class BubbleSortUsingRecursion {
    static void bubbleSortRec(int[] arr,int index1,int index2,int n){
        if(n==1) {return;}
        if(index2==n){
            bubbleSortRec(arr,0,1,n-1);
            return;
        }
        if(arr[index1]>arr[index2]){
            swap(arr,index1,index2);
        }
         bubbleSortRec(arr,index1+1,index2+1,n);
    }
    static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args){
        int[] arr={5,3,6,2,1,4};
        bubbleSortRec(arr,0,1,arr.length);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
