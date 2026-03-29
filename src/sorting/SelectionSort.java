package sorting;

public class SelectionSort {

    static void selectionSort(int[] arr){

        for(int i=0; i<arr.length; i++){
            int lastIndex = arr.length-i-1;
            int maxEleIndex=getMaxIndex(arr,0, lastIndex);
            int temp=arr[lastIndex];
            arr[lastIndex]=arr[maxEleIndex];
            arr[maxEleIndex]=temp;
        }
    }

     static int getMaxIndex(int[] arr, int startIndex, int lastIndex) {
        int maxIndex= startIndex;
        for(int i = startIndex; i<=lastIndex; i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }


    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
//        int[] arr={1,2,3,4,5};
//        int[] arr={};
//        int[] arr={1};
//        int[] arr={2,1};
//        int[] arr={4,7,0,-22,-31};

        selectionSort(arr);
        for (int c : arr) {
            System.out.print(c + " ");
        }
    }
}
