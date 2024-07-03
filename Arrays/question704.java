// Question: 704. Binary Search
// URL: https://leetcode.com/problems/binary-search/description/

class Solution {
    public int search(int[] nums, int target) {
        int index = nums.length - 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
            else if(nums[index] == target)
            {
                return index;
            }
            if(index <= i)
            {
                return -1;
            }
            index--;
        }
        return -1;
    }
}

class question704{
    public static void main(String s[])
    {
        Solution sol = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(sol.search(nums, 9));
    }
}