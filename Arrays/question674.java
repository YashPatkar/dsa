// Question: 674. Longest Continuous Increasing Subsequence
// url: https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1)
            return 1;
        if (nums.length == 0)
            return 0;
        int temp = nums[0];
        int count = 1;
        int count2 = 1;
        for (int i = 1; i < nums.length; i++) {
            if (temp < nums[i]) {
                count++;
                temp = nums[i];
            } else {
                if (count < count2) {
                    count2 = count2;
                } else {
                    count2 = count;
                }
                count = 1;
                temp = nums[i];
            }
        }
        if (count < count2)
            return count2;
        return count;
    }
}

public class question674 {
    public static void main(String[] args) {
        int arr[] = {1,3,5,4,7};
        System.out.println(new Solution().findLengthOfLCIS(arr));
    }
        
}
