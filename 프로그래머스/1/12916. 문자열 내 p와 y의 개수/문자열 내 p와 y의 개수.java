class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        String[] split = s.toLowerCase().split("");
        for (String str : split) {
            if (str.equals("p")) {
                pCount++;
            } else if (str.equals("y")) {
                yCount++;
            }
        }

        if (pCount != yCount) {
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}