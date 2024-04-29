import java.util.Arrays;

public class prefixsum1 {
    public static int sum(int a[],int i) {
        int total = 0;
        while(i >= 0)
        {
            total += a[i--];
        }
        return total;
    }

    public static void prefixsum(int a[]){
        int b[] = new int[a.length];
        // int k = 0;
        b[0] = a[0];
        for(int i = 1; i < a.length; i++)
        {
            b[i] = b[i - 1] + a[i];
        }
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        int a[] = {2,1,3,4,5};
        prefixsum(a);
    }
}