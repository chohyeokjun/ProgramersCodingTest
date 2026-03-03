class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = 0; j < numlist.length - i - 1; j++) {
                int a = numlist[j];
                int b = numlist[j + 1];
                
                int A = Math.abs(a - n);
                int B = Math.abs(b - n);
                if (A > B) {
                    numlist[j] = b;
                    numlist[j + 1] = a;
                    continue;
                }
                
                if (A == B && a < b) {
                    numlist[j] = b;
                    numlist[j + 1] = a;
                }
            }
        }
        return numlist;
    }
}