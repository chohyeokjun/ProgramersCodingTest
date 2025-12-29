class Solution {
    public int solution(int hp) {
        int answer = 0;
        if (hp >= 5) {
            answer += hp / 5;
            hp %= 5;
        }
        if (hp >= 3) {
            answer += 1 + hp % 3;
        } else {
            answer += hp;
        }
        return answer;
    }
}