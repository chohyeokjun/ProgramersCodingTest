import java.util.*;
class Solution {
        public int solution(int[] players, int m, int k) {
            int answer = 0;
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < players.length; i++) {
                if (map.size() != 0) {
                    Integer key = map.keySet().iterator().next();
                    if (key + k <= i) {
                        map.remove(key);
                    }
                }
                if (m <= players[i]) {
                    if (map.size() == 0) {
                        map.put(i, players[i] / m);
                        answer += players[i] / m;
                    } else {
                        int sum = 0;
                        for (int j : map.values()) {
                            sum += j;
                        }
                        if ((players[i] - (m * sum)) / m > 0) {
                            map.put(i, (players[i] - (m * sum)) / m);
                            answer += (players[i] - (m * sum)) / m;
                        }
                    }
                }
            }
            return answer;
        }
    }