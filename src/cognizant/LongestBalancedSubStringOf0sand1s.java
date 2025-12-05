package cognizant;

import java.util.HashMap;

class LongestBalancedSubStringOf0sand1s {

    public static void main(String[] args) {
        String s = "01000111";   // Expected: 6
//        String s = "0101";     // Expected: 4
//        String s = "1111";     // Expected: 0
//        String s = "101001";   // Expected: 4

        System.out.println(longestBalancedSubstring(s));
    }
    public static int longestBalancedSubstring(String s) {
        int n = s.length();
        int sum = 0;
        int maxLen = 0; //01000111
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // sum 0 before starting (important for prefixes)
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                sum += -1;
            } else if (ch == '1') {
                sum += 1;
            }
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int len = i - prevIndex;
                if (len > maxLen) {
                    maxLen = len;
                }
            } else {
                map.put(sum, i);  // store first time this sum appears
            }
        }

        return maxLen;
    }
}
