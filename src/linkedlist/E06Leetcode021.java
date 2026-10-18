package linkedlist;

import java.util.Objects;

public class E06Leetcode021 {

    public static ListNode mergeTwoList(ListNode p1,ListNode p2){
        if(p1 == null){
            return p1;
        }

        if(p2 == null){
            return p2;
        }

        if(p1.val<p2.val){
            p1.next = mergeTwoList1(p1.next,p2);
            return p1;
        }else{
            p2.next = mergeTwoList1(p1,p2.next);
            return p2;
        }

    }

    public static ListNode mergeTwoList1(ListNode p1,ListNode p2){

        ListNode result = new ListNode(-1,null);
        ListNode currPoint = result;
        ListNode a = p1;
        ListNode b = p2;

        while (a != null && b!= null){

            int val ;

            if(a.val < b.val){
               val = a.val;
               a = a.next;
            }else{
                val = b.val;
                b = b.next;
            }
            currPoint.next= new ListNode(val,null);
            currPoint = currPoint.next;
      }


        if(a!=null){
            currPoint.next = a;
        }

        if(b != null){
            currPoint.next = b;
        }

        return result.next;



    }

    public static void main(String[] args) {
        ListNode p1 = ListNode.of(1,3,8,9);
        ListNode p2 = ListNode.of(2,4);
        System.out.println(mergeTwoList(p1,p2));
    }
}
