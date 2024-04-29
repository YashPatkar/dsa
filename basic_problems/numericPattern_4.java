import java.util.Scanner;
public class numericPattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num;i++){
            for(int j = 1;j <= num; j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }    
}
