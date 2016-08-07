/**
 *back tracking
 */

public class Solution{
    public List<List<String>> solveNQueens(int n){
        boolean[]
            ocp90 = new boolean[n],
            ocp45 = new boolean[2 * n - 1],
            ocp135 = new boolean[2 * n - 1];

        List<List<String>> ans = new ArrayList<>();

        char[][] map = new char[n][n];

        for(char[] i: map) Arrays.fill(i,'.');

        BackTrack(0,n,ans,map,ocp90,ocp45,ocp135);

        return ans;
    }


    public void BackTrack(int depth,int n, List<List<String>> ans,char[][] map, boolean[] ocp90, boolean[] ocp45, boolean[] ocp135){

        if(depth == n){
            addAnswer(ans,map);
        }else{
            for(int i = 0; i < n; i++){
                if(!ocp90[i] && !ocp45[i + depth] && !ocp135[i - depth + n -1]){
                    // ocp135 i - depth + n - 1 是因为不想有负数出现，
                    ocp90[i] = true;
                    ocp45[i + depth] = true;
                    ocp135[i - depth + n -1] = true;
                    map[depth][i] = 'Q';
                    BackTrack(depth + 1,n,ans,map,ocp90,ocp45,ocp135);
                    ocp90[i] = false;
                    ocp45[i + depth] = false;
                    ocp135[i - depth + n -1] = false;
                    map[depth][i] = '.';
                }
            }
        }
    }

    public void addAnswer(List<List<String>> ans, char[][] map){
        List<String> cur = new ArrayList<String>();
        for(char[] i: map) cur.add(String.valueOf(i));
        ans.add(cur);
    }
}
