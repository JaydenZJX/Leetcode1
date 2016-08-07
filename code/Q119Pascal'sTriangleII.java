

/**
 *
 *ArrayList
 */

public class Solution{
    public List<Integer> getRow(int rowIndex){
        List<Integer> arrlist = new ArrayList<Integer>();

        for(int i = 0; i < rowIndex + 1; i++){
            arrlist.add(1);
            for(int j = i - 1; j > 0; j--){
                arrlist.set(j,arrlist.get(j-1)+arrlist.get(j));
            }
        }

        return arrlist;
    }
}
