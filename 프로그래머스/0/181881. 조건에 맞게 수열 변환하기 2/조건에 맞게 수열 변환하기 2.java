class Solution {
        public int solution(int[] arr) {
            int answer = 0;
            int[] current = arr.clone();
            while (true) {
                int[] next = repeat(current);
                if (equalsArray(current, next)) {
                    break;
                }
                current = next;
                answer++;
            }
            return answer;
        }
        private int[] repeat(int[] arr) {
            int[] current = arr.clone();
            for (int i = 0; i < current.length; i++) {
                if (current[i] >=50 && current[i] % 2 == 0) {
                    current[i] = current[i] / 2;
                } else if (current[i] < 50 && current[i] % 2 == 1) {
                    current[i] = current[i] * 2 + 1;
                }
            } return current;
        }
        private boolean equalsArray(int[] current, int[] next) {
            for (int i = 0; i < current.length; i++) {
                if (current[i] != next[i]) {
                    return false;
                }
            } return true;
        }
    }