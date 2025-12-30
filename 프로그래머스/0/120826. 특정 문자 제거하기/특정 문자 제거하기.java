class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer answer = new StringBuffer();
        for (char c : my_string.toCharArray()) {
            if (!String.valueOf(c).equals(letter)) {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}