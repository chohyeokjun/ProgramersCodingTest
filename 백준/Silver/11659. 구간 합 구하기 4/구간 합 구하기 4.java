import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int[] prefix = new int[N+1];
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i-1] + numbers[i-1];
        }
        
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(prefix[y] - prefix[x-1]);
        }
    }
}
