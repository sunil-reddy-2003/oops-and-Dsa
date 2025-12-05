package cognizant;

import java.util.HashMap;

public class CheckifRearrangingCharactersofaStringCanFormaPalindrome {
    public static void main(String[] args) {
//        String str= "aabb";
//        String str="aab";
//        String str="abc";
//        String str="aabbccd";
        String str="aaabc";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        int freq=0;

        for (char ch:map.keySet()){
            if(map.get(ch)%2!=0){
                freq++;
            }
        }

        if(freq<=1){
            System.out.println("can form a palindrome");
        }else{
            System.out.println("cannot form a palindrome");
        }

    }
}
