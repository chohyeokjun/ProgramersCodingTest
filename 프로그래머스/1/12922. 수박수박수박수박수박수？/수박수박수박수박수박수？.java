class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer = "수";
            } else if (i % 2 == 0) {
                answer = "박";
            }
            sb.append(answer);
        }
        return sb.toString();
    }
}