package review.List;

public class mergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
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
}
