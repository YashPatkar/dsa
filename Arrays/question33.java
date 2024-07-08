// Question: 33. Search in Rotated Sorted Array
// URL: https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}

class question33{
    public static void main(String[] args) {
        int a[] = {4,5,6,7,0,1,2};
        System.out.println(new Solution().search(a, 0));
    }
}