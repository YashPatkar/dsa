// Question: 485. Max Consecutive Ones
// URL: https://leetcode.com/problems/max-consecutive-ones/description/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int num[] = new int[nums.length];
        int index = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
                num[index] = count;
                index++;
            } else {
                count = 0;
            }

        }
        int large = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
            }
        }
        return large;
    }
}


public class maxconsecutiveones {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a[] = {1,1,0,1,1,1};
        System.out.println(s.findMaxConsecutiveOnes(a));
    }
}
