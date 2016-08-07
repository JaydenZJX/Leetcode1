/**
 *
 * converse the digites to A-Z;
 */
public class Solution{
    public String convertToTitle(int n){
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0,(char)('A'+ n%26));
            n/=26;
        }

        return result.toString();
    }
}
/**
return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
