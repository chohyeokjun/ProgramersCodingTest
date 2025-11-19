import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int a = i - map.get(s.charAt(i));
                answer[i] = a;
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);
                answer[i] = -1;
            }
        }
        return answer;
    }
}