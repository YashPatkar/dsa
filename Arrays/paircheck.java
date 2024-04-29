//Q: Count the number of pairs whose sum is equal to the given value x.
import java.util.Scanner;
class paircheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int tar = sc.nextInt();
        int a[] = {1,2,3,4};
        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1;j < a.length;j++)
            {
                if((a[i] + a[j]) == tar)
                {
                    count += 1;
                }
            }
        }
        System.out.println("total no. of pairs: "+count);
    }    
}
