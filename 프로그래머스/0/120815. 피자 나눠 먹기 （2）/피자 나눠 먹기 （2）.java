class Solution {
    public int solution(int n) {
        int count = 1;
        int pizza = 6;
        if (pizza % n == 0) {
            return count;
        }
        while(pizza % n != 0) {
            count++;
            pizza += 6;
        }
        return count;
    }
}