class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = Math.min(sides[0], sides[1]);
        int b = Math.max(sides[0], sides[1]);
        
        for (int c = b - a + 1; c <= b; c++) {
            answer++;
        }
        
        for (int c = b + 1; c < a + b; c++) {
            answer++;
        }
        return answer;
    }
}