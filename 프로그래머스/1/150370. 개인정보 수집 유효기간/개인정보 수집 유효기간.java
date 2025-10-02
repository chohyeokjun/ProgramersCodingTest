import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            List<Integer> answer = new ArrayList<>();
            Map<String, Integer> termsMap = new HashMap<>();
            Map<LocalDate, Integer> dateMap = new HashMap<>();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate date = LocalDate.parse(today, formatter);
            // terms " " 짜르기
            for (int i = 0; i < terms.length; i++) {
                String[] term = terms[i].split(" ");
                termsMap.put(term[0], Integer.valueOf(term[1]));
            }
            for (int i = 0; i < privacies.length; i++) {
                String[] privacy = privacies[i].split(" ");
                LocalDate privacyDate = LocalDate.parse(privacy[0], formatter);
                dateMap.put(privacyDate, i+1);
                if (termsMap.containsKey(privacy[1])) {
                    if (privacyDate.plusMonths(termsMap.get(privacy[1])).isBefore(date) || privacyDate.plusMonths(termsMap.get(privacy[1])).isEqual(date)) {
                        answer.add(dateMap.get(privacyDate));
                    }
                }
            }
            return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
    }