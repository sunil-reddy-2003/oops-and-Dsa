
package cognizant;

import java.util.Stack;

public class RemDupCharToFormLexicoSmallestString {

    public static void main(String[] args) {
        String s1 = "bcabc";
        String s2 = "cbacdcbc";
        String s3 = "aaaaa";
        String s4 = "zxyxz";
        String s5 = "abacb";

        System.out.println(removeDuplicateLetters(s1)); // abc
        System.out.println(removeDuplicateLetters(s2)); // acdb
        System.out.println(removeDuplicateLetters(s3)); // a
        System.out.println(removeDuplicateLetters(s4)); // xyz
        System.out.println(removeDuplicateLetters(s5)); // abc
    }

    public static String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] lastIndex = new int[26];   // last index of each character
        boolean[] visited = new boolean[26]; // if character is already in stack

        // 1) Fill lastIndex for each character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            lastIndex[ch - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        // 2) Process characters one by one
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            // If already in result, skip it
            if (visited[idx]) {
                continue;
            }

            // While stack is not empty and:
            // - top character is greater than current character (for lexicographically smaller result)
            // - top character appears again later (so we can safely remove it now)
            while (!stack.isEmpty()) {
                char top = stack.peek();
                int topIdx = top - 'a';

                if (top > ch && lastIndex[topIdx] > i) {
                    // Pop it and mark as not visited
                    stack.pop();
                    visited[topIdx] = false;
                } else {
                    break;
                }
            }

            // Push current character and mark visited
            stack.push(ch);
            visited[idx] = true;
        }

        // 3) Build result from stack (stack is in correct order from bottom to top)
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
