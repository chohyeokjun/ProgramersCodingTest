import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> result = new ArrayList<>();
        for (int i : num_list) {
            result.add(i);
        }
        return result.stream().sorted().limit(5).mapToInt(i -> i).toArray();
    }
}