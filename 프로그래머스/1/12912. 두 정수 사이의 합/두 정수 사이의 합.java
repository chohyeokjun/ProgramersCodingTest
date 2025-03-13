class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            while (a < b) {
            answer += a;
                a++;
        }
            return answer+b;
        } else if (a > b) {
            while (a > b) {
                answer += b;
                    b++;
            } 
            return answer+a;
        } else if (a == b) {
            return answer = a;
        }
        
        return answer;
    }
}