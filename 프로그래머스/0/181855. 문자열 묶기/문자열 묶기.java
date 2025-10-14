import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        if (strArr.length == 1) {
            return 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < strArr.length + 1; i++) {
            map.put(strArr[i - 1].length(), map.getOrDefault(strArr[i - 1].length(), 0) + 1);
        }
        return map.values().stream().max(Integer::compareTo).get();
    }
}