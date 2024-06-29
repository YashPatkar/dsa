// Question: 2011. Final Value of Variable After Performing Operations
// URL: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                count++;
            } else {
                count--;
            }
        }
        return count;
    }
}

public class finalvalueafteroperations {
    public static void main(String[] args) {
        Solution s = new Solution();
        String operations[] = {"--X","X++","X++"};
        System.out.print(s.finalValueAfterOperations(operations));
    }    
}
