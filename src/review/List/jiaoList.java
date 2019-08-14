package review.List;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
public class jiaoList {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        int lenA = 0,lenB = 0;
        ListNode curA = headA,curB = headB;
        while (curA != null){
            lenA++;
            curA = curA.next;
        }
        while (curB != null){
            lenB++;
            curB = curB.next;
        }
        ListNode longNode = null,shortNode = null;
        if (lenA >= lenB){
            longNode = headA;
            shortNode = headB;
        }else {
            longNode = headB;
            shortNode = headA;
        }
        int diff = Math.abs(lenA-lenB);
        while (diff > 0){
            longNode = longNode.next;
            diff--;
        }
        while (longNode != null){
            if (longNode.equals(shortNode)) return longNode;
            longNode = longNode.next;
            shortNode = shortNode.next;
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
