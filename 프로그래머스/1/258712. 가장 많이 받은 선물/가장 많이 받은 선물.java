import java.util.HashMap;
class Solution {
        public int solution(String[] friends, String[] gifts) {
            int max = 0;
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < friends.length; i++) {
                map.put(friends[i], i);
            }
            int[][] giftCount = new int[friends.length][friends.length];
            int[] sendCount = new int[friends.length];
            int[] receiveCount = new int[friends.length];

            for (String s : gifts) {
                String[] split = s.split(" ");
                String A = split[0];
                String B = split[1];
                giftCount[map.get(A)][map.get(B)]++;
                sendCount[map.get(A)]++;
                receiveCount[map.get(B)]++;
            }

            for (int i = 0; i < map.size(); i++) {
                int nextMonthCount = 0;
               for (int j = 0; j < map.size(); j++) {
                   if (i == j) continue;
                   int send = giftCount[i][j];
                   int receive = giftCount[j][i];
                   int totalCountA = sendCount[i] - receiveCount[i];
                   int totalCountB = sendCount[j] - receiveCount[j];
                   if (send > receive) {
                       nextMonthCount += 1;
                   } else if (send == receive && totalCountA > totalCountB) {
                       nextMonthCount += 1;
                   }
               }
               max = Math.max(max, nextMonthCount);
            }
            return max;
        }
    }