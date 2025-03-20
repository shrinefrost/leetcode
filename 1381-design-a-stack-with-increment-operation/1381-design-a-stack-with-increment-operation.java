class CustomStack {
    int maxSize;
    int top=-1;
    int[] arr;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(top<maxSize-1){
            top++;
            arr[top] = x;
        }
        else{
            System.out.println("stack is full");
        }
    }
    
    public int pop() {
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            int result = arr[top];
            top--;
            return result;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        if(top==-1) return;
        for(int i =0;i<k && i<=top;i++){
            arr[i]+=val;
        }

    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */