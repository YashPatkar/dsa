// Question: 1636. Sort Array by Increasing Frequency
// URL: https://leetcode.com/problems/sort-array-by-increasing-frequency/description/?envType=daily-question&envId=2024-07-23

import java.util.*;

class question1636{
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        int[] ans = new Solution().frequencySort(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {
        List<Integer> distinct = new ArrayList<>();
        List<Integer> frequency = new ArrayList<>();
        
        // Populate the distinct list
        for (int num : nums) {
            if (!distinct.contains(num)) {
                distinct.add(num);
            }
        }
        
        // Populate the frequency list
        for (int i = 0; i < distinct.size(); i++) {
            int count = 0;
            for (int num : nums) {
                if (distinct.get(i) == num) {
                    count++;
                }
            }
            frequency.add(count);
        }
        
        // Sort distinct list based on frequency and value
        List<Integer> sortedDistinct = new ArrayList<>(distinct);
        sortedDistinct.sort((a, b) -> {
            int freqCompare = Integer.compare(frequency.get(distinct.indexOf(a)), frequency.get(distinct.indexOf(b)));
            if (freqCompare == 0) {
                return Integer.compare(b, a);  // Sort by value in descending order if frequencies are the same
            } else {
                return freqCompare;  // Sort by frequency in ascending order
            }
        });

        // Create the result array
        int[] result = new int[nums.length];
        int index = 0;

        // Populate the result array
        for (int num : sortedDistinct) {
            int count = frequency.get(distinct.indexOf(num));
            for (int i = 0; i < count; i++) {
                result[index++] = num;
            }
        }

        return result;
    }
}