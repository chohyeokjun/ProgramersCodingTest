class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int xCount = 0;
        int notX = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (xCount == 0 && notX == 0) {
                x = c;
                xCount = 1;
                continue;
            }

            if (c == x) xCount++;
            else notX++;

            if (xCount == notX) {
                answer++;
                xCount = 0;
                notX = 0;
            }
        }

        if (xCount != 0 || notX != 0) {
            answer++;
        }

        return answer;
    }
}