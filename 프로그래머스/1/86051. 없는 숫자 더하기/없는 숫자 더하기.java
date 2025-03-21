class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int sum = 0;

        for (int i =0; i<numbers.length; i++) {
            int number = numbers[i];
            sum += number;
            
        }
        return answer - sum;
    }
}