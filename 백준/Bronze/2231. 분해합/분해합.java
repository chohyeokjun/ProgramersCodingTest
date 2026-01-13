import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        int length = String.valueOf(N).length();
        
        for (int i = N - length * 9 < 1 ? 1 : N - length * 9; i < N; i++) {
            int M = i;
            int sum = i;
            
            while (M > 0) {
                sum += M % 10;
                M /= 10;
            }
            
            if (sum == N) {
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
    }
}
