class Solution {
    public static int reverse(int x) {
        int rev=0;

        while(x!=0){
            int lastDigit=x%10;
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            rev=(rev*10)+lastDigit;
            x=x/10;
        }

        return rev;
    }
    public static void main(String args[]){
        int x=121;

        System.out.println(reverse(x));

    }
}