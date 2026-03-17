import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[n + 1];

        visited[1] = true;
        dfs(1);

        System.out.println(count);
    }

    static void dfs(int now) {
        for (int next : graph[now]) {
            if (!visited[next]) {
                visited[next] = true;
                count++;
                dfs(next);
            }
        }
    }
}
