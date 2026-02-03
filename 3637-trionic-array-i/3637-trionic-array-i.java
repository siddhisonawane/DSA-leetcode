class Solution {
    public static boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) {
            return false; 
        }

        int i = 0;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0){
            return false;
        }
     
        int p = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == p) {
            return false;
        }

        int q = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == q){
            return false;
        }

        return i == n - 1;
    }

    public static void main(String args[]) {
        int nums[]={1,3,5,4,2,6};
        System.out.println(isTrionic(nums));
    }
}
