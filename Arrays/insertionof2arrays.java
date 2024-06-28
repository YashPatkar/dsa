// Question: 349. Intersection of Two Arrays
// URL: https://leetcode.com/problems/intersection-of-two-arrays/description/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       if(nums2.length < nums1.length)
       {
            int num[] = new int[nums2.length - 1];
            int index = 0;
            for(int i : nums2)
            {
                for(int j : nums1)
                {
                    if(i == j && contains(i, num) == false)
                    {
                        num[index] = i;
                    }
                }
            }
        return num;
       }
       else
       {
            int num[] = new int[nums1.length - 1];
            int index = 0;
            for(int i : nums1)
            {
                for(int j : nums2)
                {
                    if(i == j && contains(i, num) == false)
                    {
                        num[index] = i;
                        index++;
                    }
                }
            } 
        return num;
       }
    }
    public static boolean contains(int tar, int num[])
    {
        for(int i : num)
        {
            if(i == tar)
            {
                return true;
            }
        }
        return false;
    }
}

class insertionof2arrays{
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        Solution obj = new Solution();
        int[] res = obj.intersection(nums1, nums2);
        for(int i : res)
        {
            System.out.print(i + " ");
        }
    }

}