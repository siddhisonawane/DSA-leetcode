class Solution {
    public static boolean isPalindrome(int x) {
        int rem;
        int rev=0;
        int original=x;
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        return original==rev;
    }
    public static void main(String args[]){
        int x=121;

        System.out.println(isPalindrome(x));
        //isPalindrome();
    }
}