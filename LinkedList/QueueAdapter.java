package LinkedList;

public class QueueAdapter {
      static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public int size(){
        return size;
    }

    public void add ( int val){
        Node temp = new Node(val);
        if(size == 0){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int remove(){
        if(size == 0){
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = head.data;
        head = head.next;
        size--;

        if(size == 0){
            tail = null;
        }
        return val;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        QueueAdapter q =  new QueueAdapter();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
