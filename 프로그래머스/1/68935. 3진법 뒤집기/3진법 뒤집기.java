class Solution {
    public int solution(int n) {
        // 3진법
        String s = Integer.toString(n, 3);
        // 역순 정렬
        StringBuffer sb = new StringBuffer(s);
        String reverse = sb.reverse().toString();
        // 10진법
        int answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}