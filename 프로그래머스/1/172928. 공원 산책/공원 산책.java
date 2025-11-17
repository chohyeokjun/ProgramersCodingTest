import java.util.*;
class Solution {
        public int[] solution(String[] park, String[] routes) {
            int[] place = new int[2];
            List<int[]> list = new ArrayList<>();
            int maxW = 0;
            int maxH = park.length;
            for (int i = 0; i < park.length; i++) {
                String[] split = park[i].split("");
                maxW = split.length;
                for (int j = 0; j < split.length; j++) {
                    if (split[j].equals("S")) {
                        place[0] = i;
                        place[1] = j;
                    }
                    if (split[j].equals("X")) {
                        list.add(new int[]{i,j});
                    }
                }
            }
            for (int i = 0; i < routes.length; i++) {
                String[] s = routes[i].split(" ");
                place = move(list, s[0], Integer.parseInt(s[1]), place, maxW, maxH);
            }

            return place;
        }

        private int[] move(List<int[]> list, String s, int i, int[] place, int maxW, int maxH) {
            int x = place[1];
            int y = place[0];
            switch(s) {
                case "E" -> {
                    for (int j = place[1]; j <= place[1] + i; j++) {
                        if (j > maxW - 1) {
                            return place;
                        }
                        for (int[] ints : list) {
                            if (Arrays.equals(ints, new int[]{y, j})) {
                                return place;
                            }
                        }
                    }
                    place[0] = y;
                    place[1] = x + i;
                }
                case "S" -> {
                    for (int j = place[0]; j <= place[0] + i; j++) {
                        if (j > maxH - 1) {
                            return place;
                        }
                        for (int[] ints : list) {
                            if (Arrays.equals(ints, new int[]{j, x})) {
                                return place;
                            }
                        }
                    }
                    place[0] = y + i;
                    place[1] = x;
                }
                case "W" -> {
                    for (int j = place[1]; j >= place[1] - i; j--) {
                        if (j < 0) {
                            return place;
                        }
                        for (int[] ints : list) {
                            if (Arrays.equals(ints, new int[]{y, j})) {
                                return place;
                            }
                        }
                    }
                    place[0] = y;
                    place[1] = x - i;
                }
                case "N" -> {
                    for (int j = place[0]; j >= place[0] - i; j--) {
                        if (j < 0) {
                            return place;
                        }
                        for (int[] ints : list) {
                            if (Arrays.equals(ints, new int[]{j, x})) {
                                return place;
                            }
                        }
                    }
                    place[0] = y - i;
                    place[1] = x;
                }
                default -> {
                }
            }
            return place;
        }
    }