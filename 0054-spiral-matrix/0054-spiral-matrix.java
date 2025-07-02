import java.util.*;
class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                result.add(matrix[startRow][j]);
            }
            for(int i=startRow+1;i<=endRow;i++){
                result.add(matrix[i][endCol]);   
                    
            }
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                result.add(matrix[endRow][j]);
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                result.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        List<Integer> spiral = spiralOrder(matrix);
        System.out.println(spiral);
    }
}