import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        for (String s : players) {
            map.put(s, index++);
        }
        for (String s : callings) {
            int callIndex = map.get(s).intValue();
            int targetIndex = callIndex - 1;

            String targetPlayer = players[targetIndex];
            players[callIndex] = players[targetIndex];
            players[targetIndex] = s;

            map.put(s, targetIndex);
            map.put(targetPlayer, callIndex);
        }
        return players;
    }
}