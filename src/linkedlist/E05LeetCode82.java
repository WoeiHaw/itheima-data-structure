package linkedlist;

import java.util.Objects;

public class E05LeetCode82 {

    public static ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode s = new ListNode(-1,head);
        ListNode p1 = s;
        ListNode p2,p3;
        while ((p2=p1.next) != null && (p3=p2.next)!=null){
            if(Objects.equals(p2.val, p3.val)){
                while ((p3 = p3.next) != null && Objects.equals(p3.val, p2.val)){

                }
                p1.next = p3;
            }else{
                p1 = p1.next;
            }
        }

        return s.next;

    }

    public static ListNode deleteDuplicates2(ListNode p){
        if(p == null || p.next == null){
            return p;
        }
        if(Objects.equals(p.val, p.next.val)){
            ListNode x = p.next.next;
            while (x != null && Objects.equals(x.val, p.val)){
                x = x.next;
            }
            return deleteDuplicates2(x);
        }else{
            p.next = deleteDuplicates2(p.next);
            return p;
        }
    }

    public static ListNode deleteDuplicates1(ListNode p){
        if(p == null || p.next == null){
            return p;
        }
        ListNode s = new ListNode(-1,p);
        ListNode p1 = s;
        ListNode p2 = p1.next;
        ListNode p3 = p2.next;

      while (p3 != null){

          if(Objects.equals(p2.val, p3.val)){
              p3 = p3.next;
              if(p3 == null){
                  p1.next = p3;
              }
          }
          else{
              if(p2.next !=p3){
                  p2  = p3;
              }else{
                  p1 = p2;
                  p2 = p1.next;
              }
              p3 = p2.next;
              p1.next = p2;

          }
      }
        return s.next;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.of(1,1,1,2,3,4,5,5,5);
        System.out.println(head);
        System.out.println(deleteDuplicates(head));
    }
}
