// Question: 1122. Relative Sort Array
// URL: https://leetcode.com/problems/relative-sort-array/description/

class question1122{
    public static void main(String s[])
    {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int ans[] = new Solution().relativeSortArray(arr1, arr2);
        for(int i : ans)
        {
            System.out.print(i+" ");
        }
    }
}

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index = 0;
        for(int i = 0; i < arr2.length; i++)
        {
            for(int j = 0; j < arr1.length; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    if(index != j)
                    {
                        int temp = arr1[index];
                        arr1[index] = arr1[j];
                        arr1[j] = temp;
                        index++;
                    }
                    else
                    {
                        arr1[index] = arr1[j];
                        index++;
                    }
                }
            }
            for(int k = index; k < arr1.length; k++)
            {
                for(int l = k + 1; l < arr1.length; l++)
                if(arr1[k] > arr1[l])
                {
                    int temp = arr1[k];
                    arr1[k] = arr1[l];
                    arr1[l] = temp;
                }
            }
        }
        return arr1;
    }
}