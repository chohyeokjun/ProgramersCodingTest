class Solution {
    public int solution(int[][] dots) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                double slope1 = (double)(dots[j][1] - dots[i][1]) / (dots[j][0] - dots[i][0]);
                for (int k = i + 1; k < 4; k++) {
                    if (k == j) {
                        continue;
                    }
                    int l = 6 - i - j - k;
                    double slope2 = (double)(dots[l][1] - dots[k][1]) / (dots[l][0] - dots[k][0]);
                    if (Math.abs(slope1 - slope2) < 1e-9) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}