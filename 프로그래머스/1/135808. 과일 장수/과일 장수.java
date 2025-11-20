import java.util.*;
class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            Integer[] sortedScore = Arrays.stream(score).boxed().toArray(Integer[]::new);
            Arrays.sort(sortedScore, Collections.reverseOrder());
            
            for (int i = 0; i < (score.length / m) * m; i+=m) {
                if (sortedScore[i+m-1] <= k) {
                    answer += sortedScore[i+m-1] * m;
                }
            }
            return answer;
        }
    }