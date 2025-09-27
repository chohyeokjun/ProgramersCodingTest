class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int a = queries[i][0];
                int b = queries[i][1];
                int c = queries[i][2];
                int min = Integer.MAX_VALUE;
                boolean flag = false;
                for (int j = a; j <= b; j++) {
                    if (arr[j] > c) {
                        if (arr[j] < min) {
                         min = arr[j];
                         flag = true;
                        }
                    }
                }
                answer[i] = flag ? min : -1;
            }
            return answer;
        }
    }