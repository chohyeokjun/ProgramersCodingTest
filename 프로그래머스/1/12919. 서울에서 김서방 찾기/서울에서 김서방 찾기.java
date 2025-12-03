import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < seoul.length; i++) {
            map.put(seoul[i], i);
        }
        return "김서방은 " + map.get("Kim") + "에 있다";
    }
}