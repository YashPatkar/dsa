// Question: 556. Next Greater Element III
// Url: https://leetcode.com/problems/next-greater-element-iii/description/
// Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1. Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

class nextgreaterele3 {
    public void solve(int num) {
        String temp = Integer.toString(num);
        for(int i = 0; i < temp.length(); i++)
        {
            System.out.println(temp.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        nextgreaterele3 obj = new nextgreaterele3();
        obj.solve(12);
    }
}