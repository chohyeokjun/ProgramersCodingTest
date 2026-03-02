class Solution {
    public int solution(int[][] dots) {
        int minX = 256, maxX = -256;
        int minY = 256, maxY = -256;

        for (int i = 0; i < 4; i++) {
            int x = dots[i][0];
            int y = dots[i][1];

            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        int x = maxX - minX;
        int y = maxY - minY;
        return x * y;
    }
}