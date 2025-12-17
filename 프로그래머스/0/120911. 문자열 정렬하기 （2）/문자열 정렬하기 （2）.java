class Solution {
        public String solution(String my_string) {
            char[] chars = my_string.toLowerCase().toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                for (int j = 0; j < chars.length - 1 - i; j++) {
                    if (chars[j] > chars[j + 1]) {
                        char temp = chars[j];
                        chars[j] = chars[j + 1];
                        chars[j + 1] = temp;
                    }
                }
            }
            return new String(chars);
        }
    }