class MyLinkedList {
    class Node {
       int val;
       Node next;
       public Node(int val){
        this.val=val;
      }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head = null;
        size =0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size)
          return -1;
          Node temp = head;
        for(int i= 0; i<index; i++){
             temp=temp.next;
        }
        
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
        return;
        
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head= newNode;
            size++;
            return;
        }
         Node temp = head;
         while(temp.next!=null){
               temp = temp.next;
         }
         temp.next = newNode;
         size++;
         return;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if(index<0||index>size)return;
        if(index ==0){
            newNode.next= head;
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        for(int i = 0; i<index-1 && temp.next!=null; i++){
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next=newNode;
        size++;
        return;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index >= size) return;
        if(index==0){
            head = head.next;
            size--;
            return;
        }
        Node temp =head;
        for(int i =0; i<index-1 && temp.next.next!=null; i++)
        temp= temp.next;
        temp.next=temp.next.next;
        size--;
       return;
    }
       
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */