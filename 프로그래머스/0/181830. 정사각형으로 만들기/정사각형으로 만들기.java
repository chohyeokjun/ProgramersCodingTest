class Solution {
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max][max];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        if (arr.length > arr[0].length) {
            for (int i = arr[0].length; i < arr.length; i++) {
                answer[i][arr[0].length] = 0;
            }
        } else if (arr.length < arr[0].length) {
            for (int i = arr.length; i < arr[0].length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}