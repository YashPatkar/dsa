import java.util.Scanner;
class sumofDigits{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int num = user.nextInt();
        int total = 0;
        int temp = 0;
        for(int i = num; i > 0;)
        {
            temp = i % 10;
            total += temp;
            i = i / 10;
        }
        System.out.println("Total: "+total);
    }
}