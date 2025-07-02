class Solution {
    public static int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit1=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit1=Math.max(maxProfit1,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit1;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};

        System.out.print(maxProfit(prices));
    }
}