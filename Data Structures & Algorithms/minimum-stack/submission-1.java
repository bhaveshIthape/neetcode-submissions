class MinStack {

    List<Integer> stack;
    List<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        int min = Math.min(val, minStack.isEmpty() ? val : minStack.get(minStack.size() - 1));
        minStack.add(min);
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
        }
        if (!minStack.isEmpty()) {
            minStack.remove(minStack.size() - 1);
        }
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
