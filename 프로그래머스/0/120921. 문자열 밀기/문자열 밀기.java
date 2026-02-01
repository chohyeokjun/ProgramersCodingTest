import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        
        if (sb.toString().equals(B)) {
            return answer;
        }
        
        for (int i = 0; i < A.length(); i++) {
            sb.insert(0, sb.charAt(sb.length() -1));
            sb.deleteCharAt(sb.length() - 1);
            answer++;
            
            if (sb.toString().equals(B)) {
                return answer;
            }
        }
        return -1;
    }
}