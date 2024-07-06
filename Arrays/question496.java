// Question: 496. Next Greater Element I
// URL: https://leetcode.com/problems/next-greater-element-i/description/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++)
        {
            check(i, nums1, nums2);
        }
        return nums1;
    }
    public static void check(int index, int nums1[], int nums2[])
    {
        if(index == nums2.length - 1)
        {/
            nums1[index] = -1;
        }
        else
        {
            int j = 0;
            for(int i = 0; i < nums2.length; i++)
            {
                if(nums1[i] < nums2[j])
                {
                    nums1[i] = nums2[j];
                    break;
                }
                j++;
            }
        }
    }
}

class question496{
    public static void main(String s[])
    {
        int nums1[]={ 4, 1, 2};
        int nums2[] = {1,3,4,2};
        System.out.println(new Solution().nextGreaterElement(nums1, nums2));
    }
}