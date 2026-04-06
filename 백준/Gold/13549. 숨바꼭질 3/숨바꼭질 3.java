import java.util.*;

public class Main {
    static class Node {
        int x, time;
        Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N >= K) {
            System.out.println(N - K);
            return;
        }

        int MAX = 100000;
        boolean[] visited = new boolean[MAX + 1];
        Deque<Node> dq = new LinkedList<>();

        dq.addFirst(new Node(N, 0));
        visited[N] = true;

        while (!dq.isEmpty()) {
            Node cur = dq.pollFirst();

            if (cur.x == K) {
                System.out.println(cur.time);
                return;
            }

            int nx = cur.x * 2;
            if (nx <= MAX && !visited[nx]) {
                visited[nx] = true;
                dq.addFirst(new Node(nx, cur.time));
            }

            nx = cur.x - 1;
            if (nx >= 0 && !visited[nx]) {
                visited[nx] = true;
                dq.addLast(new Node(nx, cur.time + 1));
            }

            nx = cur.x + 1;
            if (nx <= MAX && !visited[nx]) {
                visited[nx] = true;
                dq.addLast(new Node(nx, cur.time + 1));
            }
        }
    }
}
