package linkedlist;

public class E04LeetCode83 {

    public static ListNode deleteDuplicates1(ListNode head){
        if(head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2;

        while ((p2 = p1.next) != null){
            if(p1.val == p2.val){
                p1.next = p2.next;
            }else{
                p1 = p1.next;
            }
        }
        return head;
    }

    public static ListNode deleteDuplicates(ListNode p){
        if(p==null || p.next == null){
            return p;
        }
        if(p.val == p.next.val){
            return deleteDuplicates(p.next);
        }else{
            p.next = deleteDuplicates(p.next);
            return p;
        }
    }

    public static void main(String[] args) {
        ListNode head = ListNode.of(1,1,2,3,3);
        System.out.println(head);
        System.out.println(deleteDuplicates(head));

    }


}
