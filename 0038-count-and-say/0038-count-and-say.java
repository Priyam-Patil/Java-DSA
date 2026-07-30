class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String res = countAndSay(n - 1);

        int count = 1;
        char curr = res.charAt(0);
        StringBuilder sb = new StringBuilder("");

        for (int i = 1; i < res.length(); i++) {
            if (res.charAt(i) == curr) {
                count++;
            } else {
                sb.append(count).append(curr);
                count = 1;
                curr = res.charAt(i);
            }
        }

        sb.append(count).append(curr);
        // because the last group of characters never enters the else block.

        return sb.toString();
    }
}