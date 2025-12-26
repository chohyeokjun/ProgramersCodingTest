import java.util.*;
class Solution {
    private boolean[] visited;
    private List<String> list = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        
        dfs("ICN", "ICN", tickets, 0);
        
        return list.get(0).split(",");
    }
    
    private void dfs(String start, String route, String[][] tickets, int count) {
        if (!list.isEmpty()) {
            return;
        }
        
        if (count == tickets.length) {
            list.add(route);
            return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(start)) {
                visited[i] = true;
                dfs(tickets[i][1], route + "," + tickets[i][1], tickets, count + 1);
                visited[i] = false;
            }
        }
    }
}