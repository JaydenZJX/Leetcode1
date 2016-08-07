/**
 *regx
 *flage
 */
public boolean isNumber(String s){
    s=s.trim();

    boolean pointSeen = false;
    boolean eSeen = false;
    boolean numberSeen = false;
    boolean numberAfterE = true;

    for(int i=0; i<s.length();i++){
        if('0' <= s.charAt(i) && s.charAt(i)<='9'){
            numberSeen =true;
            numberAfterE=true;
        }else if(s.charAt(i)=='.'){
            if(eSeen || pointSeen){
                return false;
            }
            pointSeen = true;
        }else if(s.charAt(i)=='e'){
            if(eSeen||!numberSeen){
                return false;
            }
            numberAfterE=false;
            eSeen=true;
        }else if(s.charAt(i)=='-'|| s.charAt(i)=='+'){
            if(i != 0 && s.charAt(i-1)!='e'){
                return false;
            }
        }else{
            return false;
        }
    }
    return numberSeen && numberAfterE;
}

public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.length() == 0)
            return false;
        if (s.matches("[+-]?(([0-9]*\\.?[0-9]+)|([0-9]+\\.?[0-9]*))([eE][+-]?[0-9]+)?"))
            return true;
        else
            return false;


    }
}
