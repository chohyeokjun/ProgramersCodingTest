import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean check(int i) {
        if (i == 2) {
            return true;
        }
        
        if (i < 2 || i % 2 == 0) {
            return false;
        }
        
        for (int j = 3; j * j <= i; j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
