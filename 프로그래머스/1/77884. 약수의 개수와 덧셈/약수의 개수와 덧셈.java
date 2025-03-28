import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> result = new ArrayList<>();
        for (int a = left; a <= right; a++) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    result.add(i);
                }
            }
            if (result.size() % 2 == 0) {
                answer += a;
                result.clear();
            } else if (result.size() % 2 != 0) {
                answer -= a;
                result.clear();
            }
        }
        return answer;
    }
}