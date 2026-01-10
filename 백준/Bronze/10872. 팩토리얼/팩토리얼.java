import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long num = 1;
        
        if (N == 0) {
            System.out.print(1);
        } else {
            for (int i = 2; i <= N ; i++) {
                num *= i;
            }
            System.out.print(num);
        }
    }
}