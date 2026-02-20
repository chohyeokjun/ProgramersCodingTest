class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int st = total / num - (num - 1) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = st + i;
        }

        return answer;
    }
}