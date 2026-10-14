package LinkedList;


public class LinkedListStack {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size;

 
    public void push(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

    
    public int pop() {
        if (size == 0) {
            System.out.println("Stack underflow");
            return -1;
        }

        int val = head.data;
        head = head.next;
        size--;

        return val;
    }

   
    public int peek() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return -1;
        }

        return head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();                 
        System.out.println(st.peek()); 
        System.out.println(st.pop());  
        System.out.println(st.peek()); 
        System.out.println(st.size()); 
    }
}

