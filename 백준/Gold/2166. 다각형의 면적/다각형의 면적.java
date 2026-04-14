import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            sum += x[i] * y[next] - x[next] * y[i];
        }

        double area = Math.abs(sum) / 2.0;
        System.out.printf("%.1f\n", area);
    }
}
