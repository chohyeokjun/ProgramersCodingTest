class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9) {
                String[] srr = String.valueOf(array[i]).split("");
                for (int j = 0; j < srr.length; j++) {
                    if (srr[j].equals("7")) {
                    answer++;
                    }
                }
            } else {
                if (array[i] == 7) {
                    answer++;
                }
            }
        }
        return answer;
    }
}