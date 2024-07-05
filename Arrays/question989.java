// Question: 989. Add to Array-Form of Integer 
// URL: https://leetcode.com/problems/add-to-array-form-of-integer/description/
import java.math.BigInteger;
import java.util.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String numberString = "";
        for (int value : num) {
            numberString += value;
        }
        BigInteger bigNumber = new BigInteger(numberString.toString());
        BigInteger result = bigNumber.add(BigInteger.valueOf(k));
        String resultString = result.toString();
        List<Integer> total = new ArrayList<>();
        for (int i = 0; i < resultString.length(); i++) {
            total.add(Character.getNumericValue(resultString.charAt(i)));
        }

        return total;
    }
}

public class question989 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(solution.addToArrayForm(num, k));
    }
}
