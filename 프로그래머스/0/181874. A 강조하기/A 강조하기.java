class Solution {
        public String solution(String myString) {
            StringBuilder answer = new StringBuilder();
            char[] myStringCharArray = myString.toLowerCase().toCharArray();
            for (int i = 0; i < myStringCharArray.length; i++) {
                if (myStringCharArray[i] == 'a') {
                    answer.append('A');
                } else {
                    answer.append(myStringCharArray[i]);
                }
            }
            return answer.toString();
        }
    }