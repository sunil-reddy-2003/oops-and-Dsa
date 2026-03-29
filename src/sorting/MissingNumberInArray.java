package sorting;


public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        int i=0;
        while(i<arr.length){
            int crctIndex=arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length  && arr[i]!=arr[crctIndex]){
                int temp=arr[i];
                arr[i]=arr[crctIndex];
                arr[crctIndex]=temp;
            }
            else{
                i++;
            }
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}