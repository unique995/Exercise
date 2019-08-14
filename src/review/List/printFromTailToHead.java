package review.List;

public class printFromTailToHead {
    public static void printList(ListNode head){
        if (head == null){
            return;
        }
        ListNode cur = head;
        ListNode end = null;
        while (end != head){
            cur = head;
            while (cur.next != end){
                cur = cur.next;
            }
            System.out.println(cur.val);
            end = cur;
        }
    }
//    public static ListNode reverse(ListNode head){
//        ListNode cur = head;
//        ListNode tail = null;
//        ListNode del = null;
//        while (cur != null){
//            del = cur;
//            cur = cur.next;
//            del.next = tail;
//            tail = del;
//        }
//        return tail;
//    }
    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
       // printList(node1);
        //print(reverse(node1));


    }
}
