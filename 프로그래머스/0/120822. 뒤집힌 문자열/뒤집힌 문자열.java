class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] srr = my_string.split("");
        for (int i = srr.length - 1; i >= 0; i--) {
            answer.append(srr[i]);
        }
        return answer.toString();
    }
}