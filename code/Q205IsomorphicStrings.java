

import java.util.HashMap;
import java.util.Map;

/**
 *hash map 映射；
 * array int[256];
 */
public class Solution{
    public boolean isIsomorphic(String s, String t){
        Map<Character,Character> map  = new HashMap<Character,Character>();

        for(int i= 0; i < s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a)){
                if(map.get(a).equals(b))
                    continue;
                else
                    return false;
            }else{
                if(!map.containsValue(b))
                    map.put(a,b);
                else
                    return false;
            }
        }
        return false;
    }
}
