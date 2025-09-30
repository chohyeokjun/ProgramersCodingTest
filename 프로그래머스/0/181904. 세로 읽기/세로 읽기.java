class Solution {
        public String solution(String my_string, int m, int c) {
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < (my_string.length() % m == 0 ? my_string.length() / m : my_string.length() / m + 1); i++) {
                answer.append(my_string.substring(i * m, i * m + m).charAt(c-1));
            }
            return answer.toString();
        }
    }