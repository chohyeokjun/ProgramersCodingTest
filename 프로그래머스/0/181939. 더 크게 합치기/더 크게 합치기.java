class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            String s = Integer.toString(a) + Integer.toString(b);
            String r = Integer.toString(b) + Integer.toString(a);
            answer = Integer.parseInt(s);
            if (Integer.parseInt(s) < Integer.parseInt(r)) {
                answer = Integer.parseInt(r);
            }
            return answer;
        }
    }