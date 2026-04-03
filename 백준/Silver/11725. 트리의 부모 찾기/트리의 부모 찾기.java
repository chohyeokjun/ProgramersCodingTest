import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        graph = new ArrayList[N + 1];
        parent = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        bfs(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append('\n');
        }
        System.out.print(sb);
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int next : graph[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = now;
                    q.offer(next);
                }
            }
        }
    }
}
