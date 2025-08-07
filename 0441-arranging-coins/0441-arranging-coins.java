class Solution {
    public static int arrangeCoins(int n) {
        int st=0;
        int end=n;
        int ans=0;

        while(st<=end){
            int mid=st+(end-st)/2;
            long coinsUsed = (long) mid * (mid + 1) / 2;

            if(coinsUsed==n){
                return mid;
            }
            else if(coinsUsed<n){
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return ans;
    }
}