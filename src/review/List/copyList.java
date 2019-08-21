package review.List;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;
    Node(int x) {
        this.val = x;
        this.next = null;
        this.random = null;
    }
}
public class copyList {
    public Node copy(Node head){
        if (head == null){
            return null;
        }

        Node first = new Node(-1);
        Node tail = first;
        HashMap<Node,Node> map = new HashMap<>();
        Node p = head;

        while (p != null){
            Node q = new Node(p.val);
            tail.next = q;
            tail = tail.next;
            map.put(p,q);
            p = p.next;
        }

        p = head;
        Node q = first.next;
        while (p != null){
            q.random = map.get(p.random);
            p = p.next;
            q = q.next;
        }
        return first.next;
    }
    public Node copy1(Node head){
        if (head == null){
            return null;
        }

        Node p = head;
        while (p != null){
            Node q = new Node(p.val);
            q.next = p.next;
            p.next = q;
            p = q.next;
        }
        p = head;
        while (p != null){
            Node q = p.next;
            if (p.random != null){
                q.random = p.random.next;
            }else {
                q.random = null;
            }
            p = q.next;
        }
        p = head;
        Node first = head.next;
        while (p != null){
            Node q = p.next;
            p.next = q.next;
            if (q.next != null){
                q.next = q.next.next;
            }else {
                q.next = null;
            }
        }
        return first;
    }

}
