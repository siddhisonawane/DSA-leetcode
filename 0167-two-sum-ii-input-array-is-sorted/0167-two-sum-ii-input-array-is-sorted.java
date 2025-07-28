class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int lp=0;
        int rp=numbers.length-1;

        while(lp<rp){
            int sum=numbers[lp]+numbers[rp];
            if(sum==target){
                return new int[]{lp+1,rp+1};
            }
            else if(sum<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int[] numbers={2,7,11,15};
        int target=9;

        System.out.println(twoSum(numbers,target));
    }
}