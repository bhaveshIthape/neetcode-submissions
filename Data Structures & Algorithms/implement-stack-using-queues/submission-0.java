class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        this.queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        int n = queue.size();
        for (int i = 0; i < n-1; i++) {
            queue.offer(queue.poll());
        }
        return queue.poll();
    }
    
    public int top() {
        return ((LinkedList<Integer>) queue).getLast(); 
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }


}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */