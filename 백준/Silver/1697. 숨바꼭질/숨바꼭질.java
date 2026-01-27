import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N == K) {
            System.out.println(0);
            return;
        }

        final int MAX = 100000;
        int[] dist = new int[MAX + 1];
        boolean[] visited = new boolean[MAX + 1];

        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        visited[N] = true;
        dist[N] = 0;

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i : new int[]{x - 1, x + 1, x * 2}) {
                if (i >= 0 && i <= MAX && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    dist[i] = dist[x] + 1;

                    if (i == K) {
                        System.out.println(dist[i]);
                        return;
                    }
                }
            }
        }
    }
}