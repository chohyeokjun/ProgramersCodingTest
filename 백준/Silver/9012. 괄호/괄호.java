import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            int count = 0;
            boolean valid = true;
            
            for (char c : s.toCharArray()) {
                if (c == '(') count++;
                else count--;
                
                if (count < 0) {
                    valid = false;
                    break;
                }
            }
            if (valid && count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}