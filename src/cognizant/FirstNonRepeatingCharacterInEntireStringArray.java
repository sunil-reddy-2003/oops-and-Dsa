package cognizant;

import java.util.HashMap;

public class FirstNonRepeatingCharacterInEntireStringArray {
    public static void main(String[] args) {
//        String[] strings={"apple", "bat", "code"};
//        String[] strings={"x", "xy", "yx"};
//        String[] strings={"ab", "cd", "ef"};
        String[] strings={"zz", "abc", "z"};
        String str= String.join("",strings);
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        }
        for (int i = 0; i < str.length(); i++){
            char ch=str.charAt(i);
            if(hashMap.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println(-1);
    }

}
