// Question: 414. Third Maximum Number
// URL: https://leetcode.com/problems/third-maximum-number/description/

import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            Arrays.sort(nums);
            int count = 0;
            int large = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < large) {
                    large = nums[i];
                    count++;
                }
                if (count == 2) {
                    return large;
                }
            }
            return nums[nums.length - 1];
        }
    }
}

public class thirdmaximumnumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 1};
        System.out.println(s.thirdMax(nums));
    }
}