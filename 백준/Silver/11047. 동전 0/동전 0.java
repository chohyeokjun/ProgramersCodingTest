import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            numbers[i] = num;
        }
        
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (K >= numbers[i]) {
                count += K / numbers[i];
                K %= numbers[i];
            }
        }
        System.out.println(count);
    }
}