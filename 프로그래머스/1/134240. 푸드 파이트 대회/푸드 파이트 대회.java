class Solution {
    public String solution(int[] food) {
        String answer1 = "";
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            String s = String.valueOf(i);
            for (int c = 0; c < count; c++) {
                answer1 += s;
            }
        }
        
        String answer2 = "";
        for (int i = answer1.length() - 1; i >= 0; i--) {
            answer2 += answer1.charAt(i);
        }
        return answer1 + "0" + answer2;
    }
}