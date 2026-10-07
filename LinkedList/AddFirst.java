package LinkedList;

public class AddFirst {
    public static class Node{
        int data;
        Node next;
    }

    public  static class LinkedList{
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

            public int getFirst(){
                if(size ==  0){
                    System.out.println("List is empty");
                    return -1;
                }else{
                    return head.data;
                }
            }

            public int getLast(){
                if(size == 0){
                    System.out.println("List is empty");
                    return -1;
                }else{
                    return tail.data;
                }
            }

            public int getAt(int idx){
                if(size == 0){
                    System.out.println("List is empty");
                    return -1;
                }else if(idx < 0 || idx > size){
                    System.out.println("Invalid Argument");
                    return -1;
                }else{
                    Node temp = head;
                    for(int i =0; i< idx; i++){
                        temp = temp.next;
                    }
                    return temp.data;
                }
            }

            public void addFirst(int val){
                Node temp = new Node();
                temp.data = val;
                temp.next = head;

                head = temp;

                if(size == 0){
                    head = tail = temp;
                }
                size++;    
            }
    }
    public static void main(String[] args) {
        GetValue obj = new GetValue();

        LinkedList ab = new LinkedList();
        ab.addlast(10);
        ab.addlast(30);
        ab.addlast(50);
        ab.addlast(70);

        // System.out.println(ab.getFirst());
        // System.out.println(ab.getLast());
        // System.out.println(ab.getAt(2));
        ab.addFirst(5);
        ab.display();

    }
}

