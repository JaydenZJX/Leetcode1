
import java.util.Stack;


/**
 *
 */
class MyQueue{
    Stack<Integer> queue = new Stack<>();
    public void push(int x){
        Stack<Integer> tmp = new Stack<Integer>();

        while(!queue.empty()){
            tmp.push(queue.pop());
        }

        tmp.push(x);

        while(!tmp.empty()){
            queue.push(tmp.pop());
        }
    }

    public void pop(){
        queue.pop();
    }

    public int peek(){
       return queue.peek();
    }

    public boolean empty(){
        return queue.empty();
    }
}
