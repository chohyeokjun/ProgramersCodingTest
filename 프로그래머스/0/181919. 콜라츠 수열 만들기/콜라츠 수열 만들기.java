import java.util.ArrayList;
import java.util.List;
class Solution {
        public int[] solution(int n) {
            List<Integer> answer = new ArrayList<>();
            answer.add(n);

            while (n != 1) {
                int a = n % 2 == 0 ? n / 2 : n * 3 + 1;
                answer.add(a);
                n = a;
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }