package cognizant;

public class MaximumProductOfTwoDistinctElementsInArray {
    public static void main(String[] args) {
//        int[] arr={1, 2, 3, 4};
//        int[] arr={-1, -2, -3, 4};
        int[] arr={-5,1};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product=1;
            for (int j = i+1; j <arr.length ; j++) {
                product=arr[i]*arr[j];
                max=Math.max(product,max);
            }
        }
        System.out.println(max);
    }
}
