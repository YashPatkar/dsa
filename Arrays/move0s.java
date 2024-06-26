class move0s{
    public void solve(int[] nums) {
        int zeros = 0;
        for(int i : nums)
        {
            if(i == 0)
            {
                zeros++;
            }
        }
        int index = nums.length - 1;
        for(int i = 0; i <= zeros; i++)
        {
            
        }
    }
    public static void main(String[] args) {
        move0s a = new move0s();
        a.solve({0,1,0,3,12});
    }
}