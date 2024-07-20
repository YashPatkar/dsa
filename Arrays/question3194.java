// Question: 3194. Minimum Average of Smallest and Largest Elements
// URL: https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class question3194{
    public static void main(String[] args) {
        int nums[] = {7,8,3,4,15,13,4,1};
        System.out.println(new Solution().minimumAverage(nums));
    }
}

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double num = Double.MAX_VALUE;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length / 2; i++) {
            double minimum = nums[i];
            double maximum = nums[end];
            double sum = (minimum + maximum) / 2;
            if(num > sum) num = sum;
            end--;
        }
        
        return num;
    }
}