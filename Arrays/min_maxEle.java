//Q: find min and max element from array
public class min_maxEle {
    public static void main(String[] args) {
        int a[] = {-3,1,2,3,7,-1,4,5,0,6,8,-6,-10,0,92,12,100,29};
        int min = a[0];
        int max = a[0];
        for(int i : a)
        {
            if(min > i)
            {
                min = i;
            }
            else if(max < i){
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }    
}
