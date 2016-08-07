public class Solution{
    public int compareVersion(String version1, String version2){
        String[] levels1= version1.split("\\.");
        String[] levels2= version2.split("\\.");

        int len = Math.max(levels1.length, levels2.length);
        int len1 =levels1.length;
        int len2 = levels2.length;
        for(int i =0;i < len; i++){
            Integer v1 = i< len1? Integer.parseInt(levels1[i]) : 0;

            Integer v2 = i<len2? Integer.parseInt(levels2[i]) :0;
            
            int tmp=v1.compareTo(v2);
            if(tmp != 0)
                return tmp;
        }

        return 0;
    }
}

/////whitout split

public class Solution{
    public int compareVersion(String version1, String version2){
        int tmp1=0, tmp2=0;

        int len1=version1.length(), len2= version2.length();
        int i=0,j=0;

        while(i<len1 || j< len2){
            tmp1=0;
            tmp2=0;

            while(i<len1 && version1.charAt(i)!='.'){
                tmp1= tmp1*10+version1.charAt(i++)-'0';

            }

            while(j<len2 && version2.charAt(j)!='.'){
                tmp2＝tmp2*10+version2.charAt(j++)-'0';
            }

            if(tmp1>tmp2) return 1;
            else if(tmp1<tmp2) return -1;
            else{
                i++;
                j++;
            }
        }
        return 0;
    }
}
