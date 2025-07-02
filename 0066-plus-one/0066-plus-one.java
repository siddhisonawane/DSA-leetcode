class Solution {
    public static int[] plusOne(int[] digits)
    {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int Newarr[]=new int[digits.length+1];
        Newarr[0]=1;
        return Newarr;

    }
    public static void main(String args[])
    {
        int digits[]={1,2,3};
        int[] result=plusOne(digits);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
