class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    public static int findFirst(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int result=-1;

        while(left<=right){
            int mid=left + (right - left) / 2;
            if(nums[mid]==target){
                result=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }
    public static int findLast(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int result=-1;

        while(left<=right){
            int mid=left + (right - left) / 2;
            if(nums[mid]==target){
                result=mid;
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int nums[]={5,7,7,8,8,10};
        int target=8;
        System.out.println(findFirst(nums,target));
        System.out.println(findLast(nums,target));
        System.out.println(searchRange(nums,target));
    }
}