import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String s = sc.next();
        
        int count = 0;
        int oi_cnt = 0;
        for (int i = 2; i < M; i++) {
            if (s.charAt(i-2) == 'I' && s.charAt(i-1) == 'O' && s.charAt(i) == 'I') {
                oi_cnt++;
                if (oi_cnt >= N) {
                    count++;
                    oi_cnt--;
                }
                i++;
                continue;
            }
            oi_cnt = 0;
        }

        System.out.println(count);
    }
}
