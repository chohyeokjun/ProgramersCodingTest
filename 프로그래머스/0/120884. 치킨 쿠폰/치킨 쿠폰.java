class Solution {
    public int solution(int chicken) {
        int sum = 0;
        while (chicken >= 10) {
            int count = chicken / 10;
            sum += count;
            chicken = chicken % 10 + count;
        }
        return sum;
    }
}