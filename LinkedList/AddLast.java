package LinkedList;

public class AddLast {
    public static class Node{
        int data;
        Node next;

        public static class LinkedList{
           Node head;
           Node tail;
           int size;

           void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
           }
        
        public  void printList(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
           LinkedList list = new LinkedList();
           list.addLast(10);
           list.addLast(20);
           list.addLast(30);

           list.printList();
        }
    }
}
}
