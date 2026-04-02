import java.util.*;

public class Main {
    static int N, M;
    static int[] arr, selected;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        selected = new int[M];
        visited = new boolean[N];
        dfs(0);
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int val : selected) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            selected[depth] = arr[i];
            dfs(depth + 1);
            visited[i] = false;
        }
    }
}
