import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .boxed()
                .collect(Collectors.toList());
        if (list.isEmpty()) {
            list.add(-1);
        }

        return list.stream().mapToInt(i -> i.intValue()).sorted().toArray();
    }
}