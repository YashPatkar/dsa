import java.util.Scanner;
public class numericPattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k <= i; k++)
            {
                System.out.print(k);
            }
            for(int l = i - 1; l > 0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
