/*
Question: Search the given element x in the array. If present then return the index else return -1.
*/
import java.util.Scanner;
public class findEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Element: ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        System.out.print("ENter What to Search: ");
        int src = sc.nextInt();
        
        int condition = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == src){
                System.out.println("Index of element "+arr[i]+" is " + i);
                condition = 1;
                break;
            }
        }
        if(condition == -1)
        {
            System.out.println("Output: "+condition);
        }
    }
}
