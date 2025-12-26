import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[101][101];
        boolean[][] visited = new boolean[101][101];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        
        for (int[] rec : rectangle) {
            int x1 = rec[0] * 2;
            int y1 = rec[1] * 2;
            int x2 = rec[2] * 2;
            int y2 = rec[3] * 2;
            
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    if (map[i][j] == -1) {
                        continue;
                    }
                    if (i == x1 || i == x2 || j == y1 || j == y2) {
                        map[i][j] = 1;
                    } else {
                        map[i][j] = -1;
                    }
                }
            }
        }
        
        queue.add(new int[]{characterX * 2, characterY * 2, 0});
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            if (x == itemX * 2 && y == itemY * 2) {
                return distance / 2;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx <= 100 && ny >= 0 && ny <= 100 && map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, distance + 1});
                }
            }
        }
        return 0;
    }
}