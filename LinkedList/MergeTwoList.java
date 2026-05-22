
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class MergeTwoList {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 !=null){
            if (list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;

            }else{
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if (list1 == null) return list2;

        return list1;
    }
    
        public static void main(String[] args) {
        ListNode head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);
    }
}
