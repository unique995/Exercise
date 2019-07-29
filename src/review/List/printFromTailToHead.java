package review.List;



public class printFromTailToHead {
    public void printList(ListNode head){
        if (head == null){
            return;
        }
        ListNode cur = head;
        while (cur != null){
            cur = cur.next;

        }
    }
    public static void main(String[] args) {

    }
}
