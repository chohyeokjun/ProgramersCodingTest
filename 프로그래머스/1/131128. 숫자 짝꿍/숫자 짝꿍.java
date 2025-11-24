import java.util.*;
class Solution {
        public String solution(String X, String Y) {
            StringBuilder answer = new StringBuilder();
            List<Integer> list = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();
            String[] xSprit = X.split("");
            String[] ySprit = Y.split("");

            for (String s : ySprit) {
                map.put(s, map.getOrDefault(s,0) + 1);
            }

            for (String s : xSprit) {
                if (map.getOrDefault(s, 0) > 0) {
                    list.add(Integer.parseInt(s));
                    map.computeIfPresent(s, (key, value) -> value - 1);
                }
            }

            if (list.isEmpty()) {
                return "-1";
            }
            list.sort(Comparator.reverseOrder());
            if (list.size() == 1 || list.get(0) == 0) {
                return "" + list.get(0);
            }


            for (int i : list) {
                answer.append(i);
            }
            return answer.toString();
        }
    }