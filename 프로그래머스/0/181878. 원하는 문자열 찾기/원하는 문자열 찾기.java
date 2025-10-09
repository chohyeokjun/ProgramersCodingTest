class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;
            String lowerCaseMyString = myString.toLowerCase();
            String lowerCasePat = pat.toLowerCase();
            if (lowerCaseMyString.contains(lowerCasePat)) {
                answer = 1;
            }
            return answer;
        }
    }