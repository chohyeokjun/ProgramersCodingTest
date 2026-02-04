import java.util.*;
class Solution {
        public String solution(String my_string) {
            StringBuilder answer = new StringBuilder();
            char[] chars = my_string.toCharArray();
            for(char ch : chars) {
                if('a' <= ch && ch <= 'z') {
                    answer.append(String.valueOf(ch).toUpperCase(Locale.ROOT));
                } else {
                    answer.append(String.valueOf(ch).toLowerCase(Locale.ROOT));
                }
            }
            return answer.toString();
        }
    }