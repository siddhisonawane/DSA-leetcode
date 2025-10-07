class Solution {
    public static int diagonalSum(int[][] mat) {
        int sum=0;

        for(int i=0;i<mat.length;i++){

            sum+=mat[i][i];

            if(i!=mat.length-i-1){
                sum+=mat[i][mat.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int mat[][]={{1,2,3}
                    ,{4,5,6},
                     {7,8,9}};

        System.out.println(diagonalSum(mat));
    }
}