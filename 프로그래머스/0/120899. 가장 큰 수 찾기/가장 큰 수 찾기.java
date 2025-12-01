import java.util.*;
class Solution {
        public int[] solution(int[] array) {
            int[] answer = new int[2];
            OptionalInt max = Arrays.stream(array).max();
            for (int i = 0; i < array.length; i++) {
                if (max.getAsInt() == array[i]) {
                    answer[0] = max.getAsInt();
                    answer[1] = i;
                }
            }
            return answer;
        }
    }