import java.util.Arrays;

class Solution {
    public int findShortestSubArray(int[] nums) {
       int num[] = Arrays.sort(nums);
       int num1[] = new int[nums.length * 2];
       int deg = 0;
       int ele = 1;
       int target = 0;
       int count = 1;
       for(int i = 0; i < num.length; i++)
       {
        for(int j = i + 1; j < num.length; j++)
        {
            if(nums[i] == nums[j])
            {
                count++;
                target = nums[i];
            }
            else if(nums[i] != nums[j])
            {
                num1[deg] = count;
                num1[ele] = target;
                count = 1;
            }
        }
       }
    }
}


class question697{
    Solution obj = new Solution();
    int arr[] = {1,2,2,3,1};
    int nums[] = obj.findShortestSubArray(arr);
    for(int i : nums)
    {
        System.out.print(i + " ");
    }
}