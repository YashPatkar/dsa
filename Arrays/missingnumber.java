// Question: 268. Missing Number
// Url: https://leetcode.com/problems/missing-number/description/
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class missingnumber{
    public int solve(int[] nums) {
        for(int i = 0; i <= nums.length; i++)
        {
            int found = 0;
            for(int j : nums)
            {
                if(j == i)
                {
                    found = 1;
                    break;
                }
            }
            if(found == 0)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5,6};
        missingnumber a = new missingnumber();
        System.out.println(a.solve(arr));
    }
}