

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 *hashset;
 *
 */

public class Solution{
    public List<String> findRepeatedDnaSequences(String s){
        Set seen = new HashSet(), ans = new HashSet();

        for(int i = 0; i+9 <s.length(); i++){

            String  ten = s.substring(i, i+10);

            if(!seen.add(ten)){
                ans.add(ten);
            }
        }
        return new ArrayList(ans);
    }
}
