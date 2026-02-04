class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int num = 10000;
        for (int i : array) {
            if (n > i) {
                if (n - i < num || (n - i == num && i < answer)) {
                    num = n - i;
                    answer = i;
                }
            } else if (n < i) {
                if (i - n < num || (i - n == num && i < answer)) {
                    num = i - n;
                    answer = i;
                }
            } else {
                return i;
            }
        }
        return answer;
    }
}