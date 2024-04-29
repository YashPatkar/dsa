//Q: Rotate an array by k positions.
import java.util.*;

public class rotatebyK {
    public static int[] rotate(int a[], int k) {
        int n = a.length;
        k = k % n;
        int stre[] = new int[n];
        int index = 0;
        for (int i = n - k; i < n; i++) {
            stre[index++] = a[i];
        }
        for (int i = 0; i < n - k; i++) {
            stre[index++] = a[i];
        }
        return stre;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k = sc.nextInt();
        int result[] = rotate(a, k);
        System.out.println("Rotated Array: " + Arrays.toString(result));
    }
}
