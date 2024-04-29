import java.util.Scanner;
class raisePower{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Power: ");
        int power = sc.nextInt();
        int total = 1;
        for(int i = 1;i <= power; i++)
        {
            total = total * base;
        }
        System.out.println("Answer: "+total);
    }
}