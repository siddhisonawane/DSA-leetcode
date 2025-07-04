class Solution {
    public static int maxArea(int[] height) {
        int maxWater=0;
        int lp=0;
        int rp=height.length-1;

        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int wd=rp-lp;
            int currWater=ht*wd;
            maxWater=Math.max(maxWater,currWater);

            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        int height[]={1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}