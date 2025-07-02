class Solution {
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastSqr(x,N);
    }
    public static double fastSqr(double x,long n){
        if(n==0){
            return 1;
        }
        double halfPower=fastSqr(x,n/2);

        if(n%2==0){
            return halfPower*halfPower;
        }
        else{
            return halfPower*halfPower*x;
        }
    }
    public static void main(String args[]){
        System.out.println(myPow(2,10));   
    }
}