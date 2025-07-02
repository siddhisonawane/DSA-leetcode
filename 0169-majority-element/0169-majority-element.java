public class Solution {
    public static int majorityElement(int[] nums) {
        int majorityNUM=Integer.MIN_VALUE;
        int maxElement=nums[0];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(majorityNUM<count){
                majorityNUM=count;
                maxElement=nums[i];
            }
        }
        return maxElement;
    }
    public static void main(String args[]){
        int nums[]={3,2,3};
        System.out.println(majorityElement(nums));
    } 
}
