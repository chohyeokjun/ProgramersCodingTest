import java.util.Scanner;
class Solution {
    public int solution(int age) {
       int currentyear = 2022;
       
       return currentyear - age + 1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("선생님의 나이를 입력하세요.");
        int age = scanner.nextInt();
        int result = sol.solution(age);
        
        System.out.println(result);
    }
}