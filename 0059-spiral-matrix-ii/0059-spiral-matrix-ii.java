class Solution {
    public static int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;
        int num=1;

        while(num<=n*n){
            for(int j=startCol;j<=endCol;j++){
                    arr[startRow][j]=num++;
            }
           //right
            for(int i=startRow+1;i<=endRow;i++){
                    arr[i][endCol]=num++;
            }

            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                    arr[endRow][j]=num++;
            }

            //right
            for(int i=endRow-1;i>=startRow+1;i--){
                    arr[i][startCol]=num++;
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return arr;
        
    }
    public static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=3;
        int arr[][]=generateMatrix(n);
        printArr(arr);
    }
}