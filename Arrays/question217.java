// Question: 217. Contains Duplicate
// URL: https://leetcode.com/problems/contains-duplicate/description/

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] == nums[i]) return true;
        }
        return false;
    }
}

class question217{
    public static void main(String[] args) {
        int a[] = {1,2,3,1};
        System.out.print(new Solution().containsDuplicate(a));
    }
}