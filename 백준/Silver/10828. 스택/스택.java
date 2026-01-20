import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 
        
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            check(s, stack);
        }
    }
    static void check(String s, Stack<Integer> stack) {
        if (s.equals("pop")) {
            if (stack.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(stack.pop());
            }
        } else if (s.equals("size")) {
            System.out.println(stack.size());
        } else if (s.equals("empty")) {
            if (stack.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (s.equals("top")) {
            if (stack.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(stack.peek());
            }
        } else {
            String[] split = s.split(" ");
            stack.push(Integer.parseInt(split[1]));
        }
    }
}
