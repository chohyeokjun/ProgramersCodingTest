import java.util.*;

public class Solution {
        public int[] solution(int []arr) {
            List<Integer> answer = new ArrayList<>();
            int num = -1;
            for (int i = 0; i < arr.length; i++) {
                if (num != arr[i]) {
                    answer.add(arr[i]);
                    num = arr[i];
                }
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }