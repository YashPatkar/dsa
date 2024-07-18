// Question: 2089. Find Target Indices After Sorting Array
// URL: https://leetcode.com/problems/find-target-indices-after-sorting-array/description/ 


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question2089 {
    public static void main(String[] args) {
        int a[] = {1,2,5,2,3};
        System.out.println(new Solution().targetIndices(a, 2));
    }    
}

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                num.add(i);
            }
        }
        return num;
    }
}