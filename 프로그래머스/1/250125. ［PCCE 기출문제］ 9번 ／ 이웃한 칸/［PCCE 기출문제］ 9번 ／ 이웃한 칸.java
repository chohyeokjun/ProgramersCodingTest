class Solution {
    public int solution(String[][] board, int h, int w) {
        int left = 0;
        int up = 0;
        int right = 0;
        int down = 0;
        String color = board[h][w];
        
        if (w == 0) {
            left = 0;
        } else if (color.equals(board[h][w-1])) {
            left = 1;
        }
        if (h == 0) {
            up = 0;
        } else if (color.equals(board[h-1][w])) {
            up = 1;
        }
        if (w == board[h].length - 1) {
            right = 0;
        } else if (color.equals(board[h][w+1])) {
            right = 1;
        }
        if (h == board.length - 1) {
            down = 0;
        } else if (color.equals(board[h+1][w])) {
            down = 1;
        }
        
        return left + up + right + down;
    }
}