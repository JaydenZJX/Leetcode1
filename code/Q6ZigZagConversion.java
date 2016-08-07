/**
 *ZigZag Conversion
 *Zig length 2n-2 (n is row number)
 *每一次换行的时候先加第一个char
 *然后进行判断是不是第一个row 还是最后一个row
 *如果不是进行 j－(2n-2)-2i (j是行数 i是列数)
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0||s == "") return "";
        if(numRows==1) return s;

        StringBuilder builder = new StringBuilder();
        int zigsize=2*numRows-2;
        for(int i=0; i < numRows; i++){
            for(int j=i; j<s.length();j+=zigsize){
                builder.append(s.charAt(j));
                if(i != 0 && i != numRows-1){
                    int index=j+zigsize-2*i;
                    if(index <s.length())
                        {
                            builder.append(s.charAt(j+zigsize-2*i));
                        }
                }
            }
        }

        return builder.toString();
    }
}
