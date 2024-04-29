public class reverse2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
            int j = a.length - 1;
            for(int i = 0;i < j; i++) //OR for(int i = 0;i < a.length/2; i++)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j--] = temp;
            }
            for(int i : a)
            {
                System.out.print(i+"\t");
            }
    }    
}
