package linkedlist;

import java.util.Objects;

public class E05LeetCode82 {

    public static ListNode deleteDuplicates(ListNode p){
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
        ListNode head = ListNode.of(1,2,3,4,5);
        System.out.println(head);
        System.out.println(deleteDuplicates(head));
    }
}
