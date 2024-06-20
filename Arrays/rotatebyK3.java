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
        int num2[] = new int[nums.length];
        int k = 3;
        int index = 0;
        int start = nums.length - k;
        for(int i = start; i < nums.length; i++)
        {

            num2[index] = nums[i];
            index++;
        }
        System.out.println(num2);
        for(int i = 0; i < start; i++)
        {
            num2[index] = nums[i];
            index++;
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : num2){
            System.out.print(i + " ");
        }
    }
}
