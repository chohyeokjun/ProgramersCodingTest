import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int answer = 0;
        
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        
        for (int i : num) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}