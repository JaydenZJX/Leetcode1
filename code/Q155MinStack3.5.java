/**
 *
 */
import java.util.Stack;
public class MinStack {
    private Stack<Integer> stack;
    private int min=Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        stack= new Stack<>();
    }

    public void push(int x) {
        if(x<=min){
            stack.push(min);
            min=x;
        }
        stack.push(x);

    }

    public void pop() {
        if(stack.peek()==min){
            stack.pop();
            min=stack.peek();
            stack.pop();
        }else{
            stack.pop();
        }
        if(stack.empty()){
            min=Integer.MAX_VALUE;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
