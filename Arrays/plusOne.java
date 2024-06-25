class plusOne{ 
    public int[] solve(int[] digits) {
        if(digits[digits.length - 1] != 9)
        {
            digits[digits.length - 1] += 1;
            return digits;
        }
        else
        {
            String temp_string = "";
            for (int i = 0; i < digits.length; i++) {
                temp_string = temp_string + Integer.toString(digits[i]);
            }
            int convert_int = Integer.parseInt(temp_string);
            convert_int = convert_int + 1;
            String temp2_string = Integer.toString(convert_int);
            int temp_array[] = new int[temp2_string.length()];
            for(int i = 0; i < temp2_string.length(); i++)
            {      char convert = temp2_string.charAt(i);
                int convert2 = Character.getNumericValue(convert);
                temp_array[i] = convert2;
            }
            return temp_array;
        }
    }
    public static void main(String[] args) {
        plusOne p = new plusOne();
        int a[] = {1,2,3,4,5,6,7,8,8};
        p.solve(a);
      //  System.out.println(p.solve(a));
    }
}