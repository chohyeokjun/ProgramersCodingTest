import java.util.*;
class Solution {
        public int[] solution(int[] arr) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    list.add(arr[i]);
                } else {
                    for (int j = 1; j <= arr[i]; j++) {
                        list.add(arr[i]);
                    }
                }
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }