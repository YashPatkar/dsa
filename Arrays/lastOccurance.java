//Q: Find the last occurance of element in Array
import java.util.*;
class lastOccurance {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int ele = sc.nextInt();
        int maxIndex = 0;
        for(int i = 0 ; i< a.length ; i++)
        {
            if(a[i] == ele)
            {
                maxIndex = i;
            }
        }
        System.out.println("The last Index is: "+maxIndex);
    }
}
