import java.util.Arrays;
class copyArray{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int copy[] = Arrays.copyOf(a,a.length);
        System.out.println(copy);
        for(int i:copy){
            System.out.print(i+" "); 
        }
    }
}