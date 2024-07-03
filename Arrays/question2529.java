// Question: 2529. Maximum Count of Positive Integer and Negative Integer
// URL: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int i : nums) {
            if (i != 0 && i < 0) {
                neg++;
            } else if (i != 0 && i > 0) {
                pos++;
            }
        }
        if (pos > neg) {
            return pos;
        }
        return neg;
    }
}

public class question2529 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(s.maximumCount(nums));
    }    
}