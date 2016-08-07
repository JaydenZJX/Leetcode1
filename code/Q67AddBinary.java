/**
 *1. interstion string
 *2. StringBuilder
 *   2.1 a.charAt(i) - '0' return the value of digit which is
 *       what you looking for;
 */

public class Solution{
    public String addBinary(String a, String b){
        int lenA=a.length();
        int lenB=b.length();

        int carry = 0;
        String res = "";
        int i =0;
        while( i < lenA || i< lenB){
            int p = i < lenA ? a.charAt(lenA -1 -i)-'0':0;
            int q = i < lenB ? b.charAt(lenB -1 -i)-'0':0;
            int tmp = q +p + carry;
            res = tmp%2+res;
            carry = tmp/2;
            i++;
        }
        return carry==0? res : "1"+res;
    }
}

public class Solution{
    public String addBinary(String a, String b){
        if(a == null) return b;
        if(b == null) return a;


        int lenA=a.length-1;
        int lenB=b.length-1;

        StringBuilder result = new StringBuilder();
        boolean carry = false;
        while(lenB > -1 || lenA > -1){
            char c1 = lenA>-1? a.charAt(lenA) : 0;
            char c2 = lenB>-1? b.charAt(lenB) : 0;
            if (c1 =='1' && c2=='1'){
                if(carry){
                    result.append(1);
                }else{
                    result.append(0);
                }
                carry= true;
            }else if(c1 =='1' || c2 == '1'){
                if(carry){
                    result.append(0);
                    carry=true;
                }else{
                    result.append(1);
                    carry=false;
                }
            }else{
                if(carry) result.append(1);
                else result.append(0);
            }
            lenB--;
            lenA--;
        }
        if(carry) result.append(1);
        return result.reverse().toString();
    }
}
