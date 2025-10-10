package Stack.StackProblems;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement_II {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int nextGreater = -1;

            // Find nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    // From here, look for the next greater
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            nextGreater = nums2[k];
                            break;
                        }
                    }
                    break; // stop once we handled nums1[i]
                }
            }
            ans[i] = nextGreater;
        }

        return ans;
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] nge=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = nums.length-1; i>=0; i--) {
            while (!stack.isEmpty() && stack.peek()<nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nge[i]=-1;
            }else{
                nge[i]=stack.peek();
            }
            stack.push(nums[i]);

        }
        return nge;
    }
}
