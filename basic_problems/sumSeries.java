import java.util.Scanner;

class sumSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter an number: ");
        int num = sc.nextInt();
        int total = 0;
        for(int i = 1;i <= num; i++)
        {
            if(num % i == 0)
            {
                total -= i;
            }
            else
            {
                total += i;
            }
        }
        System.out.println("Sum of Series: "+total);
    }
}