// Question: 35. Search Insert Position
// URL: https://leetcode.com/problems/search-insert-position/description/

class searchinsertpos{
    public int solve(int[] nums, int target) {
        boolean condition = false;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                condition = true;
                return i;
            }
        }
        if (condition == false) {
            if (nums.length == 1) {
                if (nums[0] < target) {
                    return 1;
                } else {
                    return 0;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (i != nums.length - 1 && i != 0) {
                    int temp = i + 1;
                    if (nums[i] < target && target < nums[temp]) {
                        return temp;
                    }
                } else if (i == 0) {
                    if (nums[0] > target) {
                        return 0;
                    } else if (nums[0] < target && target < nums[1]) {
                        return 1;
                    }
                } else if (i == nums.length - 1) {
                    if (nums[nums.length - 1] < target) {
                        return nums.length;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        searchinsertpos obj = new searchinsertpos();
        int a[] = {1,3,5,6};
        System.out.println(obj.solve(a, 5));
    }
}