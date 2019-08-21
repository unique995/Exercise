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

    public static void main(String[] args) {

    }
}
