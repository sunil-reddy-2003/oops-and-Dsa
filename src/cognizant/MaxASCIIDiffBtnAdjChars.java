package cognizant;

public class MaxASCIIDiffBtnAdjChars {
    public static void main(String[] args) {
//        String s="abcd";
        String s="az";
//        String s="aZc";

        int diff=0;
        for (int i = 0; i < s.length()-1; i++) {
            int temp=Math.abs(s.charAt(i)-s.charAt(i+1));
            diff=Math.max(temp,diff);
        }
        System.out.println(diff);
    }
}
