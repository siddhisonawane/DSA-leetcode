class Solution {
    public static int countNegatives(int[][] grid) {
        int numberCount=0;

        for(int i=grid.length-1;i>=0;i--){
            for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j]<0){
                    numberCount++;
                }
            }
        }

        return numberCount;
    }
    public static void main(String args[]){
        int grid[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.out.print(countNegatives(grid));
    }
}