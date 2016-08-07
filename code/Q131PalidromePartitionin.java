
/**
 *backTracking
 */
public class Solution{
    public List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<List<String>>();

        if(s.length() == 0)
            return ans;

        backTrack(s, ans, new ArrayList<String>());

        return ans;
    }

    public void backTrack(String s, ArrayList<List<String>> ans, ArrayList<String> tmp){
        if(0 == s.length()){
            ans.add(new ArrayList<String>(tmp));
            return;
        }

        for(int i = 0; i < s.length(); i++){
            if(isPalidrom?(s.sunstring(0,i+1))){
                tmp.add(s.substring(0,i+1));
                backTrack(s.subSequence(i+1), ans, tmp);
                tmp.remove(tmp.size()-1);
            }
        }
    }
    public boolean isPalidrom?(String s){
        for(int i = 0; i < s.length() / 2; i ++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }

        return true;
    }
}
