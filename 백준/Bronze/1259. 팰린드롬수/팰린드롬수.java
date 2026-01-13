import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            String s = N + "";
            char[] sArray = s.toCharArray();
            char[] tempArray = new char[sArray.length];
            int idx = 0;

            for (int i = sArray.length - 1; i >=0; i--) {
                tempArray[idx++] = sArray[i];
            }

            String answer = "yes";
            for (int i = 0; i < sArray.length; i++) {
                if (sArray[i] != tempArray[i]) {
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
