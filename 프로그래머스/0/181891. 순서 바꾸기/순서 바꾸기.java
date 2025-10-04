import java.util.Arrays;
import static java.util.Arrays.copyOfRange;
import java.util.stream.IntStream;
class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[num_list.length];
            for (int i = 0; i < num_list.length; i++) {
                if (i == n-1) {
                    int[] prefix = copyOfRange(num_list, 0, i + 1);
                    int[] sub = copyOfRange(num_list, i + 1, num_list.length);
                    answer = IntStream.concat(Arrays.stream(sub), Arrays.stream(prefix)).toArray();
                }
            }
            return answer;
        }
    }