class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        boolean condition = true;
        
        if (!check(wallet, bill, condition)) {
            return answer;
        }
        
        while (condition) {
            bill = fold(bill);
            condition = check(wallet, bill, condition);
            answer++;
            bill = rotate(wallet, bill);
            condition = check(wallet, bill, condition);
        }
        return answer;
    }
    
    private int[] rotate(int[] wallet, int[] bill) {
        if (bill[1] <= wallet[0] && bill[0] <= wallet[1]) {
            int temp = bill[1];
            bill[1] = bill[0];
            bill[0] = temp;
            return bill;
        }
        return bill;
    }
    
    private int[] fold(int[] bill) {
        if (bill[0] / 2 >= 10 || bill[1] / 2 >= 10) {
                if (bill[0] > bill[1]) {
                    bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
        }
        return bill;
    }
    
    private boolean check(int[] wallet, int[] bill, boolean condition) {
        if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
            condition = false;
            return condition;
        }
        return condition;
    }
}