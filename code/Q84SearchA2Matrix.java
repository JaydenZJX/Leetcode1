/**
 *
 */

public class Solution{
    public boolean searchMatirx(int[][] matirx, int target){
        int row_num = matirx.length;
        int col_num = matirx[0].length;

        int begin = 0, end = row_num * col_num - 1;

        while(begin <= end){
            int mid = (begin + end)/2;
            int mid_value = matirx[mid/col_num][mid % col_num];

            if(mid_value == target){
                return true;
            }else if(mid_value < target){
                begin = mid + 1;
            }else{
                end = begin - 1;
            }
        }

        return false;
    }
}
