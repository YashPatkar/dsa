// Question: 169. Majority Element
// Link: https://leetcode.com/problems/majority-element/description/
// Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

public class majorityelement {
    public int solve(int[] nums) {
        int size = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (temp == nums[j]) {
                    count++;
                }
            }
            if (count > size) {
                return temp;
            }
        }
        return 1;
    }
    public static void main(String[] args) { 
        majorityelement a = new majorityelement();
        int nums[] = {3,2,3};
        int ans = a.solve(nums);
        System.out.print(ans);
    }
}