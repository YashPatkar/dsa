import java.util.*;
class frequencyArray{
    static int[] createarray(int a[])
    {
        int frequency[] = new int[100005];
        for(int i = 0; i < a.length; i++)
        {
            frequency[a[i]]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the values:");
        for(int i = 0; i < n; i++)
        {
            int ele = sc.nextInt();
            a[i] = ele;
        }
        int frequency[] = createarray(a);
        while(true)
        {
            System.out.print("Enter element to be search:");
            int querie = sc.nextInt();
            if(querie == -1)
            {
                break;
            }
            else if(frequency[querie] != 0)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}