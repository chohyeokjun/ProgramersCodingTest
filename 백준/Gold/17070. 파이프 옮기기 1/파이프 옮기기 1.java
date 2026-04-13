import java.util.*;

public class Main {
    static int N;
    static int[][] board;
    static long[][][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];
        dp = new long[N][N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        dp[0][1][0] = 1;

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (board[x][y] == 1) continue;

                if (dp[x][y][0] > 0) {
                    if (y + 1 < N && board[x][y + 1] == 0) {
                        dp[x][y + 1][0] += dp[x][y][0];
                    }
                    if (x + 1 < N && y + 1 < N &&
                        board[x][y + 1] == 0 &&
                        board[x + 1][y] == 0 &&
                        board[x + 1][y + 1] == 0) {
                        dp[x + 1][y + 1][2] += dp[x][y][0];
                    }
                }

                if (dp[x][y][1] > 0) {
                    if (x + 1 < N && board[x + 1][y] == 0) {
                        dp[x + 1][y][1] += dp[x][y][1];
                    }
                    if (x + 1 < N && y + 1 < N &&
                        board[x][y + 1] == 0 &&
                        board[x + 1][y] == 0 &&
                        board[x + 1][y + 1] == 0) {
                        dp[x + 1][y + 1][2] += dp[x][y][1];
                    }
                }

                if (dp[x][y][2] > 0) {
                    if (y + 1 < N && board[x][y + 1] == 0) {
                        dp[x][y + 1][0] += dp[x][y][2];
                    }
                    if (x + 1 < N && board[x + 1][y] == 0) {
                        dp[x + 1][y][1] += dp[x][y][2];
                    }
                    if (x + 1 < N && y + 1 < N &&
                        board[x][y + 1] == 0 &&
                        board[x + 1][y] == 0 &&
                        board[x + 1][y + 1] == 0) {
                        dp[x + 1][y + 1][2] += dp[x][y][2];
                    }
                }
            }
        }

        long answer = dp[N - 1][N - 1][0] + dp[N - 1][N - 1][1] + dp[N - 1][N - 1][2];
        System.out.println(answer);
    }
}
