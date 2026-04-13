import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    static ArrayList<Integer>[] parties;
    static boolean[] truth;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        truth = new boolean[N + 1];
        int firstTruth = -1;

        if (t > 0) {
            firstTruth = Integer.parseInt(st.nextToken());
            truth[firstTruth] = true;
            for (int i = 1; i < t; i++) {
                int x = Integer.parseInt(st.nextToken());
                truth[x] = true;
                union(firstTruth, x);
            }
        }

        parties = new ArrayList[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());

            parties[i] = new ArrayList<>();
            int first = Integer.parseInt(st.nextToken());
            parties[i].add(first);

            for (int j = 1; j < cnt; j++) {
                int x = Integer.parseInt(st.nextToken());
                parties[i].add(x);
                union(first, x);
            }
        }

        if (t == 0) {
            System.out.println(M);
            return;
        }

        int truthRoot = find(firstTruth);
        boolean[] knowTruthRoot = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            if (truth[i]) knowTruthRoot[find(i)] = true;
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            boolean canLie = true;
            for (int person : parties[i]) {
                if (knowTruthRoot[find(person)]) {
                    canLie = false;
                    break;
                }
            }
            if (canLie) answer++;
        }

        System.out.println(answer);
    }

    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb) return;
        parent[rb] = ra;
    }
}
