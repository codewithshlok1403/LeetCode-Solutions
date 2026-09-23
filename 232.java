class MyQueue {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> help=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    public int pop() { 
        while(st.size()>1){
            help.push(st.pop());
        }
            int del=st.pop();
        
        while(help.size()>0){
                st.push(help.pop());
            }
            return del;

        
    }
    
    public int peek() {
        Stack<Integer> help=new Stack<>();
        while(st.size()>1){
            help.push(st.pop());
            }
            int top=st.peek();
        while(help.size()>0){
                st.push(help.pop());
            }

        
        return top;
    }
    
    public boolean empty() {
        return (st.size()==0);}
        }
    

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
