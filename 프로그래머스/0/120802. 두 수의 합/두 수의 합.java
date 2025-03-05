class Solution {
    public int solution(int num1, int num2) {
        int result = 0;
        boolean val = num1 >= -500000 && num1 <= 500000 && num2 >=-50000 && num2 <= 500000;
        if (val) {
            result = num1 + num2;
        }
        return result;
    }
}