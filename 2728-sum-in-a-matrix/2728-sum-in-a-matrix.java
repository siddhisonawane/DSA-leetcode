import java.util.*;
class Solution {
    public static int matrixSum(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        int score=0;

        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }

        for(int col=m-1;col>=0;col--){
            int maxCol=0;
            for(int row=0;row<n;row++){
                maxCol=Math.max(maxCol,nums[row][col]);
            }
            score+=maxCol;
        }

        return score;
    }
    public static void main(String args[]){
        int nums[][]={{7,2,1},
                    {6,4,2},
                    {6,5,3},
                    {3,2,1}};

        System.out.println(matrixSum(nums)); 
    }
}