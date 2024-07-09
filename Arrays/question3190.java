// Question: 3190. Find Minimum Operations to Make All Elements Divisible by Three
// URL: https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/

public class question3190 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(new Solution().minimumOperations(arr));
    }    
}

class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0)
                count++;
        }
        return count;
    }
}