
class Solution {

    public boolean isPali(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int maxL = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPali(s, i, j) == true) {
                    int currentL = (j - i + 1);
                    if (currentL > maxL) {
                        maxL = currentL;
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }
}