class Solution {
    public int solution(String[] order) {
        int americanoCount = 0;
        int latteCount = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) {
                latteCount++;
            } else {
                americanoCount++;
            }
        }
        return americanoCount * 4500 + latteCount * 5000;
    }
}