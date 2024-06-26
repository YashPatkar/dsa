class mergesortarray{
    public void solve(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0)
        {
            for(int i = 0; i < nums2.length; i++)
            {
                nums1[i] = nums2[i];
            }
        }
        else
        {
            int index = 0;
            for(int i = m; i <nums1.length; i++)
            {
               
                    nums1[i] = nums2[index];
                    index++;
                
            }
            for(int i = 0; i < nums1.length; i++)
            {
                for(int j = i + 1; j < nums1.length; j++)
                {
                    if(nums1[i] > nums1[j])
                    {
                        int temp = nums1[i];
                        nums1[i] = nums1[j];
                        nums1[j] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        mergesortarray obj = new  mergesortarray();
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3;
        int n = 3;
        obj.solve(nums1, m, nums2, n);

    }
}