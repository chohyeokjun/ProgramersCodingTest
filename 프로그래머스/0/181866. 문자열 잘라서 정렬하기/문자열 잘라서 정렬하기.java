import java.util.*;
class Solution {
        public String[] solution(String myString) {
            List<String> result = new ArrayList<>();
            String[] split = myString.split("x");
            for (String s : split) {
                if (s.isEmpty()) {
                    continue;
                }
                result.add(s);
            }
            return result.stream().sorted().toArray(String[]::new);
        }
    }