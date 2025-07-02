class Solution {
    public static int search(int[] nums, int target) {
        int index=searchInArray(nums,target,0,nums.length-1);

        return index;
    }
    public static int searchInArray(int nums[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(nums[mid]==target){
            return mid;
        }

        if(nums[si]<=nums[mid]){
            if(nums[si]<=target && target<=nums[mid]){
                return searchInArray(nums,target,si,mid-1);
            }
            else{
                return searchInArray(nums,target,mid+1,ei);
            }
        }
        else{
            if(nums[mid]<=target && nums[ei]>=target){
                return searchInArray(nums,target,mid+1,ei);
            }
            else{
                  return searchInArray(nums,target,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int target=0;

        System.out.println(search(nums,target));
    }
}