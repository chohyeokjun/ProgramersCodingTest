class Solution {
    private int count;
    
    public int solution(int[] numbers, int k) {
        count = 0;
        return circle(numbers, -2, k);
    }
    
    private int circle(int[] numbers, int idx, int k) {
        idx = (idx + 2) % numbers.length;
        count++;
        if (count == k) {
            return numbers[idx];
        }
        return circle(numbers, idx, k); 
    }
}