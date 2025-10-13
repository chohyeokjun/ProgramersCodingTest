import java.util.*;
class Solution {
        public String[] solution(String myStr) {
            StringBuilder sb = new StringBuilder();
            List<String> list = new ArrayList<>();
            String[] split = myStr.split("");
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals("a") || split[i].equals("b") || split[i].equals("c")) {
                    if (sb.length() > 0) {
                        list.add(sb.toString());
                        sb.delete(0, sb.length());
                    }
                } else {
                    sb.append(split[i]);
                }
            }
            if (sb.length() > 0) {
            list.add(sb.toString());
            }

            if (list.isEmpty()) {
                list.add("EMPTY");
            }
            return list.toArray(String[]::new);
        }
    }