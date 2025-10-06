class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            answer += calculate(num);
        }
        return answer;
    }
    private int calculate(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n - 1) / 2;
            }
            count++;
        }
        return count;
    }
}