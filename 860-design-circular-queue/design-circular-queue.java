class MyCircularQueue {
    int k;
    int [] arr;
    int front,rear;

    public MyCircularQueue(int k) {
        this.k=k;
        arr = new int[k];
        front=rear=-1;
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()){
            front=0;
        }
        rear= (rear+1)%k;
        arr[rear]=value;
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        int temp = arr[front];
        if(front==rear){
            front=rear=-1;
            return true;
        }
        front=(front+1)%k;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
        
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
         return arr[rear];
    }
    
    public boolean isEmpty() {
        return front==-1;

        
    }
    
    public boolean isFull() {
        if(front==0 && rear==k-1) return true;
        if(rear+1==front)return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */