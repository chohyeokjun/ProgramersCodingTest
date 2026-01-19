import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 
        
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            check(s, q);
        }
    }
    static void check(String s, Deque<Integer> q) {
        if (s.equals("pop")) {
            if (q.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(q.poll());
            }
        } else if (s.equals("size")) {
            System.out.println(q.size());
        } else if (s.equals("empty")) {
            if (q.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (s.equals("front")) {
            if (q.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(q.peek());
            }
        } else if (s.equals("back")) {
            if (q.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(q.peekLast());
            }
        } else {
            String[] split = s.split(" ");
            q.add(Integer.parseInt(split[1]));
        }
    }
}
