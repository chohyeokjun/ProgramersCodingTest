import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static int[] result;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        result = new int[M];
        used = new boolean[N];

        dfs(0);

        System.out.print(sb.toString());
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        int lastUsed = -1_000_000_001;

        for (int i = 0; i < N; i++) {
            if (used[i] || arr[i] == lastUsed) {
                continue;
            }

            used[i] = true;
            result[depth] = arr[i];
            lastUsed = arr[i];

            dfs(depth + 1);

            used[i] = false;
        }
    }
}
