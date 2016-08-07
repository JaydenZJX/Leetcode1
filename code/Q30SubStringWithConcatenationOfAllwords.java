
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 *
 */

public class Solution{
    public List<Integer> findSubstring(String s, String[] words){
        int lengthPerkey = words[0].length();
        int numberOfWords = words.length;

        HashMap<String,Integer> map = new HashMap<String, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(String str: words){
            if(map.containsKey(str))
                map.put(str,1 + map.get(str));
            else
                map.put(str,1);
        }


        for(int i = 0; i <= s.length() - (numberOfWords * lengthPerkey); i++){
            int j = 0;
            int st = i;
            HashMap<String, Integer> wordsCount = new HashMap<>(map);

            for(j = 0; j < numberOfWords; j++){
                if(s.length() - st < (numberOfWords - j) * lengthPerkey) break;

                String sub = s.substring(st, st+lengthPerkey);

                if(wordsCount.containsKey(sub)){
                    int time = wordsCount.get(sub);
                    if(time == 1) wordsCount.remove(sub);
                    else wordsCount.put(sub, time - 1);
                }else break;

                st += lengthPerkey;
            }
            if(j == numberOfWords){
                result.add(i);
            }
        }

            return result;
        }
}
