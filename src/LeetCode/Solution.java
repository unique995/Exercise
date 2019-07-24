package LeetCode;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class Solution {
    public boolean hasCycle(ListNode head) {
            if (head == null)
                return false;
            if (head.next == head)
                return true;
            ListNode quickNode = head;
            ListNode slowNode = head;
            while (quickNode != null){
                if (quickNode.next == null)
                    return false;
                slowNode = slowNode.next;
                quickNode = quickNode.next;
                if (quickNode == slowNode)
                    return true;
            }
            return false;

    }
    public ListNode detectCycle(ListNode head) {
        int pos = 0;
        if (head == null)
            return null;
        if (head.next == head)
            System.out.println("tail connects to node index"+pos);
        ListNode quickNode = head;
        ListNode slowNode = head;
        while (quickNode != null){
            if (quickNode.next == null)
                return null;
            slowNode = slowNode.next;
            pos++;
            quickNode = quickNode.next;
            if (quickNode == slowNode)
                return slowNode;
            System.out.println("tail connects to node index"+pos);
        }
        return null;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        ListNode cur = head;
        while (cur.next.next != null){
            cur = cur.next;
        }
        cur.val = cur.next.val;
        cur.next = cur.next.next;
        return head;
    }

}
