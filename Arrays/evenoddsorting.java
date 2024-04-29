// Q: Given an array of integers ‘a’, move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.

import java.util.Arrays;
class evenoddsorting {
    public static void swap(int a[],int left, int right)
    {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    public static void sort(int a[])
    {
        int left = 0;
        int right = a.length - 1;
        while(left < right)
        {
            if(a[left]%2 == 1 && a[right]%2 == 0)
            {
                swap(a,left,right);
                left++;
                right--;
            }
            if(a[left]%2 == 0)
            {
                left++;
            }
            if(a[right]%2 == 1)
            {
                right--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[] = {1,2,7,3,4,5,6};
        sort(a);
    }
}