class Solution {
        public int solution(int[] num_list) {
            if (num_list == null) {
                return 0;
            }
            StringBuilder list1 = new StringBuilder();
            StringBuilder list2 = new StringBuilder();
            for (int num : num_list) {
                if (num % 2 == 0) {
                    list1.append(num);
                } else {
                    list2.append(num);
                }
            }
            return Integer.parseInt(list1.toString()) + Integer.parseInt(list2.toString());
        }
    }