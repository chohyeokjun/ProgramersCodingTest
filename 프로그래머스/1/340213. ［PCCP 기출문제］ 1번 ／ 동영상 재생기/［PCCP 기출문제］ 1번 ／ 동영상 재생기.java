class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_length = time(video_len);
        int current = time(pos);
        int op_s = time(op_start);
        int op_e = time(op_end);
        
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                current = next(video_length, current, op_s, op_e); 
                if (current >= op_s && current <= op_e) {
                    current = op_e;
                }
            } else {
                current = prev(current);
                if (current >= op_s && current <= op_e) {
                    current = op_e;
                }
            }
        }
        
        String h = "";
        if (current / 100 < 10) {
            h = "0"+ current / 100;
        } else if (current / 100 == 0) {
            h = "00";
        } else {
            h += current / 100;
        }
        
        String m = "";
        if (current % 100 < 10) {
            m = "0" + current % 100;
        } else if (current % 100 == 0) {
            m = "00";
        } else {
            m += current % 100;
        }
        
        return h + ":" + m;
    }
    
    private int time(String s) {
        String[] a = s.split(":");
        return Integer.parseInt(a[0]) * 100 + Integer.parseInt(a[1]);
    }
    
    private int next(int video_length, int current, int op_s, int op_e) {
        // 오프닝 구간인지 확인
        if (current >= op_s && current <= op_e) {
            // 오프닝 끝 지점으로 이동
            current = op_e;
        }
        
        // 현재 + 10s (만약 비디오 길이보다 길면 비디오 끝 지점으로 이동)
        current = current + 10 > video_length ? video_length : current + 10;
        current = calculate(current, "next");
        return current > video_length ? video_length : current;
    }
    
    private int prev(int current) {
        // 현재가 10s 보다 전인지 확인
        if (current < 10) {
            // 00:00 으로 이동
            current = 0;
        } else {
            current = calculate(current, "prev");
        }
        return current;
    }
    
    private int calculate(int time, String s) {
        if (time % 100 >= 60 && s.equals("next")) {
            time += 40;
        }
        if (time % 100 < 10 && s.equals("prev")) {
            time = (time / 100 - 1) * 100 + (time % 100 + 50);
        } else if (s.equals("prev")) {
            time -= 10;
        }
        return time;
    }
}