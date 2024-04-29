//Q: Given an array A consisting of integers. Return first value that is repeating in array. If no value is being repeated, return-1

public class firstRepetedValue {
    public static void main(String[] args) {
        int a[] = {1,5,3,4,6,7,9};
        int condition = 0;
        int temp = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    condition = 1;
                    temp = a[j];
                    System.out.println("First duplicated value: "+temp);
                    break;
                }
            }
            if(condition == 1){
                break;
            }
        }
        if(condition == 0)
        {
            System.out.println(-1);
        }
    }   
}