//Q: Count the number of triplets whose sum is equal to the given value x.
import java.util.*;
class tripletcheck {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int tar = sc.nextInt();
        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                for(int k = j + 1; k < a.length; k++)
                {
                    if((a[i] + a[j] + a[k]) == tar)
                    {
                        count += 1;
                    }
                }
            }
        }
        System.out.println("Triplet in array: "+ count);
    }
}
