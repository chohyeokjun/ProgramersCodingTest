import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] scores = new double[N];

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
        }

        double max = Arrays.stream(scores).max().getAsDouble();
        
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scores[i] / max * 100;
        }

        System.out.println(sum / N);
    }
}
