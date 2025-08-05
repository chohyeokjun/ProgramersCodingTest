class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;
        
        int gcd = gcd(numer3, denom3);
        
        answer[0] = numer3 / gcd;
        answer[1] = denom3 / gcd;
        return answer;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}