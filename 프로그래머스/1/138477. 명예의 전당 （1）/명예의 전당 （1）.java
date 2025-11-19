import java.util.*;
class Solution {
        public int[] solution(int k, int[] score) {
            List<Integer> list = new ArrayList<>();
            int[] answer = new int[score.length];

            for (int i = 0; i < score.length; i++) {
                if (list.isEmpty()) {
                    list.add(score[i]);
                    answer[i] = score[i];
                } else if (list.size() < k){
                    list.add(score[i]);
                    answer[i] = Collections.min(list);
                } else {
                    if (Collections.min(list) < score[i]) {
                        list.remove(Collections.min(list));
                        list.add(score[i]);
                        answer[i] = Collections.min(list);
                    } else {
                        answer[i] = Collections.min(list);
                    }
                }
            }
            return answer;
        }
    }