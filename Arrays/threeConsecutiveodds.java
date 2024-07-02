// Question: 1550. Three Consecutive Odds
// URL: https://leetcode.com/problems/three-consecutive-odds/description/

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 1) {
                count++;
            } else if (i % 2 == 0) {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}

public class threeConsecutiveodds {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 1};
        System.out.println(new Solution().threeConsecutiveOdds(arr));
    }
}
