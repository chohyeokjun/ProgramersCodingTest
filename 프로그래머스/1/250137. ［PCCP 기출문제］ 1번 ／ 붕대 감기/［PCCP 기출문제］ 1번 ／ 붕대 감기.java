class Solution {
        private int sec;
        private int duration;
        private int current_health;
    
        public Solution() {}

        public Solution(int sec, int duration, int current_health) {
            this.sec = sec;
            this.duration = duration;
            this.current_health = current_health;
        }
        
        public int solution(int[] bandage, int health, int[][] attacks) {
            Solution sol = new Solution(0,0,health);

            for (int i = 0; i < attacks.length; i++) {
                for (int j = sol.sec + 1; j <= attacks[i][0]; j++) {
                    if (j == attacks[i][0]) {
                        attack(attacks[i][1], sol);
                        if (sol.current_health <= 0) {
                            return -1;
                        }
                    } else {
                        heal(bandage, health, sol);
                    }
                }
                sol.sec = attacks[i][0];
            }
            return sol.current_health;
        }

        private void heal(int[] bandage, int health, Solution sol) {
            if (sol.current_health == health) {
                sol.duration++;
            } else if (sol.duration <= bandage[0]) {
                sol.current_health += bandage[1];
                if (sol.current_health > health) {
                    sol.current_health = health;
                }

                sol.duration++;
                
                if (sol.duration == bandage[0]) {
                    sol.current_health += bandage[2];
                    if (sol.current_health > health) {
                        sol.current_health = health;
                    }
                    sol.duration = 0;
                }
            }
        }

        private void attack(int damage, Solution sol) {
            sol.current_health -= damage;
            sol.duration = 0;
        }
    }