// Question: 561. Array Partition
// URL: https://leetcode.com/problems/array-partition/description/
import java.util.Arrays;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for(int i = 0; i < nums.length; i = i + 2) total+= nums[i];
        return total;
    }
}

class arraypartition{
    public static void main(String s[])
    {
        int[] nums = {1,4,3,2};
        System.out.println(new Solution().arrayPairSum(nums));
    }
}