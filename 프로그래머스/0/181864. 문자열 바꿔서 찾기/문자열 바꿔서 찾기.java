class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;
            String replace = myString.replace("A", "C").replace("B", "A").replace("C", "B");
            if (replace.contains(pat)) {
                answer = 1;
            }
            return answer;
        }
    }