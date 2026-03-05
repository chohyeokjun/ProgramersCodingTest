import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        String[] codes = letter.split(" ");
        StringBuilder answer = new StringBuilder();
        
        for (String code : codes) {
            int idx = Arrays.asList(morse).indexOf(code);
            answer.append((char)('a' + idx));
        }
        
        return answer.toString();
    }
}