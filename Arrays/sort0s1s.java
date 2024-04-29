//Q: sort an array consisting of only 0s and 1s
class sort0s1s{
    static void change(int a[])
    {
        int n = a.length;
        int zero = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == 0)
            {
                zero++;
            }
        }
        for(int i = 0; i < zero; i++)
        {
            a[i] = 0;
        }
        for(int i = zero;i < n; i++)
        {
            a[i] = 1;
        }
        for(int i : a)
        {
            System.out.println(i);
        }
    }
    public static void main(String s[])
    {
        int a[] = {1,0,0,0,0,1,0};
        System.out.println("Original array:"+a);
        change(a);
    }
}