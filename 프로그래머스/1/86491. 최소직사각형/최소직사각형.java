class Solution {
        public int solution(int[][] sizes) {
            int maxA = 0;
            int maxB = 0;
            for (int[] size : sizes) {
                int a = Math.max(size[0], size[1]);
                int b = Math.min(size[0], size[1]);
                if (a > maxA) {
                    maxA = a;
                }
                if (b > maxB) {
                    maxB = b;
                }
            }
            return maxA * maxB;
        }
    }