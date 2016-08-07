

/**
 *
 *stack
 */

public class Solution{
    public int calculate(String s){
        Stack<Character> stack =  new Stack<>();
        int sign = 1;
        int acc = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)== '('){
                stack.push(acc);
                stack.push(sign);
                acc = 0;
                sing = 1;
            }else if(s.charAt(i) == ')'){
                acc = acc * stack.pop() + stack.pop();
            }else if(s.charAt(i) == '+'){
                sign = 1;
            }else if(s.charAt(i) == '-'){
                sign = -1;
            }else if(Character.isDigit(s.charAt(i))){
                int tmp = s.charAt(i) -'0';
                while(Character.isDigit(s.charAt(i+1)) && i < s.length()){
                    tmp = tmp * 10 + s.charAt(i+1)-'0';
                    i++;
                }
                acc = acc + tmp * sign;
            }
        }
        return acc;
    }
}
