// Question: 3162. Find the Number of Good Pairs I
// URL: https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/
class question3162{
    public static void main(String s[])
    {
        int num1[] = {1,3,4};
        int num2[] = {1,3,4};
        int k = 1;
        System.out.println(new Solution().numberOfPairs(num1, num2, k));
    }
}

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j < nums2.length; j++)
            {
                if((nums1[i] % (nums2[j] * k)) == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}