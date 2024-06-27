// Question: 26. Remove Duplicates from Sorted Array
// URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        int ele = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (ele != nums[i]) {
                nums[length] = ele;
                ele = nums[i];
                length++;
            }
        }
        nums[length] = ele;
        length++;
        return length;
    }
}

class removeduplicatesfromsortedarray{
    public static void main(String[] args) {
        int num[] = {0,0,1,1,1,2,2,3,3,4};
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(num));
        for(int i : num)
        {
            System.out.print(i+" ");
        }
    }
}