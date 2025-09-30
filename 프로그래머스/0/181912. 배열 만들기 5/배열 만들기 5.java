import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
        public int[] solution(String[] intStrs, int k, int s, int l) {
            int[] answer = {};
            for (int i = 0; i < intStrs.length; i++) {
                List<String> list = Arrays.stream(intStrs[i].split(""), s, s + l).collect(
                        Collectors.toList());
                int ints = Integer.parseInt(String.join("", list));
                if (ints > k) {
                    answer = Arrays.copyOf(answer, answer.length + 1);
                    answer[answer.length - 1] = ints;
                }
            }
            return answer;
        }
    }