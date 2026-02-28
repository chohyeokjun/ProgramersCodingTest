class Solution {
    public String solution(int age) {
        String answer = "";
        String map = "abcdefghij";

        String[] digits = String.valueOf(age).split("");

        for (String d : digits) {
            int idx = Integer.parseInt(d);
            answer += map.charAt(idx);
        }

        return answer;
    }
}