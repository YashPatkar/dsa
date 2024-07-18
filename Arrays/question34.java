// Question: 34. Find First and Last Position of Element in Sorted Array
// URL: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class question34{
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int output[] = new Solution().searchRange(arr, 8);
        for(int i : output)
        {
            System.out.print(i + " ");
        }
    }
}


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int empty[] = {-1, -1};
        if(nums.length == 0) return empty;
        else if(nums.length == 1)
        {
            if(nums[0] == target)
            {
                empty[0] = 0;
                empty[1] = 0;
                return empty;
            }
            else
            {
                return empty;
            }
        }
        int index = 0;
        while(start <= end)
        {
            if(nums[start] == target)
            {
                empty[index] = start;
                index++;
                break;
            }
            start++;
        }
        while(end >= start)
        {
            if(nums[end] == target)
            {
                empty[index] = end;
                index++;
                break;
            }
            end--;
        }

        if(empty[0] != -1 || empty[1] == -1)
        {
            if(empty[0] > empty[1])
            {
                int temp = empty[0];
                empty[0] = empty[1];
                empty[1] = temp;
            }
        }
        if(empty[0] == -1)
        {
            empty[0] = empty[1];
        }
        
        return empty;
    }
}
