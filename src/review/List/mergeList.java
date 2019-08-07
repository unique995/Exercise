package review.List;

public class mergeList {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode ret = null;
        if (list1.val > list2.val){
            ret = list2;
            ret.next = Merge(list1,list2.next);
        }else {
            ret = list1;
            ret.next = Merge(list1.next,list2);
        }
        return ret;
    }
    public static ListNode Merge1(ListNode list1,ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode result = null;
        ListNode last = null;
        while (cur1 != null && cur2 != null){
            if (cur1.val <= cur2.val){
                if (result == null){
                    result  = cur1;
                }else
                    last.next = cur1;
                last = cur1;
                cur1 = cur1.next;
            }else {
                if (result == null){
                    result = cur2;
                }else
                    last.next = cur2;
                last = cur2;
                cur2 = cur2.next;
            }
        }
        if (cur1 != null){
            last.next = cur1;
        }else
            last.next = cur2;
        return result;
    }
    public static void print(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);

        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        Merge(n1, n5);
        print(n1);
    }
}
