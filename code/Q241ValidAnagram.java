public class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int[] result = new int[26];

        for(int i=0; i< s.length();i++){
            result[s.charAt(i)-'a']++;
            result[s.charAt(i)-'a']--;
        }


        for(int i : result){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
