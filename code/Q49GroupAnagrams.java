/**
 *Group Anagrams
 *
 *String.valueOf()
 *string.toCharArray();
 *list (asdfasd,adfasd,adfasdf,asdf)
 */

public class Solution{
    public List< List <String>> groupAnagrams(String[] strs){
        if(strs == null || strs.length()== 0) return null;

        HashMap<String,List<String>> map = new HashMap<>();

        for(int i= 0; i < strs.length;i++){
            char[] c = strs[i].toCharArray();//拿出第一个String
            Arrays.sort(c);//排列好
            String key = String.valueOf(c); //{a,b,c,d}=>abcd
            List<String> value = map.get(key);//在map；里面寻找那个list
            if(value == null){//如果不在
                value = new ArrayList<String>();// 创造新的
            }
            value.add(strs[i]);//加入进分类list
            map.put(key,value);// 加入 key value
        }

        List<List<String>> ret = new ArrayList<>();

        for(String keys : map.keySet()){
            List<String> tmp = map.get(keys);
            Collections.sort(tmp);//有序排列
            ret.add(tmp)
        }

        return ret;// 返回list of list tring; (arraylist)
    }
}

