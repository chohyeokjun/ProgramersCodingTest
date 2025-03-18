import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        Collections.sort(list);
        int [] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j]= list.get(j);
        }
        return answer;
    }
}