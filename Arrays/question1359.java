// Question: 1395. Count Number of Teams
// URL: https://leetcode.com/problems/count-number-of-teams/description/

class question1359{
    public static void main(String s[])
    {
        int[] rating = {2,5,3,4,1};
        System.out.println(new Solution().numTeams(rating));
    }
}


class Solution {
    public int numTeams(int[] rating) {
        if(rating.length < 3)return 0;
        if(rating.length == 3)
        {
            if(rating[0] < rating[1] && rating[1] < rating[2] || rating[0] > rating[1] && rating[1] > rating[2])
            {
                return 1;
            }
            return 0;
        }
        int count = 0;
        for(int i = 0; i < rating.length - 2; i++)
        {
            for(int j = i + 1; j < rating.length - 1; j++)
            {
                for(int k = j + 1; k < rating.length; k++)
                {
                    if(rating[i] < rating[j] && rating[j] < rating[k])
                    {
                        count++;
                    }
                    else if(rating[i] > rating[j] && rating[j] > rating[k])
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}