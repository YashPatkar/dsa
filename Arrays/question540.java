// Question: 540. Single Element in a Sorted Array
// URL: https://leetcode.com/problems/single-element-in-a-sorted-array/description/

class question540{
    public static void main(String[] args) {
        int nums[] = {3,3,7,7,10,11,11};
        System.out.println(new Solution().singleNonDuplicate(nums));
    }
}

class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i = 1; i < nums.length - 1; i+=2)
        {
            if(nums[i] != nums[i - 1])
            {
                if(nums[i + 1] == nums[i])
                {
                    return nums[i - 1];
                }                
                else 
                {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}