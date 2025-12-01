class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            int X = Integer.parseInt(split[0]);
            int Y = Integer.parseInt(split[2]);
            int Z = Integer.parseInt(split[4]);
            if (split[1].equals("+")) {
                if (X + Y == Z) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (X - Y == Z) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}