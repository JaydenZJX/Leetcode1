/**
 **
 */

public class Solution{
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans= new List<Integer>();

        if(matrix.length==0) return ans;

        int rowBegin =0;
        int rowEnd =matrix.length-1;
        int colBegin = 0;
        int colEnd =matrix[0].length-1;


        while(rowBegin <=rowEnd && colBegin <= colEnd){

            for(int i=colBegin i<=colEnd;i++){
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i= rowBegin;j<=rowEnd;i++){
                ans.add(matrix[j][colEnd]);
            }

            colEnd--;

            if(rowBegin <= rowEnd){

                for(int j = colEnd;j>=colBegin; j--){
                    ans.add(matrix[rowEnd][j]);
                }
            }

            rowEnd--;

            if(colBegin <= colEnd){

                for(int j= rowEnd; j>=rowBegin;j--){
                    ans.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }
        return ans
    }
}
