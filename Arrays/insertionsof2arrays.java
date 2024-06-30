// Question: 349. Intersection of Two Arrays
// URL: https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> a = new ArrayList<>();
        if (nums1.length < nums2.length) {
            int count = 0;
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j] && a.contains(nums1[i]) == false) {
                        a.add(nums1[i]);
                        count++;
                    }
                }
            }
            int b[] = new int[count];
            for (int i = 0; i < a.size(); i++) {
                b[i] = a.get(i);
            }
            return b;
        } else if (nums1.length > nums2.length) {
            int count = 0;
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums2[i] == nums1[j] && a.contains(nums2[i]) == false) {
                        a.add(nums2[i]);
                        count++;
                    }
                }
            }
            int b[] = new int[count];
            for (int i = 0; i < a.size(); i++) {
                b[i] = a.get(i);
            }
            return b;
        } else {
            int count = 0;
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j] && a.contains(nums1[i]) == false) {
                        a.add(nums1[i]);
                        count++;
                    }
                }
            }
            int b[] = new int[count];
            for (int i = 0; i < a.size(); i++) {
                b[i] = a.get(i);
            }
            return b;
        }
    }
}

public class insertionsof2arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Solution s = new Solution();
        int[] result = s.intersection(nums1, nums2);
        for(int i : result)
        {
            System.out.print(i + " ");
        }
    }    
}