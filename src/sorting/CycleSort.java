package sorting;

public class CycleSort {
    public static void cycleSort(int[] arr){
        int i=0;
        while( i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){                  //i=0;
                int temp=arr[i];                //temp=arr[0]=3
                arr[i]=arr[correctIndex];          //arr[0]=arr[2]=2
                arr[correctIndex]=temp;            //arr[2]=3
            }else{i++;}
        }
    }
    public static void main(String[] args){
        int[] arr={3,5,2,1,4};
        cycleSort(arr);
        for(int nbr : arr){
            System.out.print(nbr+" ");
        }
    }
}
