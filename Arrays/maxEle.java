//Question: Calculate the maximum value out of all the elements in the array.
import java.util.Scanner;
public class maxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = 0;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Element: ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        for(int i : arr)
        {
            if(i >= max)
            {
                max = i;
            }
        }
        System.out.print("Maximum Element: "+ max);
    }
}
