package linkedlist;

public class E02LeetCode203 {

    public static ListNode removeElements1(ListNode head, int val){
        ListNode s = new ListNode(-1,head);
        ListNode p1 = s;
        ListNode p2;

        while ((p2 = p1.next) != null){
            if(p2.val ==val){
                p1.next = p2.next;
            }else{
                p1 = p2;
            }
        }
        return s.next;
    }

    public static ListNode removeElements(ListNode p,int val){
        if(p==null){
            return null;
        }
        if(p.val == val){
            return removeElements(p.next,val);
        }else{
            p.next =removeElements(p.next,val);
            return p;
        }

    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(6,null);
        ListNode o4 = new ListNode(3,o5);
        ListNode o3 = new ListNode(6,o4);
        ListNode o2 = new ListNode(2,o3);
        ListNode o1 = new ListNode(1,o2);

        System.out.println(o1);
        System.out.println(removeElements(o1,6));
    }
}
