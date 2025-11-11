class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int[] hopeSchedules = calculate(schedules);
        int day = startday;
        int safe = 0;
        int count = 0;
        
        for (int i = 0; i < hopeSchedules.length; i++) {
            
            for (int j = 0; j < timelogs[i].length; j++) {
                if (day % 7 == 6) {
                    day++;
                    continue;
                }
                if (day % 7 == 0) {
                    day = 1;
                    continue;
                }
                if (hopeSchedules[i] >= timelogs[i][j]) {
                    day++;
                    safe++;
                } else {
                    break;
                }
            }
            
            day = startday;
            
            if (safe - 5 == 0) {
                count++;
                safe = 0;
            } else {
                safe = 0;
            }
        }
        return count;
    }
    
    private int[] calculate(int[] schedules) {
        for (int i = 0; i < schedules.length; i++) {
            schedules[i] += 10;
            if (schedules[i] % 100 >= 60) {
                schedules[i] += 40;
            }
        }
        return schedules;
    }
}