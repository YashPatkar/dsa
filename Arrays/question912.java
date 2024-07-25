// Question: 912. Sort an Array
// URL: https://leetcode.com/problems/sort-an-array/description/?envType=daily-question&envId=2024-07-25

public class question912 {
    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        int ans[] = new Solution().sortArray(nums);
        for(int i : ans) System.out.print(i + " ");
    }    
}

class Solution {
    public int[] sortArray(int[] nums) {
        // int num[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}