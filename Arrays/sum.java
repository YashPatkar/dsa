//Question:  Calculate the sum of all the elements in the given array.
import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int total = 0;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter Array Element: ");
            int data = sc.nextInt();
            arr[i] = data;
        }

        for(int i : arr)
        {
            total = total + i;
        }
        System.out.println("Total: "+ total);
    }
}