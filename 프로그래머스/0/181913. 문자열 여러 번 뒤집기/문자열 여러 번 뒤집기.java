class Solution {
        public String solution(String my_string, int[][] queries) {
            for (int i = 0; i < queries.length; i++) {
                int start = queries[i][0];
                int end = queries[i][1];
                String before = my_string.substring(0, start);
                String middle = my_string.substring(start, end + 1);
                String reverse = new StringBuilder(middle).reverse().toString();
                String after = my_string.substring(end + 1);
                my_string = before + reverse + after;
            }
            return my_string;
        }
    }