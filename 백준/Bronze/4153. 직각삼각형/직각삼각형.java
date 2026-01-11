import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            int a = x, b = y, c = z;
            
            if (a > b && a > c) {
                int temp = c;
                c = a;
                a = temp;
            } else if (b > a && b > c) {
                int temp = c;
                c = b;
                b = temp;
            }
            
            if (a != 0 && b != 0 && c != 0) {
                if (a * a + b * b == c * c) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
