// Question: 989. Add to Array-Form of Integer
// URL: https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String digits = "";
        for (int i = 0; i < num.length; i++) {
            digits += num[i];
        }
        String total = Integer.toString(Integer.parseInt(digits) + k);
        List<Integer> num1 = new ArrayList<>();
        for (int i = 0; i < total.length(); i++) {
            num1.add(Character.getNumericValue(total.charAt(i)));
        }
        return num1;
    }
}
public class addtoarrayform {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {9,9,9,9,9,9,9,9,9,9,9};
        int k = 34;
        System.out.println(s.addToArrayForm(num, k));
    }
}
