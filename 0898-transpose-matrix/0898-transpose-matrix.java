class Solution {
    public static int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transposed[j][i]=matrix[i][j];
            }
        }

        return transposed;
    }
    public static void main(String args[]){
        int matrix[][]={{2,4,-1},{-10,5,11},{18,-7,6}};

        transpose(matrix);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}