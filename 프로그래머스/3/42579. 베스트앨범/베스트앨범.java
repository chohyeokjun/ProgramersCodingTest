import java.util.*;
class Solution {
        public int[] solution(String[] genres, int[] plays) {
            Map<String, Integer> totalPlays = new HashMap<>();
            Map<String, List<int[]>> genreSongs = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                totalPlays.put(genres[i], totalPlays.getOrDefault(genres[i], 0) + plays[i]);

                genreSongs.computeIfAbsent(genres[i], list -> new ArrayList<>())
                        .add(new int[]{i, plays[i]});
            }
            List<String> genreOrder = new ArrayList<>(totalPlays.keySet());
            genreOrder.sort((a, b) -> totalPlays.get(b) - totalPlays.get(a));

            List<Integer> answerList = new ArrayList<>();
            for (String genre : genreOrder) {
                List<int[]> songs = genreSongs.get(genre);
                songs.sort((a, b) -> {
                    if (b[1] == a[1]) return a[0] - b[0];
                    return b[1] - a[1];
                });
                for (int i = 0; i < songs.size() && i < 2; i++) {
                    answerList.add(songs.get(i)[0]);
                }
            }
            return answerList.stream().mapToInt(i -> i).toArray();
        }
    }