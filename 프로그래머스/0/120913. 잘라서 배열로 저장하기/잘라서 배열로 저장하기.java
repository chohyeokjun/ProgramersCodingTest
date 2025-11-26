class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        int size = (length + n - 1) / n;
        String[] answer = new String[size];
        
        for (int i = 0; i < size; i++) {
            int start = i * n;
            int end = Math.min(length, start + n);
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}