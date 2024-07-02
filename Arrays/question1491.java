//Question:  1491. Average Salary Excluding the Minimum and Maximum Salary
// URL: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

import java.util.Arrays;

class Solution {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int small = salary[0];
        int large = salary[salary.length - 1];
        double total = 0;
        for (int i : salary) {
            if (i != large && i != small) {
                total += i;
            }
        }
        int divide = salary.length - 2;
        return total / divide;
    }
}

class question1491{
    public static void main(String[] args) {
        int salary[] = {4000,3000,1000,2000};
        System.out.println(Solution.average(salary));
    }
}