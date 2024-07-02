// Question: 1480. Running Sum of 1d Array
// URL: https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}

public class runningSumof1dArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,4};
        int[] result = s.runningSum(nums);
        for(int i : nums) 
            System.out.print(i + " ");
    }    
}