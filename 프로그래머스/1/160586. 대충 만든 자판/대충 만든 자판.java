import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
            String[] s = keymap[i].split("");
            for (int j = 0; j < s.length; j++) {
                int count = j + 1;
                if (!map.containsKey(s[j]) || map.get(s[j]) > count) {
                map.put(s[j], count);
                }
            }
        }
        
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            String[] s = targets[i].split("");
            for (int j = 0; j < s.length; j++) {
                if (!map.containsKey(s[j])) {
                    sum = -1;
                    break;
                } else {
                    sum += map.get(s[j]);
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}