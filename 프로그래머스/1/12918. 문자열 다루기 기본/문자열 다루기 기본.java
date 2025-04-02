class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        // 길이가 4 또는 6인지 검증
        if (s.length() == 4 || s.length()== 6) {
            // 숫자만 추출
            String str = new StringBuilder(s).toString().replaceAll("[^0-9]", "");
            // 문자열에 문자가 들어있는지 확인
            if (str.equals(s)) {
                answer = true;
            } else {
                answer = false;
            }
        }
        return answer;
    }
}