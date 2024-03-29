package LeetCode;


public class addTwoNumber {
    public static ListNode AddTwoNumber(ListNode l1,ListNode l2){
        ListNode result = new ListNode(-1);
        ListNode p = l1;
        ListNode q = l2;
        ListNode cur = result;
        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (carry > 0){
            cur.next = new ListNode(carry);
        }
        return result.next;
    }
}
