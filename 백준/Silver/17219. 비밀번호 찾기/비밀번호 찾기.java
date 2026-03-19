import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<String, String> map = new HashMap<>();

        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String site = parts[0];
            String pw = parts[1];
            map.put(site, pw);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String site = sc.nextLine();
            sb.append(map.get(site)).append('\n');
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
