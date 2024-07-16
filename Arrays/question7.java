// Question: 7. Reverse Integer
// URL: https://leetcode.com/problems/reverse-integer/description/

import java.util.*;

class question7{
    public static void main(String s[])
    {
        System.out.print(new Solution().reverse(-321));
    }
}

class Solution {
    public int reverse(int x) {
        int rev = 0;
        int rem = 0;
        int temp = Math.abs(x);
        while(temp > 0)
        {
            rem = temp % 10;
            temp = temp / 10;
            if (rev > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            rev = rev * 10 + rem;
        }
        return x < 0 ? -rev : rev;
    }
}