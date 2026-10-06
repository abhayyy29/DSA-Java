package LinkedList;

public class RemoveFirst {
    public static class Node{
        int data;
        Node next;
    }

        public static class LL{
            Node head;
            Node tail;
            int size;

            public void addlast(int val){
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

            void display(){
                Node temp =  head ;
                while(temp != null){
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                }
                System.out.println();
            }

            void removeFirst(){
                if(size == 0){
                    System.out.println("List is Empty");
                }else if(size == 1){
                    head = tail = null;
                    size = 0;
                }else{
                    head = head.next;
                    size --;
                }
            }
        }
        public static void main(String[] args) {
            RemoveFirst obj = new RemoveFirst();
        LL list = new LL();

        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        list.addlast(40);

        list.display();
        list.removeFirst();
        list.display();

    }
}
    
