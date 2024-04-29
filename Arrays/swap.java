//Q: swapping first 2 elements of array
public class swap {
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4};
        a[0] = a[1] + a[0];
        a[1] = a[0] - a[1];
        a[0] = a[0] - a[1];
        for(int i : a)
        {
            System.out.print(i+"\t");
        }
    }    
}

