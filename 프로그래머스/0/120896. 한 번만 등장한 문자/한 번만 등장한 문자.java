import java.util.*;
class Solution {
        public String solution(String s) {
            StringBuilder answer = new StringBuilder();
            Map<String, Integer> map = new HashMap<>();
            String[] split = s.split("");
            Arrays.sort(split);
            for (String str : split) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
            for (String key : split) {
                if (map.get(key) == 1) {
                    answer.append(key);
                }
            }
            return answer.toString();
        }
    }