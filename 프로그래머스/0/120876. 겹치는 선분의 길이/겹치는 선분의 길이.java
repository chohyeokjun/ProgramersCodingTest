class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];
        int answer = 0;

        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;

            for (int x = start; x < end; x++) {
                arr[x]++;
            }
        }

        for (int x = 0; x < 200; x++) {
            if (arr[x] > 1) {
                answer++;
            }
        }
        return answer;
    }
}