import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        if (array.length == 1) {
            return array[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int number : array) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int max = 0;
        for (int frequency : map.values()) {
            if (frequency > max) {
                max = frequency;
            }
        }

        int mode = -1;
        int current = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                mode = entry.getKey();
                current++;
            }
        }
        if (current == 1) {
            return mode;
        } else {
            return -1;
        }
    }
}