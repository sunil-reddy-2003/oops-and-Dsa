package cognizant;

public class CountPairsWhoseXORIsEven {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4};
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i]^nums[j])%2==0)count++;
            }
        }
        System.out.println(count);
    }
}
