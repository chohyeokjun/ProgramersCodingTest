import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            answer.add(i);
        }
        for (int i = 0; i < query.length; i++) {
                if (i % 2 == 0) {
                    answer = new ArrayList<>(answer.subList(0, query[i] + 1));
                } else {
                   answer = new ArrayList<>(answer.subList(query[i], answer.size()));
                }
            }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}