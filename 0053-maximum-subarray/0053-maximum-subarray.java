class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<nums.length;i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int nums[]={-2,1,-3,4,-1,2,-5,4};
        System.out.println(maxSubArray(nums));
    }
}