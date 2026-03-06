class Solution {
    public int solution(int a, int b) {
        int g = gcd(a, b);
        a /= g;
        b /= g;
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        return b == 1 ? 1 : 2;
    }
    
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}