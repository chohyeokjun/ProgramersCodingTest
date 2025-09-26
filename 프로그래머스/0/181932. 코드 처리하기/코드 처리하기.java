class Solution {
        public String solution(String code) {
            String ret = "";
            int mode = 0;
            for (int idx = 0; idx < code.length(); idx++) {
                if (code.charAt(idx) == '1') {
                    if (mode == 0) {
                        mode = 1;
                    } else {
                        mode = 0;
                    }
                    continue;
                }
                if (mode == 0) {
                    if (code.charAt(idx) != '1') {
                        if (idx % 2 == 0) {
                            ret += code.charAt(idx);
                        }
                    } else {
                        mode = 1;
                    }
                }
                if (mode == 1) {
                    if (code.charAt(idx) != '1') {
                        if (idx % 2 != 0) {
                            ret += code.charAt(idx);
                        }
                    } else {
                        mode = 0;
                    }
                }
            }
            return ret.isEmpty() ? "EMPTY" : ret;
        }
    }