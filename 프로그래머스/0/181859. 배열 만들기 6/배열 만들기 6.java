import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
            } else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
            } else {
                stk.add(arr[i]);
            }
        }
        if (stk.size() == 0) {
            stk.add(-1);
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }
}