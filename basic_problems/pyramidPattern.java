import java.util.Scanner;
class pyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            //spaces
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
