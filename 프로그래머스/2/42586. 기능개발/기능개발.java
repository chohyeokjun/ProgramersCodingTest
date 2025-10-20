import java.util.*;
class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int count = 0;
            int day = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < progresses.length; i++) {
                if (progresses[i] == 100) {
                    list.add(count);
                } else if ((100 - progresses[i]) % speeds[i] != 0) {
                    if (i == 0) {
                        day = (100 - progresses[i]) / speeds[i] + 1;
                        count++;
                    } else if (day < (100 - progresses[i]) / speeds[i] + 1) {
                        day = (100 - progresses[i]) / speeds[i] + 1;
                        list.add(count);
                        count = 0;
                        count++;
                    } else {
                        count++;
                    }
                } else {
                    if (i == 0) {
                        day = (100 - progresses[i]) / speeds[i];
                        count++;
                    } else if (day < (100 - progresses[i]) / speeds[i]) {
                        day = (100 - progresses[i]) / speeds[i];
                        list.add(count);
                        count = 0;
                        count++;
                    } else {
                        count++;
                    }
                }
            }
            list.add(count);
            return list.stream().mapToInt(i -> i).toArray();
        }
    }