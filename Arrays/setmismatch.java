// Question: 645. Set Mismatch
// Link: https://leetcode.com/problems/set-mismatch/description/
class setmismatch {
    public int[] solve(int[] nums) {
        int arr[] = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    arr[0] = nums[i];
                    break;
                }
            }
        }
        // for(int i = 0; i < nums.length; i++)
        // {}  
        return arr;
    }
    public static void main(String s[])
    {
        setmismatch a = new setmismatch();
        int nums[] = {1,2,2,4};
        int dup[] = a.solve(nums);
        for(int i : dup)
        {
            System.out.print(i+" ");
        }
    }
}