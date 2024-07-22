// Question: 2418. Sort the People
// URL: https://leetcode.com/problems/sort-the-people/description/?envType=daily-question&envId=2024-07-22

import java.util.*;
class question2418{
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"}; 
        int[] heights = {180,165,170};
        String[] num = new Solution().sortPeople(names, heights);
        for(String i : num) System.out.print(i + " ");
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String s[] = new String[names.length];
        int[] sample = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sample);
        int index = 0;
        for(int i = sample.length - 1; i >= 0; i--)
        {
            for(int j = 0; j < heights.length; j++)
            {
                if(sample[i] == heights[j])
                {
                    s[index] = names[j];
                    index++;
                    break;
                }
            }
        }
        return s;
    }
}