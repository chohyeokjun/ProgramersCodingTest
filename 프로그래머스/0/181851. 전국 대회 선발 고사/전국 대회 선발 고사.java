import java.util.*;
class Solution {
        public int solution(int[] rank, boolean[] attendance) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < rank.length; i++) {
                if (attendance[i]) {
                    list.add(i);
                }
            }
            list.sort((a, b) -> Integer.compare(rank[a], rank[b]));
            return list.get(0) * 10000 + list.get(1) * 100 + list.get(2);
        }
    }