package cognizant;

public class LongestSubsequenceOfAStringContainingConsonants {
    public static void main(String[] args) {
        String str= "Geeks for Geeks";
        String ans="";
        for (int i = 0; i < str.length(); i++) {
            if("aeiouAEIOU ".indexOf(str.charAt(i))==-1){
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
