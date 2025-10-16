class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if ((a + b) % 2 == 0) {
            if (a % 2 != 0) {
                answer += a * a + b * b;
            } else {
                answer += a - b < 0 ? -1 * (a - b): a - b;
            }
        } else {
            answer += 2 * (a + b);
        }
        return answer;
    }
}