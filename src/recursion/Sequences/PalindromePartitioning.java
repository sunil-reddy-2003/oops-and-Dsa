package recursion.Sequences;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s="aabb";
        System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        partitioning(s,0,new ArrayList<>(),ans);
        return ans;
    }
    private static void partitioning(String s,int index,List<String> temp,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                partitioning(s,i+1,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

}
