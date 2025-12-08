import java.util.Arrays;
class Solution {
        public String solution(String s) {
            String answer = "";
            String[] split = s.split(" ");
            int[] arr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                arr[i] = Integer.parseInt(split[i]);
            }
            return answer + Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt();
        }
    }