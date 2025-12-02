class Solution {
    public int solution(int num, int k) {
        int length = String.valueOf(num).length();
        int[] answer = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            answer[i] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == k) {
                return i + 1;
            }
            
        }
        return -1;
    }
}