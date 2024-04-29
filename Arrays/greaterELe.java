//Q: Count the number of elements strictly greater than value x.
import java.util.*;
class greaterELe{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3,2,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int ele = sc.nextInt();
        int count = 0;
        for(int i : a)
        {
            if(ele < i){
                count += 1;
            }
        }
        System.out.println(count+" ELements are greater than element "+ele);
    }
}