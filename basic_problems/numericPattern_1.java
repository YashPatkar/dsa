public class numericPattern_1 {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 6; j++){
                System.out.print(num);
                num++;
                if(j == 6 && num == 2 || num > 2){
                    num = 1;
                }
                else if(j == 6 && num == 1){
                    num = 2;
                }
            }
            System.out.println();
        }
    }
}