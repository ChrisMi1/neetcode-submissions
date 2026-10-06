class MinStack {
    int [] stack;
    int head;
    int size;
    int capacity;
    int [] min;

    public MinStack() {
        capacity = 16;
        stack = new int[capacity];
        head = 0;
        size = 0;
        min = new int[capacity];
    }
    
    public void push(int val) {
        if (size == capacity) {
            capacity *= 2;
            int [] temp = new int[capacity];
            int [] tempMin = new int[capacity];
            
            for (int i = 0; i < size; i++) {
                temp[i] = stack[i];
            }
            
            for (int i = 0; i < size; i++) {
                tempMin[i] = min[i];
            }
            
            temp[head++] = val;
            size++;
            stack = temp;
            min = tempMin;
        } else {
            stack[head++] = val;
            size++;
        }

        calculateMin();
    }

    private void calculateMin() {
        if (size == 1) min[size - 1] = stack[head - 1];
        else {
            int prevMin = Math.min(min[size - 2],stack[head - 1]);
            min[size - 1] = prevMin;
        }
       
    }
    
    public void pop() {
        if (size == 0) {
            return;
        }

        head--;
        size--;
    }
    
    public int top() {
        if (size == 0) {
            return -1;
        }
        
        return stack[head - 1];
    }
    
    public int getMin() {
        if (size == 0) {
            return -1;
        }

        return min[size - 1];

    }
}
