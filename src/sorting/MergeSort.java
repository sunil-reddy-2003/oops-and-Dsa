package sorting;

public class MergeSort {
    static void mergeSort(int[] arr,int s,int e){
        if (e - s <= 1) return;
        int mid=s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);
        mergeArrays(arr,s,mid,e);
    }
    static void mergeArrays(int[] arr,int s,int m,int e){
        int i=s;
        int j=m;
        int k=0;
        int[] merged=new int[e-s];
        while(i< m && j< e){
            if(arr[i]<arr[j]){
                merged[k]=arr[i];
                i++;
                k++;
            }else{
                merged[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i< m){
                merged[k]=arr[i];
                i++;
                k++;
        }
        while(j<e){
            merged[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(merged, 0, arr, s, merged.length);
    }
    public static void main(String[] args){
        int[] arr={7,6,5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
