import java.util.*;

public class Main {
    static class Node {
        int to, cost;

        Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static int n, m;
    static ArrayList<Node>[] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a].add(new Node(b, c));
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        int[] dist = dijkstra(start);
        System.out.println(dist[end]);
    }

    static int[] dijkstra(int start) {
        int[] dist = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Arrays.fill(dist, INF);

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int now = cur.to;

            if (visited[now]) continue;
            visited[now] = true;

            for (Node next : graph[now]) {
                int newCost = dist[now] + next.cost;
                if (newCost < dist[next.to]) {
                    dist[next.to] = newCost;
                    pq.offer(new Node(next.to, dist[next.to]));
                }
            }
        }

        return dist;
    }
}
