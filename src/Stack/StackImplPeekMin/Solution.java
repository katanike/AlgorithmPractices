package Stack.StackImplPeekMin;

import java.util.Stack;


/**
 * My solution
 */
public class Solution {

    private int minNode;
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        if(stack.empty() || node < minNode){
            minNode = node;
            minStack.push(node);
        }
        stack.push(node);
    }

    public void pop() {
        if(stack.pop() == minStack.peek())
            minStack.pop();
    }

    public int top() {
        return stack.peek().intValue();
    }

    public int min() {
        return minStack.peek().intValue();
    }
}