// Not solved


// Question: 152. Maximum Product Subarray
// Given an integer array nums, find a subarray that has the largest product, and return the product. The test cases are generated so that the answer will fit in a 32-bit integer. 

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

public class maxproductsubarray {
    public static void greatest(int nums[])
    {
        int large = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
                if(nums[i] > large)
                {
                    large = nums[i];
                }
        }
        return large;
    }
    public static void main(String[] args) {
        int[] nums = { -2, 0, -1};
        if (nums.length == 1)
        {
            return nums[0];
        }
        else if (nums.length == 2) {
            int tot = nums[0] * nums[1];
            if (tot > nums[0] && tot > nums[1])
            {
                return tot;
            }
            else
            {
                if (nums[0] > nums[1]) {
                    return nums[0];
                } else {
                    return nums[1];
                }
            }
        }
        else
        {
            int num1 = nums[0], num2 = nums[1], max = num1 * num2;
            for (int i = 0; i < nums.length - 1; i++) {
                int j = i + 1;
                int temp = nums[i] * nums[j];
                int largenum = greatest(nums);
                if(largenum > temp)
                {
                    return largenum;
                }
                else if (temp > max) {
                    num1 = nums[i];
                    num2 = nums[j];
                }
                else if(nums[i] > temp){
                    return nums[i];
                }
                else if(nums[j] > temp)
                {
                    return nums[j];
                }
                else
                {
                    if(nums[i] > nums[j])
                    {
                        return nums[i];
                    }
                    else{
                        return nums[j];
                    }
                }
            }
            return num1 * num2;
        }
    }
}
