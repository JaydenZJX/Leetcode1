
/**
 *
 */

public class Solution{
    public void setZeroes(int[][] matrix){
        int col0 = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0) col0 = 0;

            for(int j= 1; j < cols; j++){
                //从1开始应为 上面的col0 已经kao
                //考虑到了为第一列的因素
                //应为第一行只要出现一个0
                //那么整行就要重置为0；
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }

        for(int i = rows - 1; i >= 0;i--){
            for(int j =cols - 1 ; j >=1 ; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if(col0 == 0) matrix[i][0]=0;
        }
    }
}
