package cognizant;

public class CountNumbersWithExactlyKSetBits {
    public static void main(String[] args) {
//        int[] arr={3,5,7,8};
        int[] arr={1, 2, 4, 8};
        int k=1;
        int totalNumbers=0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            int num=arr[i];
            while (num>0){
                num=num&(num-1);
                count++;
            }
            if(count==k){
                totalNumbers++;
            }
        }
        System.out.printf("Total numbers : %d",totalNumbers);
    }
}
