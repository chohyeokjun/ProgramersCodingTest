import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
class Solution {
        public int[] solution(int[] num_list) {
            List<Integer> list = new ArrayList<>();
            IntStream.range(0, num_list.length).forEach(i -> list.add(num_list[i]));
            if (num_list[num_list.length-1] > num_list[num_list.length - 2]) {
                list.add(num_list[num_list.length-1] - num_list[num_list.length - 2]);
            } else {
                list.add(num_list[num_list.length-1] * 2);
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }