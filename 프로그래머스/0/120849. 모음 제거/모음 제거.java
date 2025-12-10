class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] srr = my_string.split("");
        for (String s : srr) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                s = s.replace(s,"");
            }
            answer += s;
        }
        return answer;
    }
}