// Question: 27. Remove Element
// URL: https://leetcode.com/problems/remove-element/description/

class Solution {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length] = nums[i];
                length++;
            }
        }
        for(int i : nums)
        {
            System.out.print(i+ " ");
        }
        return length;
    }
}
public class removeelement {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,2,2,3};
        System.out.println(s.removeElement(nums, 3));
    }
}
