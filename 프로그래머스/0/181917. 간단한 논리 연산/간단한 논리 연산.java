class Solution {
        public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
            boolean answer = true;
            boolean x5 = true;
            boolean x6 = true;
            if (x1 == true || x2 == true) {
                x5 = true;
            } else {
                x5 = false;
            }
            if (x3 == true || x4 == true) {
                x6 = true;
            } else {
                x6 = false;
            }
            if (x5 == false || x6 == false) {
                answer = false;
            } else {
                answer = true;
            }
            return answer;
        }
    }