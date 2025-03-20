import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String phone_number) {
        List<String> list = new ArrayList<>(phone_number.length());
        for (int i = 0; i < phone_number.length(); i++) {
            list.add(String.valueOf(phone_number.charAt(i)));
        }
        for (int j = 0; j < list.size()-4; j++) {
            list.set(j, "*");
        }
        String answer = list.stream().collect(Collectors.joining());
        return answer;
    }
}