// Question: 594. Longest Harmonious Subsequence
// URL: https://leetcode.com/problems/longest-harmonious-subsequence/description/


import java.util.*;
class Solution {
    public int findLHS(int[] nums) {
        List<Integer> store = new ArrayList<>();
        store.add(0);
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0;j < nums.length; j++)
            {
                if(nums[j] - nums[i] == 1)
                {
                    store.add(j - 1);
                }
            }
        }
        return Collections.max(store);
    }
}

class question594{
    public static void main(String s[])
    {
        int arr[] = {1,3,2,2,5,2,3,7};
        System.out.println(new Solution().findLHS(arr));
    }
}