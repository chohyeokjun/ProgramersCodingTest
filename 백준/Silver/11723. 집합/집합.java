import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int bitmask = 0;
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            
            if (cmd.equals("all")) {
                bitmask = (1 << 21) - 1;
                continue;
            } else if (cmd.equals("empty")) {
                bitmask = 0;
                continue;
            }
            
            int x = Integer.parseInt(st.nextToken());
            
            switch (cmd) {
                case "add":
                    bitmask |= (1 << x);
                    break;
                case "remove":
                    bitmask &= ~(1 << x);
                    break;
                case "check":
                    sb.append((bitmask & (1 << x)) != 0 ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    bitmask ^= (1 << x);
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}