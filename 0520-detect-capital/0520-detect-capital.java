class Solution {
    public boolean detectCapitalUse(String word) {
        int capi_count = 0;
        int n = word.length();
        for (int i = 0; i <n; i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                capi_count++;
            }
        }
        if (capi_count == n || capi_count == 0) {
            return true;
        }
        if (capi_count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        return false;
    }
}