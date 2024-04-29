// Q: rotate an array by k position without using any extra space.
import java.util.*;
class rotatebyK2
{
    public static void reverse(int a[],int start , int end)
    {
        int j = a.length - 1;
        for(int i = start; i < end;i++)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j--] = temp;
        }
    }
    public static void rotate(int a[],int k)
    {
        int n = a.length;
        k = k % n;
        reverse(a, 0,n - k - 1);
        reverse(a, n - k - 1, n);
        reverse(a,0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter size: ");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter elements: ");
        for(int i = 0; i < n; i++)
        {
            int ele = sc.nextInt();
            a[i] = ele;
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        rotate(a,k);
        // System.out.println("array:"+Arrays.toString(rotate))
        for(int i : a)
        {
            System.out.print(i+"\t");
        }
    }
}