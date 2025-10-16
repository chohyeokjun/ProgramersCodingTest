import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
       for (int i = 0; i < delete_list.length; i++) {
            list.remove(Integer.valueOf(delete_list[i]));
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}