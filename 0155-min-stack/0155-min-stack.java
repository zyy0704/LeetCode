class MinStack {
    Stack<Integer> stack;
    List<Integer> list;

    public MinStack() {
        list = new ArrayList<>();
        stack = new Stack<>();
        
    }
    
    public void push(int val) {
        // stack = new Stack<>();
        // list.add(val);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list.get(0));
        // stack.addAll(list);
        stack.push(val);
        list.add(val);
    }
    
    public void pop() {
        stack.pop();
        list.remove(list.size() - 1);
        
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        List<Integer> ordered = new ArrayList<>(list);
        Collections.sort(ordered);
        return ordered.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */