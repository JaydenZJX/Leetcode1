/**
 *question7 Reverse Integer
 *跟第二题的linklist reverse value 是一样的 用％ 和／ 去一个一个取数字
 *base 都是10 s
 */
public class Solution {
    public int reverse (int x){
        int reverse=0;
        while (x != 0){
            int remaind= x % 10;
            int newreverse= reverse*10+remaind;
            x= x % 10;
            if((newreverse-remaind)/10 != reverse)
                {
                    System.out.println("the value is too big therefor the int tye canot hold");
                    return 0;
                }
            reverse=newreverse;
        }
        return reverse;
    }
}
