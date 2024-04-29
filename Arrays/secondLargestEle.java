// Q: Find the second largest element in the array
public class secondLargestEle
{
    static int maxEle(int[] a,int max)
    {
        for(int i : a)
        {
            if(max < i)
            {       
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int a[] = {5,4,1,6,2};
        int min = Integer.MIN_VALUE;
        int max = maxEle(a,min);
        for(int i = 0; i < a.length; i++)
        {
            if(max == a[i])
            {
                a[i] = min;
            }
        }
        max = maxEle(a, min);
        System.out.println("Maximum second element from array: "+max);
    }
}