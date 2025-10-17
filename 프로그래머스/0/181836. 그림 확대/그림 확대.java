import java.util.*;
class Solution {
        public String[] solution(String[] picture, int k) {
            StringBuilder sb = new StringBuilder();
            List<String> list = new ArrayList<>();
            for (String s : picture) {
                String[] split = s.split("");
                for (String arr : split) {
                    String repeat = arr.repeat(k);
                    sb.append(repeat);
                }
                for (int i = 1; i <= k; i++) {
                    list.add(sb.toString());
                }
                sb.setLength(0);
            }
            return list.stream().toArray(String[]::new);
        }
    }