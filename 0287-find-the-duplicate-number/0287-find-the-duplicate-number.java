import java.util.*;
class Solution {
    public static int findDuplicate(int[] nums) {
       HashSet<Integer>set=new HashSet<>();

       for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(set.contains(num)){
                return num;
            }
            else{
                set.add(num);
            }
       }
       return -1;
    }
    public static void main(String args[]){
        int nums[]={1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }

}