package Placement.LTIMindtree;

import java.util.ArrayList;

public class LTIMindtree_1 {
    public static void main(String[] args) {
        String[] arr={"A123z", "Test1","B456t","CDE789","xyz789","123456","abc123xyz","D456t"};
        ArrayList<String> ans= new ArrayList<>();
        for (String s : arr) {
            if (checker(s)) {
                ans.add(s);
            }
        }

        System.out.println(ans);

    }
    static boolean checker(String str){
        return (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') && (str.charAt(1) >= '0' && str.charAt(1) <= '9') && (str.charAt(2) >= '0' && str.charAt(2) <= '9') && (str.charAt(3) >= '0' && str.charAt(3) <= '9') && (str.charAt(4) >= 'a' && str.charAt(4) <= 'z');
    }
}
