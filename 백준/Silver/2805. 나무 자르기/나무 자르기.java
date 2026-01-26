import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] trees = new int[N];
        int max = 0;
        
        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
            if (trees[i] > max) {
                max = trees[i];
            }
        }
        
        int left = 0;
        int right = max;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;
            
            for (int h : trees) {
                if (h > mid) {
                    sum += (h - mid);
                }
            }
            
            if (sum >= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(right);
    }
}