import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i : nums) {
            numsSet.add(i);
        }
        return nums.length / 2 > numsSet.size() ? numsSet.size() : nums.length / 2;
    }
}