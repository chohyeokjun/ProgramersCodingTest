import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
                int b = intervals[i][1];
            for (int j = a; j <= b; j++) {
                answer.add(arr[j]);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}