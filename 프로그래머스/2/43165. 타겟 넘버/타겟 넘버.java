class Solution {
    public int solution(int[] numbers, int target) {
        int count = calculate(numbers, target, 0, 0);
        return count;
    }
    private int calculate(int[] numbers, int target, int i, int sum) {
        if (i == numbers.length) {
            return sum == target ? 1 : 0;
        }
        return calculate(numbers, target, i + 1, sum + numbers[i]) + calculate(numbers, target, i + 1, sum - numbers[i]);
    }
}