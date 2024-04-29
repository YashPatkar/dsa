//Q:  For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order.
import java.util.Arrays;

public class nondecreaseSort {
    public static void sort(int a[]) {
        int left = 0;
        int right = a.length - 1;
        int b[] = new int[a.length];
        int index = a.length - 1; // Start filling from the end of b

        while (left <= right) {
            if (Math.abs(a[left]) > Math.abs(a[right])) {
                b[index--] = a[left] * a[left];
                left++;
            } else {
                b[index--] = a[right] * a[right];
                right--;
            }
        }

        // Print the elements of b separated by spaces
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {-10, 2, 3, 1, 5};
        sort(a);
    }
}
