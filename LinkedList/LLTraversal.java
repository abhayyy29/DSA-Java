package LinkedList;

import java.util.ArrayList;
import java.util.List;

import LinkedList.AddLast.Node;

public class LLTraversal {
    public static  List<Integer> llTraversal(Node head){
        ArrayList<Integer> ans = new ArrayList<>();

        Node temp = head;
        while(temp != null){
            ans.add(temp.data);
            temp = temp.next;
        }

        return  ans;
    }

    public static void main(String[] args) {
       Node head = new Node(5);
       head.next = new Node(4);
       head.next.next = new Node(3);
       head.next.next.next = new Node(2);

       List<Integer> ans = llTraversal(head);

       System.out.println(ans);

    }
}
