class Solution {
        public String solution(String n_str) {
            StringBuilder sb = new StringBuilder();
            sb.append(n_str);
            while (sb.toString().startsWith("0")) {
                sb.deleteCharAt(0);
            }
            return sb.toString();
        }
    }