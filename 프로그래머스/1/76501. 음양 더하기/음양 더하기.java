class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int j = 0; j < absolutes.length; j++) {
            if (signs[j] == true) {
                answer += absolutes[j];
            } else {
                answer += absolutes[j] * -1;
            }
        }
            return answer;
    }
}