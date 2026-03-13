import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }

        Arrays.sort(times);

        int totalTime = 0;
        int waitingTime = 0;

        for (int t : times) {
            waitingTime += t;
            totalTime += waitingTime;
        }

        System.out.println(totalTime);
    }
}