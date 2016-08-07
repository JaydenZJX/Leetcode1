/**

import java.util.Iterator;

 *
 */
public class Solution{
    public List<String> wordBreak(String s,Set<String> wordDict){
        List<String> result = new ArrayList<String>();
        for(int j=s.length()-1;j >=0; j--){
            if(wordDict.contains(s.substring(j)))
                break;
            else{
                if(j==0)
                    return result;
            }
        }
        for(int i = 0; i<s.length()-1;i++){
            if(wordDict.contains(s.substring(0, i+1))){
                List<String> strs = wordBreak(s.substring(i+1,s.length()),wordDict);
                if(strs.size() != 0){
                    for(Iterator<String> it = strs.iterator();it.hasNext();){
                        result.add(s.substring(0,i+1)+" "+it.next());
                    }
                }
            }
        }
        if(wordDict.contains(s)) result.add(s);
        return result;
    }
}
