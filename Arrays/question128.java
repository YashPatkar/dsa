// Question: 128. Longest Consecutive Sequence
// URL: https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.Arrays;
public class question128 {
    public static void main(String[] args) {
    int num[] = {100,4,200,1,3,2};
        System.out.println(new Solution().longestConsecutive(num));
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0];
        int cons = start++;
        int count = 1;
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (cons == nums[i]) {
                cons++;
                count++;
            } else if (cons != nums[i - 1]) {
                if (count > temp) {
                    temp = count;
                }
                count = 1;
                cons = nums[i] + 1;
            }
        }
        if (count > temp) {
            temp = count;
        }

        return temp;
    }
}