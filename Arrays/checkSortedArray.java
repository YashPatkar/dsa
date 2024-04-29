class checkSortedArray {
    public static void main(String[] args) {  
        int a[] = {1,2,4,5,6,2};
        int condition = 1;
        for(int i = 1; i < a.length; i++)
        {
            if(a[i] < a[i - 1]){
                condition = 0;
                break;
            }
        }
        if(condition == 1)
        {
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
    }
}
