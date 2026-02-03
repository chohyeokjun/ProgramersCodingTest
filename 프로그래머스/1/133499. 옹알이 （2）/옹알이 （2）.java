class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] blackList = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for (String s : babbling) {
            String temp = s;
            
            for (String t : blackList) {
                if (temp.contains(t)) {
                    temp = "!";
                    break;
                }
            }
            
            if (!temp.equals(s)) {
                continue;
            }
            
            for (String w : words) {
                temp = temp.replace(w, " ");
            }
            
            if (temp.trim().isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}