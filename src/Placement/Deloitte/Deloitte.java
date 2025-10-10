package Placement.Deloitte;

public class Deloitte {
    public static void main(String[] args) {
        String str = "WHAT IS YOUR NAME?";
        replace(str);
    }

    private static void replace(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // keep non-letters as they are
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                ans += ch;
            }
            // if vowel → replace with next character
            else if ("aeiouAEIOU".indexOf(ch) != -1) {
                ans += (char) (ch + 1);
            }
            // consonant → find next vowel
            else {
                char next = (char) (ch + 1);
                while ("aeiouAEIOU".indexOf(next) == -1) {
                    next++;
                    if (next > 'z') next = 'a';  // wrap around for lowercase
                    if (next > 'Z' && ch <= 'Z') next = 'A'; // wrap around for uppercase
                }
                ans += next;
            }
        }
        System.out.println(ans);
    }
}
