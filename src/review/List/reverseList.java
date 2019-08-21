package review.List;

public class reverseList {
    public ListNode ReverseList(ListNode head){
        ListNode cur = head;
        ListNode node = null;
        ListNode result = null;
        while (cur != null){
            node = cur;
            cur = cur.next;
            node.next = result;
            result = node;
        }
        return result;
    }
    public static ListNode reverses(ListNode head){
        if (head == null){
            return null;
        }
        ListNode p1 = null;
        ListNode p2 = head;
        ListNode p3 = head.next;
        while (p2 != null){
            p2.next = p1;
            p1= p2;
            p2 = p3;
            if (p3 != null)
                p3 = p3.next;
        }
        return p1;
    }
}
