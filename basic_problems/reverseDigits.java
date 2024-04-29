import java.util.Scanner;
public class reverseDigits {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num = user.nextInt();
        int reverse = 0;
        for(int i = num; i > 0;)
        {
            int last = i % 10;
            reverse = reverse * 10 + last;
            i = i / 10;
        }
        System.out.println("Reverse: "+reverse);
    }    
}
