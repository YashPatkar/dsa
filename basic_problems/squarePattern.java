import java.util.Scanner;
public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        for(int row = 0; row < num; row++)
        {
            for(int col = 0; col < num;col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
