import java.util.*;
class Solution {
        public int[] solution(int[] arr) {
            if (arr.length == 1) {
                return arr;
            }
            int length = 2;
            List<Integer> answer = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                answer.add(arr[i]);
            }
            for (int i = 0; i < answer.size(); i++) {
                if (answer.size() == length) {
                    break;
                } else if (answer.size() < length) {
                    answer.add(0);
                } else {
                    length *= 2;
                }
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }