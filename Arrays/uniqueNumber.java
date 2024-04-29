//Q: Find the unique number in a given Array where all the elethents are being repeated twice with one value being unique.
import java.util.*;
class uniqueNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < size;i++)
        {
            System.out.print("Enter number:");
            int num = sc.nextInt();
            a[i] = num;
        }

        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }
        for(int i : a)
        {
            if(i > 0)
            {
                System.out.println("\nUnique number in array: "+i);
            }
        }
    }
}