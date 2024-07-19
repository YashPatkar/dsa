// Question: 496. Next Greater Element I
// URL: https://leetcode.com/problems/next-greater-element-i/description/

import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (j != (nums2.length - 1)) {
                        for (int k = j + 1; k < nums2.length; k++) {
                            if (nums2[k] > nums2[j]) {
                                nums.add(Integer.valueOf(nums2[k]));
                                found = true;
                                break;
                            }
                        }
                        if (found == false) {
                            nums.add(-1);
                        }
                    } else {
                        nums.add(-1);
                    }
                    break;
                }
            }
        }
        int a[] = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            a[i] = nums.get(i);
        }
        return a;
    }
}


class question496{
    public static void main(String s[])
    {
        int nums1[]={ 4, 1, 2};
        int nums2[] = {1,3,4,2};
        int a[] = new Solution().nextGreaterElement(nums1, nums2);
        for(int i : a) System.out.print(i + " ");
    }
}