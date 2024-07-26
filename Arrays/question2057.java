// Question: 2057. Smallest Index With Equal Value
// URL: https://leetcode.com/problems/smallest-index-with-equal-value/description/

class question2057{
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        System.out.println(new Solution().smallestEqual(nums));
    }
}

class Solution {
    public int smallestEqual(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            if(i % 10 == nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}