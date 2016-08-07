/**

import java.util.HashMap;
 * 主要是
 *
 */

public class Solution{
    public String fractionToDecimal(int numerator, int denominator){
        StringBuilder str = new StringBuilder();

        if(numerator == 0){
            return "0";
        }

        str.append(((numerator < 0)^(denominator < 0)) ? "-":"");


        long num = Math.abs((long)numerator);
        long deno = Math.abs((long) denominator);

        str.append((num / deno));

        num%= deno;
        if(num == 0){
            return str.toString();
        }
        str.append(".");
        HashMap<Long,Integer> map = new HashMap<>();
        map.put(num, str.length());

        while(num != 0){
            num = num *10;//理解主要概念这个；

            str.append(num/deno);

            num%= deno;

            if(map.containsKey(num)){
                int index = map.get(num);
                str.insert(index,"(");
                str.append(")");
                break;
            }
            else{
                map.put(num,str.length());
            }
        }

        return str.toString();
    }
}
