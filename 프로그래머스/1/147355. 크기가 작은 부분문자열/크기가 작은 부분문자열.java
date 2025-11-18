class Solution {
        public int solution(String t, String p) {
            int length = p.length();
            int count = 0;

            for (int i = 0; i <= t.length() - length; i++) {
                long num = Long.parseLong(t.substring(i, length + i));
                if (num <= Long.parseLong(p)) {
                    count++;
                }
            }
            return count;
        }
    }