class Solution {
    public int solution(int n, int w, int num) {
        int count = 0;
        if (n < w) {
            return 1;
        }
        int max_floor = n % w == 0 ? n / w : n / w + 1;
        int num_floor = num % w == 0 ? num / w : num / w + 1;
        if (max_floor % 2 != 0) {
            if (num_floor % 2 != 0) {
                if (num % w == 0) {
                    if (max_floor * w == n) {
                        count++;
                    }
                } else if (num % w == 1) {
                    if ((max_floor - 1) * w + 1 <= n) {
                        count++;
                    }
                } else {
                    if ((max_floor -1) * w + num % w <= n) {
                        count++;
                    }
                }
            }
            if (num_floor % 2 == 0) {
                if (num % w == 1) {
                    if (max_floor * w == n) {
                        count++;
                    }
                } else if (num % w == 0) {
                    if ((max_floor - 1) * w + 1 <= n) {
                        count++;
                    }
                } else {
                    if (max_floor * w - num % w + 1 <= n) {
                        count++;
                    }
                }
            }
        }
        if (max_floor % 2 == 0) {
            if (num_floor % 2 != 0) {
                if (num % w == 1) {
                    if (max_floor * w == n) {
                        count++;
                    }
                } else if (num % w == 0) {
                    if ((max_floor - 1) * w + 1 <= n) {
                        count++;
                    }
                } else {
                    if (max_floor * w - num % w + 1 <= n) {
                        count++;
                    }
                }
                
            } 
            if (num_floor % 2 == 0) {
                if (num % w == 0) {
                    if (max_floor * w == n) {
                        count++;
                    }
                } else if (num % w == 1) {
                    if ((max_floor - 1) * w + 1 <= n) {
                        count++;
                    }
                } else {
                    if ((max_floor - 1) * w + num % w <= n) {
                        count++;
                    }
                }
            }
        }
        for (int i = max_floor - 1; i >= num_floor; i--) {
            count++;
        }
        return count;
    }
}