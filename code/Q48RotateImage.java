/**
 *iteration
 */

public class Solution{
    public void rotate(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int tmp=0;

                tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int tmp = 0;

                tmp= matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=tmp;
            }
        }
    }
}
