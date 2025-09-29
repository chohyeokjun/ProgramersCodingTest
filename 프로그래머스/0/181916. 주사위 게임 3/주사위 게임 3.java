class Solution {
        public int solution(int a, int b, int c, int d) {
            int answer = 0;
            if ( a == b && b == c && c == d) {
                answer = 1111 * a;
            } else if (a != b && b != c && c != d && a != c && a != d && b != d) {
                answer = Integer.min(Integer.min(a, b), Integer.min(c, d));
            } else if ((a == b && b == c) || (a == b && b == d) || (a == c && c == d) || (b == c && c == d)
            ) {
                int p, q;
                if (a == b && b == c) {
                    p = a; q = d;
                } else if (a == b && b == d) {
                    p = a; q = c;
                } else if (a == c && c == d) {
                    p = a; q = b;
                } else {
                    p = b; q = a;
                }
                answer = (int) Math.pow(10 * p + q, 2);
            } else if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)
            ) {
                int p, q;
                if (a == b && c == d) {
                    p = a; q = c;
                } else if (a == c && b == d) {
                    p = a; q = b;
                } else {
                    p = a; q = b;
                }
                answer = (p + q) * Math.abs(p - q);
            } else {
                int q, r;
                if (a == b) {
                    q = c; r = d;
                } else if (a == c) {
                    q = b; r = d;
                } else if (a == d) {
                    q = b; r = c;
                } else if (b == c) {
                    q = a; r = d;
                } else if (b == d) {
                    q = a; r = c;
                } else {
                    q = a; r = b;
                }
                answer = q * r;
            }
            return answer;
        }
    }