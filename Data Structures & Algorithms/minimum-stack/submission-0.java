class MinStack {

    List<Integer> stack;

    public MinStack() {
        this.stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
        }
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int n: stack) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}
