// Question: 3028. Ant on the Boundary
// URL: https://leetcode.com/problems/ant-on-the-boundary/description/
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int total = nums[0];
        int tar = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                total += nums[i];
            } else if (nums[i] < 0) {
                total = total + nums[i];
            }
            if (total == tar) {
                count++;
            }
        }
        return count;
    }
}

public class antOntheboundary {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {2,3,-5};
        System.out.println(s.returnToBoundaryCount(arr));
    }    
}
