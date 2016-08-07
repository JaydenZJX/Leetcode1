public class Solution{
    public int[][] generateMatrix(int n){
        int[][] matirx = new int[n][n];

        if(n == 0)
            return matirx;


        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n -1 ;
        int nums = 1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart; i <= colEnd; i++ ){
                matirx[rowStart][i] = nums++;
            }

            rowStart++;

            for(int i = rowStart; i <= rowEnd; i++ ){
                matirx[i][colEnd] = nums++;
            }
            colEnd--;

            for(int i =colEnd;i >= colStart; i--){
                if(rowStart <= rowEnd){
                    matirx[rowEnd][i] = nums++;
                }
            }
            rowEnd--;
            for(int i = rowEnd; i >= rowStart; i--){
                if(colStart <=colEnd){
                    matirx[i][colStart] = nums++;
                }
            }

            colStart++;
        }

        return matirx;
    }
}
