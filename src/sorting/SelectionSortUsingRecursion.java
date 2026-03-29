package sorting;

public class SelectionSortUsingRecursion {
    static void selectionSortRec(int[] arr,int length){
        if(length<0){return;}
        int last=length;
        int maxIndex=getMaxIndex(arr,0,last);
        swap(arr,maxIndex,last);
        selectionSortRec(arr,length-1);
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
                for(int i=start;i<=end; i++){
                    if(arr[i]>arr[max]){
                        max=i;
                    }
                }
                return max;
    }

    static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args){
        int[] arr={5,4,3,2,0,9,-22,-9};
        int n= arr.length-1;
        selectionSortRec(arr,n);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
