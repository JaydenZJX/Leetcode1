/**
 *两个思路第一个是linklist FIFO;
 *第二个 backtracking;
 *****************************
 *FIFO 0(n^2) space O(n);
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        
        LinkedList<String> result = new LinkedList<>();
        if(digits.isEmpty()) return result;
        String [] string = new String[] {"0","1","abc","def","ghi","jkl","nmo","pqrs","tuv","wxyz"};//{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");//先加一个empty str 可以满足 base case 以满足 FIFO；

        for(int i=0;i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));//Character.getNumericValue
            while(result.peek().length()==i){ //每一个只只加一次，当每个node 当长度不等于 index i 说明已经进行完一次 permutation,
                String tmp= result.remove();
                for(char j : string[x].toCharArray()){
                    result.add(tmp+j);
                }
            }
        }
        return result;
    }
}
