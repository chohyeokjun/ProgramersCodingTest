import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String expr = sc.nextLine();

        String[] parts = expr.split("-");

        int result = 0;

        result += sumOfPlusGroup(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            result -= sumOfPlusGroup(parts[i]);
        }

        System.out.println(result);
        sc.close();
    }

    private static int sumOfPlusGroup(String s) {
        String[] nums = s.split("\\+");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}