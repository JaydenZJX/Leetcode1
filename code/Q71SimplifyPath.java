
import java.util.Stack;


/**
 *
 *Stack
 *用 isEqual 不要用 ＝＝ 去比较一个 string 容易出错
 */

public class Solution{
    public String simplifyPath(String path){
        Stack<String> stack = new Stack<>();

        String[] p = path.split("/");

        for(String i:p){
            if(!stack.isEmpty() && i.equals(".."))
                stack.pop();
            else if(!i.equals(".") && !i.equals("") && !i.equals(".."))
                stack.push(i);
        }

        List<String> list = new ArrayList<>(stack);

        return "/"+String.join("/", list);
    }
}
