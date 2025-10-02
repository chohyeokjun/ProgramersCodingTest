import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
        public int[] solution(String my_string) {
            int[] upper = new int[26];
            int[] lower = new int[26];
            for (char ch : my_string.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    upper[ch - 'A']++;
                } else if (ch >= 'a' && ch <= 'z') {
                    lower[ch - 'a']++;
                }
            }
            return IntStream.concat(Arrays.stream(upper), Arrays.stream(lower)).toArray();
        }
    }