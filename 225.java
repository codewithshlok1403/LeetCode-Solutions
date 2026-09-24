class MyStack {
    Queue<Integer> qu = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        qu.add(x);
    }

    public int pop() {
        for (int i = 1; i <= qu.size() - 1; i++) {
            qu.add(qu.remove());
        }
        return qu.remove();

    }

    public int top() {
        for (int i = 1; i <= qu.size() - 1; i++) {
            qu.add(qu.remove());
        }
        int top = qu.peek();
        qu.add(qu.remove());
        return top;
    }

    public boolean empty() {
        return qu.size() == 0;
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
