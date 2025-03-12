class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        if (x >= 1 && x < 100) {
                int a = x / 10;
                int b = x % 10;
                if (x % (a + b) == 0) {
                    answer = true;
                } else {
                    answer = false;
                }
        }
        if (x >= 100 && x < 1000) {
                int a = x / 10;   
                int b = x % 10;   
                int c = x / 100;   
                int d = a % 10;
            if (x % (d + b + c) == 0) {
                    answer = true;
                } else {
                    answer = false;
                }
        }
        if (x >= 1000 && x < 10000) {
                int a = x / 10;   
                int b = x % 10;   
                int c = x / 100;   
                int d = a % 10;   
                int e = c % 10;   
                int f = c / 10;   
            if (x % (f + d + b + e) == 0) {
                    answer = true;
                } else {
                    answer = false;
                }
        }
        if (x == 10000) {
                int a = x / 10000;   
            if (x % a == 0) {
                    answer = true;
                } else {
                    answer = false;
                }
        }
        return answer;
    }
}