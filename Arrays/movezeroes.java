// question: 283. Move Zeroes
// Url: https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length != 1)
        {
            if(nums.length == 2)
            {
                if(nums[0] == 0)
                {
                    nums[0] = nums[1];
                    nums[1] = 0;
                }
            }
            else
            {
                int index = 0;
                for(int i = 1; i < nums.length; i++)
                {
                    if(nums[i] != 0)
                    {
                        nums[index] = nums[i];
                        index++;
                    }
                }
                for(int i = nums.length - index + 1; i < nums.length; i++)
                {
                    System.out.println(nums.length - index + 1);
                    nums[i] = 0;
                }
            }
        }
    }
}

class movezeroes{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,1,1};
        s.moveZeroes(nums);
        for(int i : nums)
        {
            System.out.print(i + " ");
        }
    }
}