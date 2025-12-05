package cognizant;

public class CountStringsThatBecomePalindromeAfterRemovingOneCharacter {

        public static void main(String[] args) {
            String[] arr = {"abca", "aa", "abc", "racecarx"};
            System.out.println(countPalAfterOneRemoval(arr));
        }

        private static int countPalAfterOneRemoval(String[] arr) {
            int count = 0;
            for (String s : arr) {
                if (canBecomePalindromeByRemovingOne(s)) {
                    count++;
                }
            }
            return count;
        }

        // Check if there exists an index whose removal makes s a palindrome
        private static boolean canBecomePalindromeByRemovingOne(String s) {
            int n = s.length();
            if (n == 0) return false; // nothing to remove

            for (int skip = 0; skip < n; skip++) {
                if (isPalindromeSkippingIndex(s, skip)) {
                    return true;
                }
            }
            return false;
        }

        // Check if string is palindrome after skipping index `skip`
        private static boolean isPalindromeSkippingIndex(String s, int skip) {
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (left == skip) {
                    left++;
                    continue;
                }
                if (right == skip) {
                    right--;
                    continue;
                }
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
