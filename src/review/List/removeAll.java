package review.List;

public class removeAll {
    public static ListNode RemoveAll(ListNode head,int val){
        if (head == null){
            return null;
        }
        ListNode cur = head;
        ListNode del = new ListNode(-1);
        ListNode tail = del;
        while (cur != null){
            if (cur.val == val){
                cur = cur.next;
            }else {
                del.next = cur;
                del = del.next;
                cur = cur.next;
            }
        }
        del.next = null;
        return tail.next;
    }
    public static ListNode reversee(ListNode head){
        if (head == null){
            return null;
        }
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
    public static void main(String[] args) {

    }
}
