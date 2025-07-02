class Solution {
    public static int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int left=1;
        int right=x/2;
        int result=0;

        while(left<=right){
            int mid= left+(right - left) / 2;
            long square = (long) mid * mid;

            
            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid;       
                left = mid + 1;     
            } else {
                right = mid - 1;    
            }
        }
        return result;
    }
    public static void main(String args[]){
        int x=4;
        System.out.println(mySqrt(x));
    }
}