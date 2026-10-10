package LinkedList;

public class ReverseLLPI {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
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

            public void addAt(int idx, int val){

                Node node = new Node();
                node.data = val;
            
                Node temp = head;

                for(int i=0; i< idx - 1; i++){
                    temp = temp.next;
                }

                node.next = temp.next;
                temp.next = node;
            }

            public  void removeLast(){
                if(size == 0){
                    System.out.println("List is empty");
                }else if(size == 1){
                    head = tail = null;
                }else{
                    Node temp  = head;

                    for(int i =0; i < size - 2; i++){
                        temp = temp.next;
                    }

                    tail = temp;
                    temp.next = null;
                    size--;
                }
            }

            private Node getNodeAt(int idx){
                Node temp = head;

                for(int i =0; i< idx; i++){
                    temp = temp.next;
                }
                return temp;
            }

            public  void reverseDi(){
                int li = 0;
                int ri = size - 1;

                while(li < ri){
                     Node left = getNodeAt(li);
                     Node right = getNodeAt(ri);

                     int temp = left.data;
                     left.data = right.data;
                     right.data  = temp;

                     li++;
                     ri--;
                }
            }

            public void reversePi(){
                Node prev = null;
                Node curr =  head;

                while(curr != null){
                    Node next = curr.next;
                    curr.next = prev;

                    prev = curr;
                    curr = next;
                    
                }

                Node temp = head;
                head = tail;
                tail = temp;
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
        ab.display();
        ab.reversePi();
        ab.display();
    }
    }


