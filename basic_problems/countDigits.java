import java.util.Scanner;
class countDigits
{
    public static void main(String s[])
    {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int num = user.nextInt();
        int count = 0;
        for(int i = num; i > 0;)
        {
            i = i / 10;
            count++;
        }
        System.out.println("Count = "+count);
    }
}