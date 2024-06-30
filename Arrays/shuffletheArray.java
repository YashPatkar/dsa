// Question: 1470. Shuffle the Array
// URL: https://leetcode.com/problems/shuffle-the-array/description/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int index = 0;
        int i1 = 0;
        int i2 = n;
        for (int i = 0; i < nums.length; i++) {
            if (i == n || index > nums.length) {
                break;
            }
            arr[index] = nums[i1];
            i1++;
            index++;
            arr[index] = nums[i2];
            index++;
            i2++;

        }
        return arr;
    }
}

public class shuffletheArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int arr[] = s.shuffle(nums, n);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
