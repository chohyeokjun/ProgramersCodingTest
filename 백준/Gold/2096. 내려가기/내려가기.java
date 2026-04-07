import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] maxDp = new int[3];
        int[] minDp = new int[3];
        int[] temp = new int[3];
        
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            maxDp[i] = minDp[i] = num;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                temp[j] = sc.nextInt();
            }
            
            int max0 = Math.max(maxDp[0], maxDp[1]) + temp[0];
            int max1 = Math.max(Math.max(maxDp[0], maxDp[1]), maxDp[2]) + temp[1];
            int max2 = Math.max(maxDp[1], maxDp[2]) + temp[2];
            
            int min0 = Math.min(minDp[0], minDp[1]) + temp[0];
            int min1 = Math.min(Math.min(minDp[0], minDp[1]), minDp[2]) + temp[1];
            int min2 = Math.min(minDp[1], minDp[2]) + temp[2];
            
            maxDp[0] = max0; maxDp[1] = max1; maxDp[2] = max2;
            minDp[0] = min0; minDp[1] = min1; minDp[2] = min2;
        }
        
        int max = Math.max(Math.max(maxDp[0], maxDp[1]), maxDp[2]);
        int min = Math.min(Math.min(minDp[0], minDp[1]), minDp[2]);
        System.out.println(max + " " + min);
    }
}
