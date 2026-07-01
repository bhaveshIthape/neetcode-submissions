class MyQueue {

    Stack<Integer> stack;
    Stack<Integer> helpStack;

    public MyQueue() {
        this.stack = new Stack<>();
        this.helpStack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if (!helpStack.isEmpty()) {
            return helpStack.pop();
        } else {
            while (!stack.isEmpty()) {
                helpStack.push(stack.pop());
            }
            if (!helpStack.isEmpty()) {
                return helpStack.pop();
            }
        }
        return 0;
    }
    
    public int peek() {
        if (!helpStack.isEmpty()) {
            return helpStack.peek();
        } else {
            while (!stack.isEmpty()) {
                helpStack.push(stack.pop());
            }
            if (!helpStack.isEmpty()) {
                return helpStack.peek();
            }
        }
        return 0;
    }
    
    public boolean empty() {
        return (stack.isEmpty() && helpStack.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */