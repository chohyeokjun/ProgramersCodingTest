import java.util.Arrays;
import java.util.OptionalInt;

class Solution {
    public int[] solution(int[] arr) {
        OptionalInt first = Arrays.stream(arr).min();
        int min = first.getAsInt();
        int[] answer = Arrays.stream(arr).filter(value -> value != min).toArray();
        if (answer.length == 0) {
            answer = new int[]{-1};
        }
        return answer;
    }
}