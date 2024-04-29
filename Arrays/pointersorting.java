//Q:sort an array for only 0s and 1s using 2 pointer concept
import java.util.Arrays;

class pointersorting{
    public static void swap(int a[],int left,int right)
    {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    public static void pointersorting(int a[]){
        int left = 0;
        int right = a.length - 1;
        while(left < right)
        {
            if(a[left]==1 && a[right]==0)
            {
                swap(a,left,right);
            }
            if(a[left] == 0)
            {
                left++;
            }
            if(a[right] == 1)
            {
                right--;
            }
        }
        System.out.print(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[] = {1,0,0,1,1,0,0,1,1,1};
        pointersorting(a);
    }
}
