import java.util.Scanner;

public class Main {
    static long C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        C = sc.nextLong();
        
        System.out.println(modPow(A, B));
        sc.close();
    }

    static long modPow(long A, long B) {
        if (B == 0) return 1;
        if (B == 1) return A % C;

        long half = modPow(A, B / 2);

        long result = (half * half) % C;

        if (B % 2 == 1) {
            result = (result * (A % C)) % C;
        }

        return result;
    }
}