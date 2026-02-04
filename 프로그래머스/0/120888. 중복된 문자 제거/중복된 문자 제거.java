import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] split = my_string.split("");
        
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String s : split) {
            set.add(s);
        }
        
        StringBuilder answer = new StringBuilder();
        for (String s : set) {
            answer.append(s);
        }
        return answer.toString();
    }
}