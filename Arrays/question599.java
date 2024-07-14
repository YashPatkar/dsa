// Attemped array question: 599. Minimum Index Sum of Two Lists
// URL: https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/

class question599{
    public static void main(String s[])
    {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry", "Shogun"};
        String[] list3 = new Solution().findRestaurant(list1, list2);
        for(String i : list3)
        {
            System.out.println(i);
        }
    }
}

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        String s[] = new String[1];
        int sum = 0;
        int index = 0;
        int tag = 0;
        for(int i = 0; i < list1.length; i++)
        {
            for(int j = 0; j < list2.length; j++)
            {
                if(list1[i] == list2[j])
                {
                    if(i + j > sum)
                    {
                        sum = i + j;
                        index = i;
                    }
                    else if(i + j == sum)
                    {
                        sum = i + j;
                        s[tag] = list1[i];
                    }
                }
            }
        }
        s[tag] = list1[index];
        return s;
    }
}