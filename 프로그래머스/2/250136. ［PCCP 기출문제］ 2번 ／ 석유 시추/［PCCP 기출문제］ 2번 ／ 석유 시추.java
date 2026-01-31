import java.util.*;

class Solution {
    
    int n, m;
    int[][] land;
    boolean[][] visited;
    int[] colScore;

    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    public int solution(int[][] land) {
        this.land = land;
        n = land.length;
        m = land[0].length;

        visited = new boolean[n][m];
        colScore = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }

        int answer = 0;
        for (int c = 0; c < m; c++) {
            answer = Math.max(answer, colScore[c]);
        }
        return answer;
    }
    
    private void bfs(int sx, int sy) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy});
        visited[sx][sy] = true;

        int size = 0;
        boolean[] usedCol = new boolean[m];

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            size++;
            usedCol[y] = true;

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (land[nx][ny] == 0) {
                    continue;
                }

                visited[nx][ny] = true;
                q.add(new int[]{nx, ny});
            }
        }

        for (int c = 0; c < m; c++) {
            if (usedCol[c]) colScore[c] += size;
        }
    }
}