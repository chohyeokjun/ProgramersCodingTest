import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            list.add(-1);
        } else {
            for (int i = answer.get(0); i <= answer.get(answer.size() - 1); i++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}