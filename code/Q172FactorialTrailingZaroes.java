/**
 *1.最直接的方法是先求出 n! 设置一个计数器，然后用结果 mod 一下
 * 如果是10 计数器加一 反之就break loop，然后n！／10.一直到 mod ！＝ 0
 * return count;可能会time limit ；
 */


public class Solution{
    public int trailingZeroes(int n){
        int result= fac(n);

        int count=0;

        while(result >0){
            tmp= result %10;
            if(tmp == 0){
                count++;
                result=result/10;
            }else{
                break;
            }
        }
        return count;
    }

    private int fac(int n){
        if(n==1) return 1;

        return n*fac(n-1);
    }
}
//*************
/**
 *对任意一个正整数n进行质因数分解，n=2x∗3y∗5z...n = 2^x*3^y*5^z...n=2​x​​∗3​y​​∗5​z​​... ，
 *末尾0的个数M与2和5的个数即X、Z有关，每一对2和5都可以得到10，故M=min(X,Z)。又因为能被2
 *整除的数出现的频率要比能被5整除的数出现的频率高，所以M=Z。所以只要计算出Z，就可以得到n!的
 *末尾*0的个数。
 */
public class Solution{
    public int trailingZeroes(int n){
        int cnt=0;

        for(int i=1; i<= n; i++){
            int j=i;
            while( j % 5 == 0){
                result++;
                j/=5;
            }
        }
        return result;
    }
}
/**
 *针对第二种优化；
 *可以用公式计算出末尾0的个数，
 *Z=N/5+N/52+N/53+...Z=N/5 + N/5^2 + N/5^3 + ...Z=N/5+N/5​2​​+N/5​3​​+... ，N/5N/5N/5
 *表示从1到N中能被5整除的数的个数，由于每个数都能贡献一个5，意味着能贡献一个0。
 *.N/5^​2​​ 表示从1到N中能被5^2 整除的数的个数，每个数都能贡献2个5，
 *意味着能贡献两个0，不过由于其中一次已经包含在 N/5N/5N/5 中了，只能再贡献一个0，依次类推。
 */
public class Solution{
    public int trailingZeroes(int n){
        int result =0;
        while (n> 0){
            n/=5;
            result+=n;
        }
        return result
    }
}

public class Solution{
    public int trailingZeroes(int n){
        return n<=0 ? 0: n/5 + trailingZeroes(n/5);
    }
}
