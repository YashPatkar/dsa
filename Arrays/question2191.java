// Question: 2191. Sort the Jumbled Numbers
// URL: https://leetcode.com/problems/sort-the-jumbled-numbers/description/?envType=daily-question&envId=2024-07-24

class question2191{
    public static void main(String s[])
    {
        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        int[] nums = {991,338,38};
        int[] ans = new Solution().sortJumbled(mapping, nums);
        for(int i : ans) System.out.print(i + " ");
    }
}

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int temp[] = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            String number = Integer.toString(nums[i]);
            String a = "";
            // Iterating number
            for (int j = 0; j < number.length(); j++) {
                char character = Integer.toString(mapping[Character.getNumericValue(number.charAt(j))]).charAt(0);
                a+=character;
            }
            temp[index] = Integer.parseInt(a);
            index++;
        }

        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    // Swap temp values
                    int b = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = b;

                    // Swap corresponding nums values
                    int c = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = c;
                }
            }
        }

        return nums;
    }
}