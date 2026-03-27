import java.util.*;

public class Main {
    static int N, M;
    static List<int[]> houses = new ArrayList<>();
    static List<int[]> chickens = new ArrayList<>();
    static int[] selected;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int x = sc.nextInt();
                if (x == 1) {
                    houses.add(new int[]{i, j});
                } else if (x == 2) {
                    chickens.add(new int[]{i, j});
                }
            }
        }

        selected = new int[M];
        dfs(0, 0);
        System.out.println(answer);
    }

    private static void dfs(int depth, int start) {
        if (depth == M) {
            int cityDist = getCityChickenDistance();
            if (cityDist < answer) answer = cityDist;
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            selected[depth] = i;
            dfs(depth + 1, i + 1);
        }
    }

    private static int getCityChickenDistance() {
        int sum = 0;

        for (int[] h : houses) {
            int hx = h[0];
            int hy = h[1];

            int minDist = Integer.MAX_VALUE;
            
            for (int idx : selected) {
                int[] c = chickens.get(idx);
                int cx = c[0];
                int cy = c[1];
                int dist = Math.abs(hx - cx) + Math.abs(hy - cy);
                if (dist < minDist) minDist = dist;
            }
            sum += minDist;
        }

        return sum;
    }
}
