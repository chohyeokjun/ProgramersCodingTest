import java.util.*;
class Solution {
        public String solution(String bin1, String bin2) {
            long a = Long.parseLong(bin1, 2); 
            long b = Long.parseLong(bin2, 2);
            long sum = a + b;

            StringBuilder sb = new StringBuilder();
            while (sum != 0) {
                sb.append(sum % 2);
                sum /= 2;
            }
            return sb.length() == 0 ? "0" : sb.reverse().toString();
        }
    }