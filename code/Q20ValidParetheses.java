/**
 *用stack 或者linklist 任何东西就可以；
 *只要是能储存然后任何清0 达到o(1) 的效果就好来（clear operation)
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();

        for(int i=0;i<s.length();i++){
            char tmp= s.charAt(i);
            if(tmp=='(' || tmp=='[' || tmp=='{') {stack.push(tmp);}

            else if(tmp==')' && !stack.isEmpty() && stack.peek()=='(')   stack.pop();

            else if(tmp==']' && !stack.isEmpty() && stack.peek()=='[')   stack.pop();

            else if(tmp=='}' && !stack.isEmpty() && stack.peek()=='{')   stack.pop();

            else return false; 


        }
        return stack.isEmpty();
    }
}
