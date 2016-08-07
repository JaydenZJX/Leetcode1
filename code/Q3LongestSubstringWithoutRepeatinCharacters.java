/*
 *basic ideal hash map
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            {return 0;}
        HashMap <Character,Integer> map= new HashMap< >();
        int count=0;
        int longest=0;

        for(int index=0;index<s.length();index++)
            {
                if(map.containsKey(s.charAt(index)))
                    {
                        count=Math.max(count,map.get(s.charAt(index))+1);
                        //if use longer instant of count, which will fail some case
                        //like "dvdf" cause when we put second char d which can not
                        //compare withe the count with longer, there are point
                        //two different direction.
                    }
                map.put(s.charAt(index),index);
                longest=Math.max(longest,index-count+1);
            }
        return longest;
    }
}
