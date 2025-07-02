class Solution {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;

        if(m*n != r*c){
            return mat;
        }

        int arr[][]=new int[r][c];
        int row=0,col=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[row][col]=mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }

        return arr;
    }
    public static void main(String args[]){
        int mat[][]={{1,2},
                     {3,4}};
        int r=1;
        int c=4;

        System.out.println(matrixReshape(mat,r,c));
    }
}