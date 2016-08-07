
import java.util.HashSet;
import java.util.Set;


public class Solution{
    public String reverseVowels(String s){
        int left = 0;
        int right = s.length()-1;
        Set<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char[] ch = s.toCharArray();

        while(left < right){
            while (left < right && !set.contains(s.charAt(left)))
                left++;
            while(left < right && !set.contains(s.charAt(right)))
                  right--;

            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right]= tmp;

            left++;
            right--;
        }

        return new String(ch);
        //new String(ch);
    }
}
