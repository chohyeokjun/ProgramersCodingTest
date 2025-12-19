import java.util.Arrays;
class Solution {
        public int solution(String before, String after) {
            char[] charArrayB = before.toCharArray();
            char[] charArrayA = after.toCharArray();
            Arrays.sort(charArrayA);
            Arrays.sort(charArrayB);
            return Arrays.equals(charArrayA, charArrayB) ? 1 : 0;
        }
    }