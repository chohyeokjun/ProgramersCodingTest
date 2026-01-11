import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        long[] size = new long[6];
        for (int i = 0; i < size.length; i++) {
            size[i] = sc.nextLong();
        }
        
        long T = sc.nextLong();
        long P = sc.nextLong();
        
        long tCount = 0;
        for (int i = 0; i < size.length; i++) {
            tCount += (size[i] + T - 1L) / T;
        }
        System.out.println(tCount);
        System.out.println(N / P + " " + N % P);
    }
}
