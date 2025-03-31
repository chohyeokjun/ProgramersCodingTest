import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        String result = "";
        Arrays.sort(answer, Collections.reverseOrder());
        for (int i = 0; i < answer.length; i++) {
           result += answer[i]; 
        }
        return result;
    }
}