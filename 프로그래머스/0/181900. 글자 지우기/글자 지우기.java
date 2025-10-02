import java.util.ArrayList;
import java.util.List;
class Solution {
        public String solution(String my_string, int[] indices) {
            StringBuilder sb = new StringBuilder();
            List<Integer> list = new ArrayList<>();
            for (int i : indices) {
                list.add(i);
            }
            for (int i = 0; i < my_string.length(); i++) {
                if (!list.contains(i)) {
                    sb.append(my_string.charAt(i));
                }
            }
            return sb.toString();
        }
    }