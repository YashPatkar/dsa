//Q:count the no. of occurance of particular element x
import java.util.*;
public class countEle {
    public static void main(String[] args) {
        int a[] = {5,6,5,1,5};
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ele to count its occurance:");
        int ele = sc.nextInt();
        for(int i : a){
            if(i == ele){
                total += 1;
            }
        }
        System.out.println("Total no. of occurance of "+ele+" is: " + total);
    }
}
