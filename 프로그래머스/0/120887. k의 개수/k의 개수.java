class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++) {
            if (l >= 10) {
                String[] split = String.valueOf(l).split("");
                for (String s : split) {
                    if (s.equals(String.valueOf(k))) {
                        answer++;
                    }
                }
            } else {
                if (l == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}