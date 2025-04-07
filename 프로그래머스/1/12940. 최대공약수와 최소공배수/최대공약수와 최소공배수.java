class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1,2};
        int gcd = gcd(n, m);
        answer[0] = gcd;
        answer[1] = n * m / gcd;
        return answer;
    }
    public int gcd(int n, int m) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}