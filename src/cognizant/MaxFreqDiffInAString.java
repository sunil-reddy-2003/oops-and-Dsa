package cognizant;

import java.util.Hashtable;

public class MaxFreqDiffInAString {
    public static void main(String[] args) {
        String s="aabccc";
        Hashtable<Character,Integer> map=new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (freq < min) min = freq;
            if (freq > max) max = freq;
        }

        System.out.println("Min freq = " + min + ", Max freq = " + max);
        System.out.println("Difference = " + (max - min));

    }
}
