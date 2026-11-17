package LinkedList;

public class OddEven  {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList{

    Node head;
    Node tail;
    int  size;

           public void addlast(int val){
             Node temp = new Node(val);
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
                Node temp = new Node(val);
                temp.data = val;
                temp.next = head;

                head = temp;

                if(size == 0){
                    head = tail = temp;
                }
                size++;    
            }

            public void addAt(int idx, int val){

                Node node = new Node(val);
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

            public  int kthFromLast(int k){
                Node s = head;
                Node f = head;

                for(int i=0; i<k; i++){
                    f=f.next;
                }

                while(f != tail){
                    s= s.next;
                    f= f.next;
                }
                return s.data;
            }

            public int mid(){
                Node s = head;
                Node f = head;

                while(f.next != null && f.next.next != null){
                    s= s.next;
                    f= f.next.next;
                }
                return s.data;
            }

            public static LinkedList mergeTwoSortedLL(LinkedList l1, LinkedList l2){
                Node one = l1.head;
                Node two = l2.head;

                LinkedList res = new LinkedList();

                while(one != null && two != null){
                    if(one.data < two.data){
                        res.addlast(one.data);
                        one = one.next;
                    }else{
                        res.addlast(two.data);
                        two  = two.next;
                    }
                }
                while(one != null){
                    res.addlast(one.data);
                    one = one.next;
                }

                 while(two != null){
                    res.addlast(two.data);
                    two = two.next;
                }

                return res;
            }

            public static Node midNode(Node head, Node tail){
                Node s = head;
                Node f = head;

                while(f != tail && f.next != tail){
                    f =  f.next.next;
                    s = s.next;
                }

                return s;
            }
            public  static LinkedList mergeSort(Node head, Node tail){
                if(head == tail){
                    LinkedList br = new LinkedList();
                    br.addlast(head.data);
                    return br;
                }
                Node mid = midNode(head, tail);
                LinkedList fsh = mergeSort(head, mid);
                LinkedList ssh = mergeSort(mid.next, tail);

                LinkedList cl = LinkedList.mergeTwoSortedLL(fsh, ssh);

                return cl;
            }

            public void oddEven(){
               LinkedList odd = new LinkedList();
               LinkedList even = new LinkedList();

               while(this.size > 0){
                int val = this.getFirst();
                this.removeFirst();

                if(val % 2 == 0){
                    even.addlast(val);
                }else{
                    odd.addlast(val);
                }
               }

               if(odd.size > 0 && even.size > 0){
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
               }else if(odd.size > 0){
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
               }else if(even.size > 0){
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
               }
            }
        }
            

         public static void main(String[] args) {

        LinkedList ab = new LinkedList();
        ab.addlast(4);
        ab.addlast(7);
        ab.addlast(8);
        ab.addlast(5);
        ab.addlast(2);
        ab.addlast(3);

        ab.oddEven();
        ab.display();

        

        //  LinkedList l1 = new LinkedList();
        // l1.addlast(10);
        // l1.addlast(30);
        // l1.addlast(70);
        // l1.addlast(50);
        // l1.addFirst(05);

        // LinkedList l2 = new LinkedList();
        // l2.addFirst(07);
        // l2.addlast(15);
        // l2.addlast(35);
        // l2.addlast(45);
        

        // System.out.println(ab.getFirst());
        // System.out.println(ab.getLast());
        // System.out.println(ab.getAt(2));
    //    LinkedList res = l1.mergeSort(l1.head,l1.tail);
    //    res.display();
        
        
    }
        }
    
    




