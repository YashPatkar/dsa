import java.util.ArrayList;
import java.util.List;

class majorityelement2{
    public List<Integer> solve(int[] nums) {
        int size = nums.length / 3;
        ArrayList<Integer> num2 = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (ele == nums[j]) {
                    count++;
                }
            }
            if (count > size) {
                if (num2.contains(ele) == false) {
                    num2.add(ele);
                }
            }
        }
        return num2;
    }
    public static void main(String[] args) {
        majorityelement2 obj = new majorityelement2();
        int nums[] = {3,2,3};
        System.out.print(obj.solve(nums));
    }    
}