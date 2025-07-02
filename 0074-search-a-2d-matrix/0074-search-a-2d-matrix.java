class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
                if(target==matrix[row][col]){
                    return true;
                }
                else if(target>matrix[row][col]){
                    row++;
                }
                else{
                    col--;
                }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}};
        int target=3;

        System.out.println(searchMatrix(matrix,target));
    }
}