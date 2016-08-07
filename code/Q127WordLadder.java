/**
 *Dijkstra's algo
 *BF*
 */
public class ladderLength(String start, String end, Set<String> wordList){
    Queue<String> queue = new LinkedList<String>();

    queue.add(start);
    queue.add(null);

    Set<String> visited = new HashSet<String>();

    int distance =1;

    while(!queue.isEmpty()){
        String str = queue.poll();

        if(str != null){
            for(int i=0;i<str.length();i++){
                char[] chars = str.toCharArray();

                for(char c='a'; c<= 'z';c++){
                    chars[i]= c;
                    String word = new String(chars);

                    if(word.equals(end)) return distance+1;

                    if(wordList.contains(word) && !visited.contains(word)){
                        queue.add(word);
                        visited.add(word);
                    }
                }
            }
        }else{
            distance++;

            if(!queue.isEmpty()){
                queue.add(null);
            }
        }
        return 0;
    }
}
//********
public class Solution{
    public int ladderLength(String beginWord,String endWord, Set<String> wordList){
        set<String> reached = new HashSet<String>();

        reached.add(beginWord);
.add(endWord);
        int distance =1;
        while(!reached.contains(endWord)){
            Set<String> toAdd = new HashSet<String>();
            for(String each : reached){
                for(int i=0;i<each.length(); i++){
                    char [ ] chars =each.toCharArray();

                    for(char ch='a', ch<='z'; ch++){
                        chars[i]= ch;
                        String word= new String(chars);
                        if(wordList.contains(word)){
                            toAdd.add(word);
                            wordList.remove(word);
                        }
                    }
                }
            }
            distance++;
            if(toAdd.size()==0) return 0;
            reached= toAdd;
        }
        return distance;
    }
}
