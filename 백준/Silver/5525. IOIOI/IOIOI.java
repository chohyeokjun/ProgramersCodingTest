import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        StringBuilder str1 = new StringBuilder();
        str1.append("I");
        
        for (int i = 1; i <= N; i++) {
            str1.append("OI");
        }
        
        
        int length = str1.length();
        
        String[] split = s.split("");
        
        int count = 0;
        for (int i = 0; i < M; i++) {
            if (split[i].equals("I") && i + length <= M) {
                boolean match = true;
                for (int j = 0; j < length; j++) {
                    if (!split[i + j].equals(str1.charAt(j) + "")) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
