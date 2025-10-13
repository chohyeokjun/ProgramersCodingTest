import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> result = new ArrayList<>();
        String[] split = my_string.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                result.add(split[i]);
            }
        }
        return result.toArray(String[]::new);
    }
}