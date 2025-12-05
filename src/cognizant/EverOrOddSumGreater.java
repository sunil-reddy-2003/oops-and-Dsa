package cognizant;

public class EverOrOddSumGreater {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int evenSum=0;//23
        int oddSum=0;//20
        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0){
                oddSum+=arr[i];
            }else {
                evenSum+=arr[i];
            }
        }

        System.out.println(evenSum>oddSum? "even is greater " : "odd is greater");
    }
}
