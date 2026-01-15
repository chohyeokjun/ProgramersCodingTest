import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int g = gcd(N, M);
        int l = lcm(N, M);
        
        System.out.println(g);
        System.out.println(l);
    }
    static int gcd(int N, int M) {
        int a = Math.abs(N);
        int b = Math.abs(M);

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    static int lcm(int N, int M) {
        int g = gcd(N, M);
        if (g == 0) return 0;
        return Math.abs(N / g * M);
    }
}
