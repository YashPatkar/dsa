// Question: 152. Maximum Product Subarray
// URL: https://leetcode.com/problems/maximum-product-subarray/description/

import java.util.*;
public class question152 {
    public static void main(String[] args) {
        int num[] = {2,3,-2,4};
        System.out.println(new Solution().maxProduct(num));
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int high = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int sum = nums[i];
            if(sum > high) high = sum;
            for(int j = i + 1; j < nums.length; j++)
            {
                int temp = sum*=nums[j];
                if(temp > high) high = temp;
            }
        }
        if(high > 0) return high;
        return 0;
    }
}