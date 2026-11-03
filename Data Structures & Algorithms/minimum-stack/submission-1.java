class MinStack {
    Deque<Integer> mainStack;
    Deque<Integer> minStack;

    public MinStack() {
        this.mainStack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(!minStack.isEmpty()){
            if(minStack.peek() > val){
                minStack.push(val);
            }else{
                minStack.push(minStack.peek());
            }
        }else{
            minStack.push(val);
        }
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
