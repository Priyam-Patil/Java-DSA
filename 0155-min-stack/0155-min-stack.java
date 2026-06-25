import java.util.*;

// Question:
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
// Implement the MinStack class:
// push(val) -> pushes value onto the stack
// pop() -> removes the top element
// top() -> returns the top element
// getMin() -> returns the minimum element in the stack

class MinStack {

    // Pair stores the actual value and the minimum value till that point
    static class Pair {
        int val;
        int minimum;

        Pair(int val, int minimum) {
            this.val = val;
            this.minimum = minimum;
        }
    }

    Stack<Pair> s;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int value) {
        if (s.isEmpty()) {
            // First element: value and minimum are same
            s.push(new Pair(value, value));
        } else {
            // Store current value and minimum till now
            int getMin = Math.min(value, s.peek().minimum);
            s.push(new Pair(value, getMin));
        }
    }
    
    public void pop() {
        // Remove the top pair
        s.pop();
    }
    
    public int top() {
        // Return only the actual top value
        return s.peek().val;
    }
    
    public int getMin() {
        // Return the current minimum stored in the top pair
        return s.peek().minimum;
    }
}