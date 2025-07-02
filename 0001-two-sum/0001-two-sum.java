class Solution {
    public static int[] twoSum(int nums[], int target) {
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            for(int j=i+1;j<nums.length;j++){
               if(target==curr+nums[j]){
                  return new int[]{i, j};
               }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int nums[]={2,7,11,15};
        int target=9;
        twoSum(nums,target);
    }
}