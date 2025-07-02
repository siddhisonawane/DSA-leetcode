// class Solution {
//     public static int singleNumber(int[] nums){
//         int result=0;
//         for (int i=0;i<nums.length;i++) {
//             result ^= nums[i];
//         }
//         return result;
//     }
//     public static void main(String args[]){
//         int nums[]={2,2,1};

//         System.out.println(singleNumber(nums));
//     }
// }
class Solution{
    public static int singleNumber(int[] nums){
        int sum=Integer.MAX_VALUE;
        int currMIN=nums[0];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(sum>count){
                sum=count;
                currMIN=nums[i];
            }
        }
        return currMIN;
    }
    public static void main(String args[]){
        int nums[]={2,2,1};

        System.out.println(singleNumber(nums));
    }
}