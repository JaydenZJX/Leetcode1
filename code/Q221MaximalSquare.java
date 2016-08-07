
/**
 *dp
 */

public class Solution{
    public int maximalSquare(char[][] matrix){
        if(matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;

        int[][] bp = new int[m+1][n+1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(matrix[i-1][j-1] =='1'){
                    bp[i][j] = Math.min(Math.min(bp[i-1][j-1], bp[i][j-1]),bp[i-1][j])+1;
                    result = Math.max(result, bp[i][j]);
                }
            }
        }



        return result * result;
    }
}
