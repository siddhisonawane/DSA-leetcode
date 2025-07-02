class Solution {
    public static void rotate(int[][] matrix) {
       int n=matrix.length;
       for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
          }
       }


       for(int i=0;i<n;i++){
            int left=0,rigth=n-1;
            while(left<rigth){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][rigth];
                matrix[i][rigth]=temp;
                left++;
                rigth--;
            }
       }
    }

    public static void printArr(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}}; 
        rotate(matrix);
        printArr(matrix);
    }
}