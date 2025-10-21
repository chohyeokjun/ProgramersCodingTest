class Solution {
        boolean solution(String s) {
            if (s.startsWith(")") || s.endsWith("(")) {
                return false;
            }
            int count = 0;
            for (String split : s.split("")) {
                if (split.equals("(")) {
                    count++;
                } else if (split.equals(")")) {
                    count--;
                }
                if (count < 0) {
                    return false;
                }
            }
            if (count == 0) {
                return true;
            } else {
                return false;
            }
        }
    }