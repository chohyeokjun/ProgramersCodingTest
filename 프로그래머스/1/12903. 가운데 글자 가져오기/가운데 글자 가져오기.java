import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {
        List<String> result = new ArrayList<>();
            if (s.length() % 2 == 1) {
                result.add(String.valueOf(s.charAt(s.length() / 2)));

            } else {
                 result.add(String.valueOf(s.charAt(s.length() / 2 - 1)));
                 result.add(String.valueOf(s.charAt(s.length() / 2)));
            }
        return String.join("",result);
    }
}