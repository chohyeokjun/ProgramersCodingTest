import java.util.List;
import java.util.ArrayList;
class Solution {
        public String[] solution(String[] names) {
            List<String> answer = new ArrayList<>();
            for (int i = 0; i < names.length; i += 5) {
                String name = names[i];
                answer.add(name);
            }
            return answer.stream().map(String::toString).toArray(String[]::new);
        }
    }