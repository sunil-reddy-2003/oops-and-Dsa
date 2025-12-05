package cognizant;

import java.util.Arrays;

public class LiftCapacity {
    public static void main(String[] args) {
        int people=5;
        int capacity=200;
        int[] weights={60 ,80, 40, 50, 90};
        int total=0;int count=0;
        Arrays.sort(weights);
        for (int i = 0; i < weights.length; i++) {
            total+=weights[i];
            if(total<=capacity){
                count++;
            }
        }
        System.out.println(count);
    }
}
