// Question: 219. Contains Duplicate II
// URL: https://leetcode.com/problems/contains-duplicate-ii/description/

class question219{
    public static void main(String s[])
    {
        int nums[] = {1,2,3,1};
        System.out.println(new Solution().containsNearbyDuplicate(nums, 3));
    }
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j<=i+k && j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                     return true;
                }
            }
        }
        return false;
    }
}