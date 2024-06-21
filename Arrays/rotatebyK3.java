// Question: Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class rotatebyK3 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        // int num2[] = {1,2,3,4,5,6,7};
        int k = 3;
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public static void reverse(int nums[], int start, int end)
    {
        for(int i = end; i > start; i--)
        {
            int temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
            start++;
        }
        for(int i : nums)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}