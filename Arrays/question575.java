// Question: 575. Distribute Candies
// URL: https://leetcode.com/problems/distribute-candies/description/


import java.util.Arrays;
class Solution {
    public int distributeCandies(int[] candyType) {
        int size = candyType.length / 2;
        int count = 1;
        Arrays.sort(candyType);
        for(int i = 1; i < candyType.length; i++)
        {
            if(count == size)
            {
                break;
            }
            else if(candyType[i] != candyType[i - 1])
            {
                count++;
            }
        }
        return count;
    }
}

public class question575 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3};
        System.out.println(new Solution().distributeCandies(arr));
    }    
}
