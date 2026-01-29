import java.util.*;

public class Main {
    static int N, M, V;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
        
        sc.close();
    }

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.offer(start);
        System.out.print(start + " ");

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int next : graph[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                    System.out.print(next + " ");
                }
            }
        }
    }
}