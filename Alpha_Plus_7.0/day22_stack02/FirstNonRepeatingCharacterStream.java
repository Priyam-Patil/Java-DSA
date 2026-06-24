// First non-repeating letter in a stream of characters.
// Characters are in lowercase.

import java.util.*;

public class FirstNonRepeatingCharacterStream {

    public static void printNonRepeating(String str) {
        // Array to track the frequency of every character from 'a' to 'z'
        int freq[] = new int[26];

        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            q.add(ch);

            // Example: 'c' - 'a' = 99 - 97 = 2,
            // so the frequency is updated at index 2.
            freq[ch - 'a']++;

            // Remove characters from the front while their frequency is greater than 1.
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                // q.peek() is the first non-repeating character.
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}