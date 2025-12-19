class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] split = String.valueOf(order).split("");
        for (String s : split) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}