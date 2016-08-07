
import java.util.HashMap;


import java.util.Map;
/**
 *DFS
 *
 */
public class Solution{

    private HashMap<Integer,UndirectedGraphNode> map = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        return clone(node);
    }

    public UndirectedGraphNode clone(UndirectedGraphNode node){

        if(node == null ) return null;

        if(map.containsKey(node.label))
            return map.get(node.label);

        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(node.label, clone);
        for(UndirectedGraphNode neigbors: node.neighbors){
            clone.neighbors.add(clone(neigbors));
        }
        return clone;
    }
}
