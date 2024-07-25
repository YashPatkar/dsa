// Question: 238. Product of Array Except Self
// URL: https://leetcode.com/problems/product-of-array-except-self/description/

class question238{
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int ans[] = new Solution().productExceptSelf(nums);
        for(int i : ans) System.out.print(i + " ");
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        int index = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(index >= nums.length)
            {
                break;
            }
            int product = 1;
            for(int j = 0; j < nums.length; j++)
            {
                if(i != j)
                {
                    product *= nums[j];
                    if(product == 0) break;
                }
            }
            answer[index] = product;
            index++;
        }       
        return answer;
    }
}