// URL: https://leetcode.com/problems/single-number-iii/description/
// Question: 260. Single Number III

class question260{
    public static void main(String[] args) {
         int[] nums = {1,2,2,5};
         int a[] = new Solution().singleNumber(nums);
         for(int i : a)
         {
            System.out.print(i + " ");
         }
    }
}

class Solution {
    public int[] singleNumber(int[] nums) {
        int num[] = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    nums[i] = -1111;
                    nums[j] = -1111;
                    break;
                }
            }
        }
        int index = 0;
        for(int i : nums)
        {
            if(i != -1111)
            {
                num[index] = i;
                index++;
            }
        }
        return num;
    }
}