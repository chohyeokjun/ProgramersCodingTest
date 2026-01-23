import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        
        long[] lines = new long[K];
        long maxLen = 0;
        
        for (int i = 0; i < K; i++) {
            lines[i] = sc.nextLong();
            if (lines[i] > maxLen) {
                maxLen = lines[i];
            }
        }
        
        long left = 1;
        long right = maxLen;
        long answer = 0;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            
            for (long len : lines) {
                cnt += len / mid;
            }
            
            if (cnt >= N) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(answer);
    }
}
