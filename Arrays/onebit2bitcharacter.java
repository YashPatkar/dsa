// Question: 717. 1-bit and 2-bit Characters
// url: https://leetcode.com/problems/1-bit-and-2-bit-characters/description/

public class onebit2bitcharacter {
    public static boolean solve(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i++;
            }
        }
        if (i == bits.length - 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String s[])
    {
        int bits[] = {1,0,1,0,1,0};
        System.out.print(solve(bits));
    }
}