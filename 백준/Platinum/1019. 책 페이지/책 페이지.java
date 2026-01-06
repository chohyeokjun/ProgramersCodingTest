import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] cnt = new long[10];
        
        int d = 1;
        while (d <= N) {
            int divider = d * 10;
            int curr = (N / d) % 10;
            int high = N / divider;
            int low = N % d;
            
            for (int i = 1; i <= 9; i++) {
                cnt[i] += high * d;
            }
            
            for (int i = 0; i < curr; i++) {
                cnt[i] += d;
            }
            
            cnt[curr] += low + 1;
            
            cnt[0] += high * d - d;
            
            d *= 10;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(cnt[i]));
            if (i < 9) bw.write(' ');
        }
        bw.flush();
    }
}