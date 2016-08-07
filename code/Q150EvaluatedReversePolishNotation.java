/**
 *polish notation
 *stack;
 */

public class Solution{
    public int evalRPN(String[] tokens){
        int a ,b;
        Stack<Integer> s = new Stack<>();
        for(String i : tokens){
            if(i.equals("+")){

                s.push(s.pop()+s.pop());

            }else if(i.equals("-")){
                a=s.pop();
                b=s.pop();
                s.push(b-a);

            }else if(i.equals("*")){

                s.push(s.pop() * s.pop());
            }else if(i.equals("/")){
                a=s.pop();
                b=s.pop();
                s.push(b/a);

            }else{

                s.push(Integer.parseInt(i));
            }
        }
        return s.pop();
    }
}
