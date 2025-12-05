package cognizant;

import java.util.Arrays;

public class MaxDiffBtwDigitSumsInAnArray {
    public static void main(String[] args) {
//        int[] nums={1,99,100,28,3000,777};
        int[] nums={10,25,35,7,90};
//        int[] nums={5,14,23,32};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0; i< nums.length; i++){
            int sum=0;
            int temp=nums[i];
            while (temp>0){
                sum+=temp%10;
                temp=temp/10;
            }
            if(sum<min){
                min=sum;
            }
            if(sum>max){
                max=sum;
            }

        }
        System.out.println(max-min);

    }
    //123


}


//public class MaxDiffBtwDigitSumsInAnArray {
//    public static void main(String[] args) {
////        int[] nums={1,99,100,28,3000,777};
////        int[] nums={10,25,35,7,90};
//        int[] nums={5,14,23,32};
////        int[] sumsArr=new int[nums.length];
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        for (int i=0; i< nums.length; i++){
//            int sum=0;
//            int temp=nums[i];
//            while (temp>0){
//                sum+=temp%10;
//                temp=temp/10;
//            }
//            sumsArr[i]=sum;
//        }
//        Arrays.sort(sumsArr);
//        System.out.println(Arrays.toString(sumsArr));
//        System.out.println(sumsArr[sumsArr.length-1]-sumsArr[0]);
//    }
//    //123
//
//
//}
