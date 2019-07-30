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
}
